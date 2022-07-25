// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/module/annotations/ReactModule.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\AnimationManager.java

/*

used in :

@ReactModule(name = "VRTAnimationManager")


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneModule.java

/*

used in :

@ReactModule(name = "VRTARSceneModule")


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneNavigatorModule.java

/*

used in :

@ReactModule(name = "VRTARSceneNavigatorModule")


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARTrackingTargetsModule.java

/*

used in :

@ReactModule(name = "VRTARSceneNavigatorModule")


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\CameraModule.java

/*

used in :

@ReactModule(name = "VRTCameraModule")


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ControllerModule.java

/*

used in :

@ReactModule(name = "VRTControllerModule")


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\MaterialManager.java

/*

used in :

@ReactModule(name = "VRTMaterialManager")


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\NodeModule.java

/*

used in :

@ReactModule(name = "VRTNodeModule")
public class NodeModule extends ReactContextBaseJavaModule {

    public NodeModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "VRTNodeModule";
    }

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
}

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\PerfMonitor.java

/*

used in :

@ReactModule(name = "VRTPerfMonitor")
public class PerfMonitor extends ReactContextBaseJavaModule {

    private static class PerfOptionHandler implements DevOptionHandler {

        private WeakReference<PerfMonitor> mPerfMonitor;

        public PerfOptionHandler(PerfMonitor perfMonitor) {
            mPerfMonitor = new WeakReference<PerfMonitor>(perfMonitor);
        }

        @Override
        public void onOptionSelected() {
            PerfMonitor perfMonitor = mPerfMonitor.get();
            if (perfMonitor != null) {
                perfMonitor.onOptionSelected();
            }
        }
    }

    private boolean mIsShowing = false;

    private boolean mIsInitialized = false;

    private WeakReference<ViroView> mView;

    public PerfMonitor(ReactApplicationContext context) {
        super(context);
    }

    public void onOptionSelected() {
        ViroView view = mView.get();
        if (view != null) {
            view.setDebugHUDEnabled(!mIsShowing);
        }
        mIsShowing = !mIsShowing;
    }

    public void setView(ViroView view) {
        if (!mIsInitialized) {
            Application application = getCurrentActivity().getApplication();
            if (application instanceof ReactApplication) {
                ReactApplication reactApplication = (ReactApplication) application;
                DevSupportManager devSupport = reactApplication.getReactNativeHost().getReactInstanceManager().getDevSupportManager();
                devSupport.addCustomDevOption("[Viro] Toggle FPS Display", new PerfOptionHandler(this));

                mIsInitialized = true;
            }
        }

        mView = new WeakReference<ViroView>(view);
        view.setDebugHUDEnabled(mIsShowing);
    }

    @Override
    public String getName() {
        return "VRTPerfMonitor";
    }

}

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SceneModule.java

/*

used in :

@ReactModule(name = "VRTSceneModule")
public class SceneModule extends ReactContextBaseJavaModule {

    public SceneModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "VRTSceneModule";
    }

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
}

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SceneNavigatorModule.java

/*

used in :

@ReactModule(name = "VRTSceneNavigatorModule")
public class SceneNavigatorModule extends ReactContextBaseJavaModule {

    public SceneNavigatorModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "VRTSceneNavigatorModule";
    }

    @ReactMethod
    public void requestExitVr(final int sceneNavTag) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (sceneView instanceof VRTVRSceneNavigator) {
                    VRTVRSceneNavigator scene = (VRTVRSceneNavigator) sceneView;
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
                if (view instanceof VRTVRSceneNavigator) {
                    VRTVRSceneNavigator sceneNavigator = (VRTVRSceneNavigator) view;
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
}

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SoundModule.java

/*

used in :

@ReactModule(name = "VRTSoundModule")
public class SoundModule extends ReactContextBaseJavaModule {

    private final HashMap<String, SoundData> mSoundDataMap = new HashMap<>();

    public SoundModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "VRTSoundModule";
    }

    
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

    @ReactMethod
    public void unloadSounds(ReadableArray soundArray) {
        for (int i = 0; i < soundArray.size(); i++) {
            String keyToRemove = soundArray.getString(i);
            SoundData dataToRemove = mSoundDataMap.get(keyToRemove);
            if (dataToRemove != null) {
                dataToRemove.destroy();
                mSoundDataMap.remove(keyToRemove);
            }
        }
    }

    public SoundData getSoundData(String name) {
        return mSoundDataMap.get(name);
    }
}

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\VRT3DSceneNavigatorModule.java

/*

used in :

@ReactModule(name = "VRT3DSceneNavigatorModule")
public class VRT3DSceneNavigatorModule extends ReactContextBaseJavaModule {

    public VRT3DSceneNavigatorModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "VRT3DSceneNavigatorModule";
    }

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
}

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\VRTImageModule.java

/*

used in :

@ReactModule(name = "VRTImageModule")
public class VRTImageModule extends ReactContextBaseJavaModule {

    private final Context mContext;

    @Override
    public String getName() {
        return "VRTImageModule";
    }

    public VRTImageModule(ReactApplicationContext context) {
        super(context);
        mContext = context;
    }

    @ReactMethod
    public void evictFromCache(ReadableMap map) {
        ImageDownloader.evictFromCache(map, mContext);
    }
}

*/
