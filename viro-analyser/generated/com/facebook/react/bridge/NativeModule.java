// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/NativeModule.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\ReactViroPackage.java

/*

used in :

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        Log.e("Manish", "createNativeModules");
        return Arrays.<NativeModule>asList(
                new MaterialManager(reactContext),
                new AnimationManager(reactContext),
                new CameraModule(reactContext),
                new SoundModule(reactContext),
                new SceneNavigatorModule(reactContext),
                new PerfMonitor(reactContext),
                new ControllerModule(reactContext),
                new NodeModule(reactContext),
                new SceneModule(reactContext),
                new VRTImageModule(reactContext),
                new ARSceneModule(reactContext),
                new ARSceneNavigatorModule(reactContext),
                new ARTrackingTargetsModule(reactContext),
                new VRT3DSceneNavigatorModule(reactContext)
        );
    }

// + get NativeModule

*/