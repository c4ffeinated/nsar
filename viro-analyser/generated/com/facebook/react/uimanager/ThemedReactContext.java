// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/uimanager/ThemedReactContext.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360ImageManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360VideoManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT3DSceneNavigatorManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTAmbientLightManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTAnimatedComponentManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTARSceneNavigatorManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTControllerManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTDirectionalLightManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTLightingEnvironmentManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTMaterialVideoManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTOmniLightManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSceneNavigatorManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSkyBoxManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundFieldManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpatialSoundManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpotLightManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTVRSceneNavigatorManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARImageMarkerManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARObjectMarkerManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARPlaneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARSceneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTCameraManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTFlexViewManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNodeManagerImpl.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTOrbitCameraManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTPortalManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTPortalSceneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTSceneManagerImpl.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRT3DObjectManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTAnimatedImageManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTBoxManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTGeometryManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTImageManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTParticleEmitterManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolygonManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolylineManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTQuadManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTSphereManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTTextManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTVideoSurfaceManager.java

/*

used in :

    @Override
    protected VRTText createViewInstance(ThemedReactContext reactContext) {
        return new VRTText(reactContext);
    }


*/