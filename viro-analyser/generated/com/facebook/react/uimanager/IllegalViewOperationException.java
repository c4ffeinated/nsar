// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/uimanager/IllegalViewOperationException.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNode.java

/*

used in :

    // Parse, check and return a list of valid force props from a given Readable map.
    private ArrayList<ReadableMap> getForcesFromReactMap(ReadableMap map){
        ArrayList<ReadableMap> maps = new ArrayList<ReadableMap>();
        if (map != null && map.hasKey("force")){
            ReadableType type = map.getType("force");
            if (type.equals(ReadableType.Array)){
                ReadableArray reactForceArray = map.getArray("force");
                for (int i =0; i < reactForceArray.size(); i ++){
                    maps.add(reactForceArray.getMap(i));
                }
            } else if (type.equals(ReadableType.Map)){
                maps.add(map.getMap("force"));
            } else if (!type.equals(ReadableType.Null)) {
                throw new IllegalViewOperationException("Invalid force format!");
            }
        }
        return maps;
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneModule.java

/*

used in :

    @ReactMethod
    public void performARHitTestWithRay(final int viewTag, final ReadableArray ray,
                                        final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (sceneView.getParent() == null || !(sceneView.getParent() instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling performARHitTestWithRay: expected ViroARSceneNavigator as parent");
                }

                VRTARSceneNavigator arSceneNavigator = (VRTARSceneNavigator) sceneView.getParent();
                ViroViewARCore arView = arSceneNavigator.getARView();

                if (ray.size() != 3) {
                    promise.resolve(Arguments.createArray());
                    return;
                }

                float[] rayArray = new float[ray.size()];
                rayArray[0] = (float) ray.getDouble(0);
                rayArray[1] = (float) ray.getDouble(1);
                rayArray[2] = (float) ray.getDouble(2);

                arView.performARHitTestWithRay(new Vector(rayArray), new ARHitTestListener() {
                    @Override
                    public void onHitTestFinished(ARHitTestResult[] arHitTestResults) {
                        WritableArray returnArray = Arguments.createArray();
                        for (ARHitTestResult result : arHitTestResults) {
                            returnArray.pushMap(ARUtils.mapFromARHitTestResult(result));
                        }
                        promise.resolve(returnArray);
                    }
                });
            }
        });
    }

    @ReactMethod
    public void performARHitTestWithWorldPoints(final int viewTag, final ReadableArray origin, final ReadableArray destination,
                                        final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (sceneView.getParent() == null || !(sceneView.getParent() instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling performARHitTestWithRay: expected ViroARSceneNavigator as parent");
                }

                VRTARSceneNavigator arSceneNavigator = (VRTARSceneNavigator) sceneView.getParent();
                ViroViewARCore arView = arSceneNavigator.getARView();

                if ((origin.size() != 3) || (destination.size() != 3)) {
                    promise.resolve(Arguments.createArray());
                    return;
                }

                float[] originArray = new float[origin.size()];
                originArray[0] = (float) origin.getDouble(0);
                originArray[1] = (float) origin.getDouble(1);
                originArray[2] = (float) origin.getDouble(2);

                float[] destArray = new float[destination.size()];
                destArray[0] = (float) destination.getDouble(0);
                destArray[1] = (float) destination.getDouble(1);
                destArray[2] = (float) destination.getDouble(2);

                arView.performARHitTestWithRay(new Vector(originArray), new Vector(destArray), new ARHitTestListener() {
                    @Override
                    public void onHitTestFinished(ARHitTestResult[] arHitTestResults) {
                        WritableArray returnArray = Arguments.createArray();
                        for (ARHitTestResult result : arHitTestResults) {
                            returnArray.pushMap(ARUtils.mapFromARHitTestResult(result));
                        }
                        promise.resolve(returnArray);
                    }
                });
            }
        });
    }

    @ReactMethod
    public void performARHitTestWithPosition(final int viewTag, final ReadableArray position,
                                        final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (sceneView.getParent() == null || !(sceneView.getParent() instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling performARHitTestWithPosition: expected ViroARSceneNavigator as parent");
                }

                VRTARSceneNavigator arSceneNavigator = (VRTARSceneNavigator) sceneView.getParent();
                ViroViewARCore arView = arSceneNavigator.getARView();

                if (position.size() != 3) {
                    promise.resolve(Arguments.createArray());
                    return;
                }

                float[] positionArray = new float[position.size()];
                positionArray[0] = (float) position.getDouble(0);
                positionArray[1] = (float) position.getDouble(1);
                positionArray[2] = (float) position.getDouble(2);

                arView.performARHitTestWithPosition(new Vector(positionArray), new ARHitTestListener() {
                    @Override
                    public void onHitTestFinished(ARHitTestResult[] arHitTestResults) {
                        WritableArray returnArray = Arguments.createArray();
                        for (ARHitTestResult result : arHitTestResults) {
                            returnArray.pushMap(ARUtils.mapFromARHitTestResult(result));
                        }
                        promise.resolve(returnArray);
                    }
                });
            }
        });
    }

    @ReactMethod
    public void performARHitTestWithPoint(final int viewTag, final int x, final int y,
                                             final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (sceneView.getParent() == null || !(sceneView.getParent() instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling performARHitTestWithPoint: expected ViroARSceneNavigator as parent");
                }

                VRTARSceneNavigator arSceneNavigator = (VRTARSceneNavigator) sceneView.getParent();
                ViroViewARCore arView = arSceneNavigator.getARView();

                arView.performARHitTest(new Point(x, y), new ARHitTestListener() {
                    @Override
                    public void onHitTestFinished(ARHitTestResult[] arHitTestResults) {
                        WritableArray returnArray = Arguments.createArray();
                        for (ARHitTestResult result : arHitTestResults) {
                            returnArray.pushMap(ARUtils.mapFromARHitTestResult(result));
                        }
                        promise.resolve(returnArray);
                    }
                });
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneNavigatorModule.java

/*

used in :

    @ReactMethod
    public void startVideoRecording(final int sceneNavTag, final String fileName,
                                    final boolean saveToCameraRool, final Callback reactErrorDelegate) {
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
                    reactErrorDelegate.invoke(UNSUPPORTED_PLATFORM_ERROR);
                    return;
                }

                // Construct an error listener callback that may be triggered during recording.
                final ViroMediaRecorder.RecordingErrorListener viroErrorDelegate = new ViroMediaRecorder.RecordingErrorListener() {
                    @Override
                    public void onRecordingFailed(Error error) {
                        reactErrorDelegate.invoke(error.toInt());
                    }
                };

                // Start recording if we have the right permissions
                checkPermissionsAndRun(new PermissionListener() {
                    @Override
                    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
                        recorder.startRecordingAsync(fileName, saveToCameraRool, viroErrorDelegate);
                        return true;
                    }
                }, true);
            }
        });
    }

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

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\NodeModule.java

/*

used in :

    @ReactMethod
    public void applyImpulse(final int viewTag, final ReadableArray force, final ReadableArray position) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View viroView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(viroView instanceof VRTNode)){
                    throw new IllegalViewOperationException("Invalid view returned when applying force: expected a node-type control!");
                }

                if (force == null || force.size() != 3){
                    throw new IllegalViewOperationException("Invalid impulse force parameters provided!");
                }

                if (position != null && position.size() != 3){
                    throw new IllegalViewOperationException("Invalid impulse force position parameters provided!");
                }

                // If no offset is given, default to a central impulse.
                float[] forcePosition = {0,0,0};
                if (position != null){
                    forcePosition[0] = (float)position.getDouble(0);
                    forcePosition[1] = (float)position.getDouble(1);
                    forcePosition[2] = (float)position.getDouble(2);
                }
                float[] forceArray = { (float)force.getDouble(0), (float)force.getDouble(1), (float)force.getDouble(2)};

                VRTNode nodeControl = (VRTNode) viroView;
                nodeControl.applyImpulse(forceArray, forcePosition);
            }
        });
    }

    @ReactMethod
    public void applyTorqueImpulse(final int viewTag, final ReadableArray torque) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View viroView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(viroView instanceof VRTNode)){
                    throw new IllegalViewOperationException("Invalid view returned when applying force: expected a node-type control!");
                }

                if (torque == null || torque.size() != 3){
                    throw new IllegalViewOperationException("Invalid impulse torque params provided!");
                }

                float[] torqueArray = { (float)torque.getDouble(0), (float)torque.getDouble(1), (float)torque.getDouble(2)};
                VRTNode nodeControl = (VRTNode) viroView;
                nodeControl.applyTorqueImpulse(torqueArray);
            }
        });
    }

    @ReactMethod
    public void setVelocity(final int viewTag, final ReadableArray velocity) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View viroView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(viroView instanceof VRTNode)){
                    throw new IllegalViewOperationException("Invalid view returned when applying velocity: expected a node-type control!");
                }

                if (velocity == null || velocity.size() != 3){
                    throw new IllegalViewOperationException("Invalid velocity params provided!");
                }

                float[] velocityArray = { (float)velocity.getDouble(0), (float)velocity.getDouble(1), (float)velocity.getDouble(2)};
                VRTNode nodeControl = (VRTNode) viroView;
                nodeControl.setVelocity(velocityArray, false);
            }
        });
    }

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
 