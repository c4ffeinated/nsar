// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/ReactApplicationContext.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\ReactViroPackage.java
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
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTViroViewGroupManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTVRSceneNavigatorManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARImageMarkerManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARObjectMarkerManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARPlaneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARSceneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTCameraManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTFlexViewManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNodeManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNodeManagerImpl.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTOrbitCameraManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTPortalManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTPortalSceneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTSceneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTSceneManagerImpl.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRT3DObjectManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTAnimatedImageManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTBoxManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTControlManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTGeometryManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTImageManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTParticleEmitterManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolygonManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolylineManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTQuadManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTSphereManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTTextManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTVideoSurfaceManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\AnimationManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneNavigatorModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARTrackingTargetsModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\CameraModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ControllerModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\MaterialManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\NodeModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\PerfMonitor.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SceneModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SceneNavigatorModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SoundModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\VRT3DSceneNavigatorModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\VRTImageModule.java

/* used method : 
    
  public ReactApplicationContext(Context context) {
    super(context.getApplicationContext());
  }

  getApplicationContext is from https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/ReactContext.java

  protected Context getApplicationContext() {
    return mApplicationContext;
  }

*/