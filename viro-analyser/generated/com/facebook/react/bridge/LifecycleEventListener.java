// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/LifecycleEventListener.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT3DSceneNavigator.java

/*

    private static class SceneNavigatorLifecycleListener implements LifecycleEventListener {

        private WeakReference<VRT3DSceneNavigator> mNavigator;

        public SceneNavigatorLifecycleListener(VRT3DSceneNavigator navigator) {
            mNavigator = new WeakReference<VRT3DSceneNavigator>(navigator);
        }

        @Override
        public void onHostResume() {
            VRT3DSceneNavigator navigator = mNavigator.get();
            if (navigator == null) {
                return;
            }
            navigator.onHostResume();
        }

        @Override
        public void onHostPause() {
            VRT3DSceneNavigator navigator = mNavigator.get();
            if (navigator == null) {
                return;
            }

            navigator.onHostPause();
        }

        @Override
        public void onHostDestroy() {
            VRT3DSceneNavigator navigator = mNavigator.get();
            if (navigator == null) {
                return;
            }

            navigator.onHostDestroy();
        }
    }

        public VRT3DSceneNavigator(ReactContext reactContext,
                             ReactViroPackage.ViroPlatform platform) {
        super(reactContext.getBaseContext(), null, -1);
        mPlatform = platform;
        mReactContext = reactContext;
        mRendererConfig = new RendererConfiguration();

        // Create the ViroView
        mViroView = createViroView(reactContext);

        // Add the ViroView as a child so it's rendered.
        addView((View) mViroView);

        mViroContext = mViroView.getViroContext();

         * Set the view for the debug console.
        PerfMonitor perfMonitor = reactContext.getNativeModule(PerfMonitor.class);
        perfMonitor.setView(mViroView);

         * Trigger ViroView's onActivityStarted and onActivityResumed of the vrView as
         * React creates it's views within the activity's onResume().
        mViroView.onActivityStarted(reactContext.getCurrentActivity());

        notifyScenePlatformInformation();

        mLifecycleListener = new SceneNavigatorLifecycleListener(this);
        reactContext.addLifecycleEventListener(mLifecycleListener);

         * We may need to reload the materials if the renderer was destroyed, but the app was not
         * and the user resumed.

        MaterialManager materialManager = reactContext.getNativeModule(MaterialManager.class);
        materialManager.reloadMaterials();
    }

    private void onHostDestroy() {
        mReactContext.removeLifecycleEventListener(mLifecycleListener);
    }

*/