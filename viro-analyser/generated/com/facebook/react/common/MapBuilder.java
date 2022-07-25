// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/common/MapBuilder.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360ImageManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360VideoManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT3DSceneNavigatorManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTAnimatedComponentManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTControllerManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTLightingEnvironmentManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTMaterialVideoManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSceneNavigatorManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSkyBoxManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundFieldManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpatialSoundManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTViroViewGroupManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTVRSceneNavigatorManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARImageMarkerManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARObjectMarkerManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARPlaneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARSceneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNodeManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTPortalSceneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTSceneManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRT3DObjectManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTAnimatedImageManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTBoxManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTImageManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolygonManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolylineManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTQuadManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTSphereManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTTextManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTVideoSurfaceManager.java

/*
        Map map = MapBuilder.of(ViroEvents.ON_FUSE, MapBuilder.of("registrationName", ViroEvents.ON_FUSE));
        map.put(ViroEvents.ON_HOVER, MapBuilder.of("registrationName", ViroEvents.ON_HOVER));
        map.put(ViroEvents.ON_CLICK, MapBuilder.of("registrationName", ViroEvents.ON_CLICK));
        map.put(ViroEvents.ON_SWIPE, MapBuilder.of("registrationName", ViroEvents.ON_SWIPE));
        map.put(ViroEvents.ON_SCROLL, MapBuilder.of("registrationName", ViroEvents.ON_SCROLL));
        map.put(ViroEvents.ON_COLLIDED, MapBuilder.of("registrationName", ViroEvents.ON_COLLIDED));
        map.put(ViroEvents.ON_PLATFORM_UPDATE, MapBuilder.of("registrationName", ViroEvents.ON_PLATFORM_UPDATE));
        map.put(ViroEvents.ON_CAMERA_TRANSFORM_UPDATE, MapBuilder.of("registrationName", ViroEvents.ON_CAMERA_TRANSFORM_UPDATE));
        events.put(ViroEvents.ON_ANIMATION_START, MapBuilder.of("registrationName", ViroEvents.ON_ANIMATION_START));
        events.put(ViroEvents.ON_ANIMATION_FINISH, MapBuilder.of("registrationName", ViroEvents.ON_ANIMATION_FINISH));
        events.put(ViroEvents.ON_BUFFER_START, MapBuilder.of("registrationName", ViroEvents.ON_BUFFER_START));
        events.put(ViroEvents.ON_BUFFER_END, MapBuilder.of("registrationName", ViroEvents.ON_BUFFER_END));
        events.put(ViroEvents.ON_FINISH, MapBuilder.of("registrationName", ViroEvents.ON_FINISH));
        events.put(ViroEvents.ON_UPDATE_TIME, MapBuilder.of("registrationName", ViroEvents.ON_UPDATE_TIME));
        events.put(ViroEvents.ON_ERROR, MapBuilder.of("registrationName", ViroEvents.ON_ERROR));
        return MapBuilder.of(ViroCommands.SEEK_TO_TIME_NAME, ViroCommands.SEEK_TO_TIME_INDEX);
*/
