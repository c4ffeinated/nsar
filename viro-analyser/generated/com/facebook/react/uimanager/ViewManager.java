// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/uimanager/ViewManager.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\ReactViroPackage.java

/*

used in :

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

*/

