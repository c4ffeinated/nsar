// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/Promise.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneModule.java

/*

used in :



*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneNavigatorModule.java

/*

used in :

    @ReactMethod
    public void stopVideoRecording(final int sceneNavTag, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (!(sceneView instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Viro: Attempted to call startVideoRecording on a non-ARSceneNav view!");
                }
                VRTARSceneNavigator scene = (VRTARSceneNavigator) sceneView;

                // Grab the recorder from the ar scene view
                final ViroMediaRecorder recorder = scene.getARView().getRecorder();
                if (recorder == null){
                    WritableMap returnMap = Arguments.createMap();
                    returnMap.putBoolean(RECORDING_SUCCESS_KEY, false);
                    returnMap.putInt(RECORDING_ERROR_KEY, UNSUPPORTED_PLATFORM_ERROR);
                    returnMap.putString(RECORDING_URL_KEY, null);
                    promise.resolve(returnMap);
                    return;
                }

                // Construct a completion delegate callback to be notified of the result of the recording.
                final ViroMediaRecorder.VideoRecordingFinishListener completionCallback =
                        new ViroMediaRecorder.VideoRecordingFinishListener() {
                    @Override
                    public void onError(Error error) {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putBoolean(RECORDING_SUCCESS_KEY, false);
                        returnMap.putInt(RECORDING_ERROR_KEY, error.toInt());
                        returnMap.putString(RECORDING_URL_KEY, null);
                        promise.resolve(returnMap);
                    }

                    @Override
                    public void onSuccess(String url) {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putBoolean(RECORDING_SUCCESS_KEY, true);
                        returnMap.putInt(RECORDING_ERROR_KEY, Error.NONE.toInt());
                        returnMap.putString(RECORDING_URL_KEY, url);
                        promise.resolve(returnMap);
                    }
                };

                // Stop recording if we have the right permissions
                checkPermissionsAndRun(new PermissionListener() {
                    @Override
                    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
                        recorder.stopRecordingAsync(completionCallback);
                        return true;
                    }
                }, true);
            }
        });
    }

    @ReactMethod
    public void takeScreenshot(final int sceneNavTag, final String fileName,
                               final boolean saveToCameraRool, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (!(sceneView instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Viro: Attempted to call startVideoRecording on a non-ARSceneNav view!");
                }
                VRTARSceneNavigator scene = (VRTARSceneNavigator) sceneView;

                // Grab the recorder from the ar scene view
                final ViroMediaRecorder recorder = scene.getARView().getRecorder();
                if (recorder == null){
                    WritableMap returnMap = Arguments.createMap();
                    returnMap.putBoolean(RECORDING_SUCCESS_KEY, false);
                    returnMap.putInt(RECORDING_ERROR_KEY, UNSUPPORTED_PLATFORM_ERROR);
                    returnMap.putString(RECORDING_URL_KEY, null);
                    promise.resolve(returnMap);
                    return;
                }

                // Construct a completion delegate callback to be notified of sceenshot results.
                final ViroMediaRecorder.ScreenshotFinishListener callback = new ViroMediaRecorder.ScreenshotFinishListener() {
                    @Override
                    public void onError(Error error) {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putBoolean(RECORDING_SUCCESS_KEY, false);
                        returnMap.putInt(RECORDING_ERROR_KEY, error.toInt());
                        returnMap.putString(RECORDING_URL_KEY, null);
                        promise.resolve(returnMap);
                    }

                    @Override
                    public void onSuccess(Bitmap bitmap, String url) {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putBoolean(RECORDING_SUCCESS_KEY, true);
                        returnMap.putInt(RECORDING_ERROR_KEY, Error.NONE.toInt());
                        returnMap.putString(RECORDING_URL_KEY, url);
                        promise.resolve(returnMap);
                    }
                };
                
                // Schedule taking a screen shot if we have the right permission
                checkPermissionsAndRun(new PermissionListener() {
                    @Override
                    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
                        recorder.takeScreenShotAsync(fileName, saveToCameraRool, callback);
                        return true;
                    }
                }, false);
            }
        });
    }

    @ReactMethod
    public void project(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRTARSceneNavigator) {
                    VRTARSceneNavigator sceneNavigator = (VRTARSceneNavigator) view;
                    float[] projectPoint = {0,0,0};
                    projectPoint[0] = (float)point.getDouble(0);
                    projectPoint[1] = (float)point.getDouble(1);
                    projectPoint[2] = (float)point.getDouble(2);
                    Vector projectedPoint = sceneNavigator.projectPoint(new Vector(projectPoint[0], projectPoint[1], projectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(projectedPoint.x);
                    writablePosArray.pushDouble(projectedPoint.y);
                    returnMap.putArray("screenPosition", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

    @ReactMethod
    public void unproject(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRTARSceneNavigator) {
                    VRTARSceneNavigator sceneNavigator = (VRTARSceneNavigator) view;
                    float[] unprojectPoint = {0,0,0};
                    unprojectPoint[0] = (float)point.getDouble(0);
                    unprojectPoint[1] = (float)point.getDouble(1);
                    unprojectPoint[2] = (float)point.getDouble(2);
                    Vector unProjectedPoint = sceneNavigator.unprojectPoint(new Vector(unprojectPoint[0], unprojectPoint[1], unprojectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(unProjectedPoint.x);
                    writablePosArray.pushDouble(unProjectedPoint.y);
                    writablePosArray.pushDouble(unProjectedPoint.z);
                    returnMap.putArray("position", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\CameraModule.java

/*

used in :

    @ReactMethod
    public void getCameraOrientation(final int sceneTag, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(sceneTag);
                if (sceneView instanceof VRTScene) {
                    VRTScene scene = (VRTScene) sceneView;

                    scene.getCameraPositionAsync(new CameraCallback() {
                        @Override
                        public void onGetCameraOrientation(float posX, float poxY, float posZ,
                                                           float rotEulerX, float rotEulerY, float rotEulerZ,
                                                           float forwardX, float forwardY, float forwardZ,
                                                           float upX, float upY, float upZ) {
                            WritableArray array = Arguments.createArray();
                            array.pushDouble(posX);
                            array.pushDouble(poxY);
                            array.pushDouble(posZ);
                            array.pushDouble(Math.toDegrees(rotEulerX));
                            array.pushDouble(Math.toDegrees(rotEulerY));
                            array.pushDouble(Math.toDegrees(rotEulerZ));
                            array.pushDouble(forwardX);
                            array.pushDouble(forwardY);
                            array.pushDouble(forwardZ);
                            array.pushDouble(upX);
                            array.pushDouble(upY);
                            array.pushDouble(upZ);
                            promise.resolve(array);
                        }
                    });
                }


            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ControllerModule.java

/*

used in :

    @ReactMethod
    public void getForwardVectorAsync(final int viewTag, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View controllerView = nativeViewHierarchyManager.resolveView(viewTag);
                if (controllerView instanceof VRTController) {
                    VRTController controller = (VRTController) controllerView;
                    controller.getForwardVectorAsync(new Controller.ControllerJniCallback() {
                        @Override
                        public void onGetForwardVector(float x, float y, float z) {
                            WritableArray array = Arguments.createArray();
                            array.pushDouble(x);
                            array.pushDouble(y);
                            array.pushDouble(z);
                            promise.resolve(array);
                        }
                    });
                }
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\NodeModule.java

/*

used in :

    @ReactMethod
    public void getNodeTransform(final int viewTag, final Promise promise)
     {
         UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
         uiManager.addUIBlock(new UIBlock() {
             @Override
             public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                 View viroView = nativeViewHierarchyManager.resolveView(viewTag);
                 VRTNode nodeView = (VRTNode) viroView;
                 if (!(viroView instanceof VRTNode)){
                     throw new IllegalViewOperationException("Invalid view, expected VRTNode!");
                 }

                 Node nodeJNI = nodeView.getNodeJni();
                 Matrix matrix = nodeJNI.getWorldTransformRealTime();
                 Vector scale = matrix.extractScale();
                 Vector position = matrix.extractTranslation();
                 Vector rotation = matrix.extractRotation(scale).toEuler();

                 WritableMap returnMap = Arguments.createMap();
                 WritableArray writablePosArray = Arguments.createArray();
                 writablePosArray.pushDouble(position.x);
                 writablePosArray.pushDouble(position.y);
                 writablePosArray.pushDouble(position.z);

                 WritableArray writableRotateArray = Arguments.createArray();
                 writableRotateArray.pushDouble(toDegrees(rotation.x));
                 writableRotateArray.pushDouble(toDegrees(rotation.y));
                 writableRotateArray.pushDouble(toDegrees(rotation.z));

                 WritableArray writeableScaleArray = Arguments.createArray();
                 writeableScaleArray.pushDouble(scale.x);
                 writeableScaleArray.pushDouble(scale.y);
                 writeableScaleArray.pushDouble(scale.z);

                 returnMap.putArray("position", writablePosArray);
                 returnMap.putArray("rotation", writableRotateArray);
                 returnMap.putArray("scale", writeableScaleArray);
                 promise.resolve(returnMap);
            }
         });
    }

    @ReactMethod
    public void getBoundingBox(final int viewTag, final Promise promise)
    {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View viroView = nativeViewHierarchyManager.resolveView(viewTag);
                VRTNode nodeView = (VRTNode) viroView;
                if (!(viroView instanceof VRTNode)){
                    throw new IllegalViewOperationException("Invalid view, expected VRTNode!");
                }

                Node nodeJNI = nodeView.getNodeJni();
                BoundingBox box = nodeJNI.getBoundingBox();

                WritableMap returnMap = Arguments.createMap();
                WritableMap boundingBoxMap = Arguments.createMap();
                boundingBoxMap.putDouble("minX", box.minX);
                boundingBoxMap.putDouble("maxX", box.maxX);
                boundingBoxMap.putDouble("minY", box.minY);
                boundingBoxMap.putDouble("maxY", box.maxY);
                boundingBoxMap.putDouble("minZ", box.minZ);
                boundingBoxMap.putDouble("maxZ", box.maxZ);
                returnMap.putMap("boundingBox", boundingBoxMap);
                promise.resolve(returnMap);
            }
        });
    }

    @ReactMethod
    public void getMorphTargets(final int viewTag, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View viroView = nativeViewHierarchyManager.resolveView(viewTag);
                VRT3DObject nodeView = (VRT3DObject) viroView;
                if (!(viroView instanceof VRT3DObject)) {
                    throw new IllegalViewOperationException("Invalid view, expected VRT3DObject!");
                }
                Object3D node = (Object3D)nodeView.getNodeJni();
                Set<String> keys = node.getMorphTargetKeys();
                WritableMap returnMap = Arguments.createMap();
                WritableArray targets = Arguments.createArray();
                for (String key : keys) {
                    targets.pushString(key);
                }
                returnMap.putArray("targets", targets);
                promise.resolve(returnMap);
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SceneModule.java

/*

used in :

    @ReactMethod
    public void findCollisionsWithRayAsync(final int viewTag, final ReadableArray fromPos, final ReadableArray toPos,
                               final boolean closest, final String tag, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(sceneView instanceof VRTScene)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling findCollisionsWithRayAsync: expected a ViroScene!");
                }

                float[] fromPosArray = Helper.toFloatArray(fromPos);
                float[] toPosArray = Helper.toFloatArray(toPos);
                if (fromPosArray.length != 3 || toPosArray.length !=3){
                    throw new IllegalViewOperationException("Invalid From / To positions or tag " +
                            "provided for findCollisionsWithRayAsync!");
                }

                String rayCastTag = tag != null ? tag : "";
                VRTScene scene = (VRTScene) sceneView;
                scene.findCollisionsWithRayAsync(fromPosArray, toPosArray, closest, rayCastTag,
                        new PhysicsWorld.HitTestListener() {
                            @Override
                            public void onComplete(boolean hasHit) {
                                promise.resolve(hasHit);
                            }
                        });

            }
        });
    }

    @ReactMethod
    public void findCollisionsWithShapeAsync(final int viewTag, final ReadableArray fromPos, final ReadableArray toPos,
                               final String shapeTypeString, final ReadableArray paramsArray,
                               final String tag, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(sceneView instanceof VRTScene)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling findCollisionsWithShapeAsync: expected a ViroScene!");
                }

                float[] fromPosArray = Helper.toFloatArray(fromPos);
                float[] toPosArray = Helper.toFloatArray(toPos);
                if (fromPosArray.length != 3 || toPosArray.length !=3){
                    throw new IllegalViewOperationException("Invalid From / To positions or tag " +
                            "provided for findCollisionsWithShapeAsync!");
                }

                float[] params = Helper.toFloatArray(paramsArray);
                String error = PhysicsBody.checkIsValidShapeType(shapeTypeString, params);
                if (error != null){
                    throw new IllegalViewOperationException(error);
                }

                PhysicsShape shape = null;
                if (shapeTypeString.equalsIgnoreCase("sphere")) {
                    shape = new PhysicsShapeSphere(params[0]);
                }
                else if (shapeTypeString.equalsIgnoreCase("box")) {
                    shape = new PhysicsShapeBox(params[0], params[1], params[2]);
                }
                else if (shapeTypeString.equalsIgnoreCase("compound")) {
                    shape = new PhysicsShapeAutoCompound();
                }
                else {
                    throw new JSApplicationCausedNativeException("Invalid shape type [" + shapeTypeString + "]");
                }

                String rayCastTag = tag != null ? tag : "";
                VRTScene scene = (VRTScene) sceneView;
                scene.findCollisionsWithShapeAsync(fromPosArray, toPosArray, shape, rayCastTag,
                        new PhysicsWorld.HitTestListener() {
                            @Override
                            public void onComplete(boolean hasHit) {
                                promise.resolve(hasHit);
                            }
                        });
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SceneNavigatorModule.java

/*

used in :

    @ReactMethod
    public void project(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRTVRSceneNavigator) {
                    VRTVRSceneNavigator sceneNavigator = (VRTVRSceneNavigator) view;
                    float[] projectPoint = {0,0,0};
                    projectPoint[0] = (float)point.getDouble(0);
                    projectPoint[1] = (float)point.getDouble(1);
                    projectPoint[2] = (float)point.getDouble(2);
                    Vector projectedPoint = sceneNavigator.projectPoint(new Vector(projectPoint[0], projectPoint[1], projectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(projectedPoint.x);
                    writablePosArray.pushDouble(projectedPoint.y);
                    returnMap.putArray("screenPosition", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

    @ReactMethod
    public void unproject(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRTVRSceneNavigator) {
                    VRTVRSceneNavigator sceneNavigator = (VRTVRSceneNavigator) view;
                    float[] unprojectPoint = {0,0,0};
                    unprojectPoint[0] = (float)point.getDouble(0);
                    unprojectPoint[1] = (float)point.getDouble(1);
                    unprojectPoint[2] = (float)point.getDouble(2);
                    Vector unProjectedPoint = sceneNavigator.unprojectPoint(new Vector(unprojectPoint[0], unprojectPoint[1], unprojectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(unProjectedPoint.x);
                    writablePosArray.pushDouble(unProjectedPoint.y);
                    writablePosArray.pushDouble(unProjectedPoint.z);
                    returnMap.putArray("position", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SoundModule.java

/*

used in : 

     * This function takes a map of keys to sounds and creates SoundData objects
     * to prefetch the data before storing them in a local map. We currently only
     * support external urls (web-based).
     *
     * @param soundMap a map of String keys to String url's.

    @ReactMethod
    public void preloadSounds(final ReadableMap soundMap, final Promise onSoundPreloadedCallback) {
        ReadableMapKeySetIterator iter = soundMap.keySetIterator();
        while(iter.hasNextKey()) {
            final String key = iter.nextKey();
            ReadableType keyType = soundMap.getType(key);
            String path;
            if (keyType == ReadableType.String){
                path = soundMap.getString(key);
            } else if (keyType == ReadableType.Map && soundMap.getMap(key).hasKey("uri")){
                path = soundMap.getMap(key).getString("uri");
            } else {
                throw new IllegalArgumentException("Invalid preloaded sound path received.");
            }

            // If a promise is provided, create SoundDataInitCallback to notify
            // the javascript layer of when the data has completed preloading.
            SoundData.SoundDataInitializeCallback callback = null;
            if (onSoundPreloadedCallback != null) {
                callback = new SoundData.SoundDataInitializeCallback() {
                    @Override
                    public void onDataIsReady() {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putString("key", key);
                        returnMap.putBoolean("result",true);
                        returnMap.putString("msg","");
                        onSoundPreloadedCallback.resolve(returnMap);
                    }

                    @Override
                    public void onDataError(String errorMsg) {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putString("key", key);
                        returnMap.putBoolean("result",false);
                        returnMap.putString("msg", errorMsg);
                        onSoundPreloadedCallback.resolve(returnMap);
                    }
                };
            }
            mSoundDataMap.put(key, new SoundData(path, callback));
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\VRT3DSceneNavigatorModule.java

/*

used in :

    @ReactMethod
    public void requestExitVr(final int sceneNavTag) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (sceneView instanceof VRT3DSceneNavigator) {
                    VRT3DSceneNavigator scene = (VRT3DSceneNavigator) sceneView;
                    scene.userDidRequestExitVR();
                }
            }
        });
    }

    @ReactMethod
    public void recenterTracking(final int sceneNavTag) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRT3DSceneNavigator) {
                    VRT3DSceneNavigator sceneNavigator = (VRT3DSceneNavigator) view;
                    sceneNavigator.recenterTracking();
                }
            }
        });
    }

    @ReactMethod
    public void project(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRT3DSceneNavigator) {
                    VRT3DSceneNavigator sceneNavigator = (VRT3DSceneNavigator)view;
                    float[] projectPoint = {0,0,0};
                    projectPoint[0] = (float)point.getDouble(0);
                    projectPoint[1] = (float)point.getDouble(1);
                    projectPoint[2] = (float)point.getDouble(2);
                    Vector projectedPoint = sceneNavigator.projectPoint(new Vector(projectPoint[0], projectPoint[1], projectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(projectedPoint.x);
                    writablePosArray.pushDouble(projectedPoint.y);
                    returnMap.putArray("screenPosition", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

    @ReactMethod
    public void unproject(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRT3DSceneNavigator) {
                    VRT3DSceneNavigator sceneNavigator = (VRT3DSceneNavigator) view;
                    float[] unprojectPoint = {0,0,0};
                    unprojectPoint[0] = (float)point.getDouble(0);
                    unprojectPoint[1] = (float)point.getDouble(1);
                    unprojectPoint[2] = (float)point.getDouble(2);
                    Vector unProjectedPoint = sceneNavigator.unprojectPoint(new Vector(unprojectPoint[0], unprojectPoint[1], unprojectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(unProjectedPoint.x);
                    writablePosArray.pushDouble(unProjectedPoint.y);
                    writablePosArray.pushDouble(unProjectedPoint.z);
                    returnMap.putArray("position", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

*/