// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/WritableMap.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360Video.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTComponent.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTMaterialVideo.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSkyBox.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARNode.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARPlane.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARScene.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNode.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTScene.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTVideoSurface.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneNavigatorModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\NodeModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SceneNavigatorModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SoundModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\VRT3DSceneNavigatorModule.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\utility\ARUtils.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\utility\ComponentEventDelegate.java

// used in : WritableMap event = Arguments.createMap(); + event.put*