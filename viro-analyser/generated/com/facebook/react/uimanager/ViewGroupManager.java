// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/uimanager/ViewGroupManager.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTViroViewGroupManager.java

/*

used in :


 * This is the base manager class for ALL Viro UI Components. Because we share some common
 * UI Component properties with React Native itself, we'll simply just override them here.
 
public abstract class VRTViroViewGroupManager<T extends ViewGroup>
        extends ViewGroupManager<T> {

    private final ReactApplicationContext mContext;

    public VRTViroViewGroupManager(ReactApplicationContext context) {
        mContext = context;
    }

    public ReactApplicationContext getContext() {
        return mContext;
    }

    @Override
    public LayoutShadowNode createShadowNodeInstance() {
        return new ViroLayoutShadowNode();
    }

    //Override React Properties 

    @ReactProp(name = "position")
    public void setPosition(T view, ReadableArray position) {
        // no-op
    }

    protected class ViroLayoutShadowNode extends LayoutShadowNode {

        @ReactProp(name = "position")
        public void setPosition(@Nullable ReadableArray position) {
            // no-op
        }
    }

    @Override
    public void onDropViewInstance(T view) {
        super.onDropViewInstance(view);
        if (view instanceof VRTComponent) {
            ((VRTComponent) view).onDrop();
        }
    }

    
     * Callback that will be triggered after all properties are updated in
     * current update transaction (all @ReactProp handlers for properties updated
     * in current transaction have been called). If you want to override this method
     * you should call super.onAfterUpdateTransaction from it as  the parent class
     * of the ViewManager may rely on callback being executed.
     
    @Override
    protected void onAfterUpdateTransaction(T view) {
        super.onAfterUpdateTransaction(view);
        if (view instanceof VRTComponent) {
            ((VRTComponent) view).onPropsSet();
        }
    }

    @Override
    public Map getExportedCustomDirectEventTypeConstants() {
        Map events = MapBuilder.builder().build();
        return events;
    }
}

*/

