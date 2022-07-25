// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/devsupport/interfaces/DevOptionHandler.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\PerfMonitor.java

/*

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

*/