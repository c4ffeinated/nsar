// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/ReactPackage.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\ReactViroPackage.java

/*

used in :

public class ReactViroPackage implements ReactPackage {
    public static final String ON_EXIT_VIRO_BROADCAST ="com.viromedia.bridge.broadcast.OnExitViro";

    public enum ViroPlatform {
        GVR, OVR_MOBILE, AR
    }

    private final ViroPlatform mViroPlatform;

    public ReactViroPackage(ViroPlatform platform) {
        mViroPlatform = platform;
    }

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

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList(
                new VRTSceneNavigatorManager(reactContext, mViroPlatform),
                new VRTVRSceneNavigatorManager(reactContext, mViroPlatform),
                new VRTSceneManagerImpl(reactContext),
                new VRT3DSceneNavigatorManager(reactContext, mViroPlatform),
                new VRTBoxManager(reactContext),
                new VRTGeometryManager(reactContext),
                new VRTVideoSurfaceManager(reactContext),
                new VRT360VideoManager(reactContext),
                new VRTNodeManagerImpl(reactContext),
                new VRTCameraManager(reactContext),
                new VRTOrbitCameraManager(reactContext),
                new VRTSphereManager(reactContext),
                new VRTImageManager(reactContext),
                new VRT360ImageManager(reactContext),
                new VRTSkyBoxManager(reactContext),
                new VRTFlexViewManager(reactContext),
                new VRTAnimatedComponentManager(reactContext),
                new VRTQuadManager(reactContext),
                new VRTAnimatedImageManager(reactContext),
                new VRTPolygonManager(reactContext),
                new VRTFlexViewManager(reactContext),
                new VRTDirectionalLightManager(reactContext),
                new VRTAmbientLightManager(reactContext),
                new VRTSpotLightManager(reactContext),
                new VRTOmniLightManager(reactContext),
                new VRTSoundManager(reactContext),
                new VRTSoundFieldManager(reactContext),
                new VRTSpatialSoundManager(reactContext),
                new VRTOmniLightManager(reactContext),
                new VRTTextManager(reactContext),
                new VRT3DObjectManager(reactContext),
                new VRTControllerManager(reactContext),
                new VRTPolylineManager(reactContext),
                new VRTParticleEmitterManager(reactContext),
                new VRTPortalSceneManager(reactContext),
                new VRTPortalManager(reactContext),
                new VRTLightingEnvironmentManager(reactContext),
                new VRTMaterialVideoManager(reactContext),
                // AR Components
                new VRTARSceneNavigatorManager(reactContext),
                new VRTARSceneManager(reactContext),
                new VRTARPlaneManager(reactContext),
                new VRTARImageMarkerManager(reactContext),
                new VRTARObjectMarkerManager(reactContext)
        );
    }
}

*/

