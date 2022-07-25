// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/ReactApplication.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\PerfMonitor.java

/*

used in :

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

*/

