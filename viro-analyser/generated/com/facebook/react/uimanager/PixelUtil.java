// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/uimanager/PixelUtil.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNode.java

/*

used in :

    protected void attemptRecalcLayout() {
        // Attempt to find a FlexView parent OR FlexView grandparent if the parent is an AnimatedComponent
        VRTNode superView = null;
        if (getParent() != null && getParent() instanceof VRTFlexView) {
            superView = (VRTNode) getParent();
        } else if(getParent() != null && getParent() instanceof VRTAnimatedComponent) {
            if (getParent().getParent() != null && getParent().getParent() instanceof VRTFlexView) {
                superView = (VRTNode) getParent().getParent();
            }
        }

        // if we failed to find an acceptable parent, just return.
        if (superView == null) {
            return;
        }

        float[] position = get2DPosition();
        float[] size = get2DSize();

        float[] parentPosition = superView.get2DPosition();
        float[] parentSize = superView.get2DSize();

        // flip y because in our 3D coordinates, y increases as you go up, rather than downwards on mobile/web.
        float transformedY = parentSize[1] - position[1];

        // transform by subtracting by center of superview
        float transformedX = position[0] - parentPosition[0];
        transformedY = transformedY - parentPosition[1];

        // we need the factor that the CSS algorithm applies to the original width/height.
        float pixelsPerDIP = PixelUtil.toPixelFromDIP(1.0);

        // calculate 3D size/position
        float width3d = size[0] / pixelsPerDIP / s2DUnitPer3DUnit;
        float height3d = size[1] / pixelsPerDIP / s2DUnitPer3DUnit;
        transformedX = transformedX / pixelsPerDIP / s2DUnitPer3DUnit;
        transformedY = transformedY / pixelsPerDIP / s2DUnitPer3DUnit;

        // set position.
        setPosition(new float[]{transformedX, transformedY, sZIncrementToAvoidZFighting});

        // TODO: create Flexible interface
        // set the size (either through scale or width/height if the node supports it).
        if (this instanceof VRTImage) {
            VRTImage image = (VRTImage) this;
            image.setWidth(width3d);
            image.setHeight(height3d);
            image.onPropsSet();
        } else if (this instanceof VRTAnimatedImage) {
            VRTAnimatedImage image = (VRTAnimatedImage) this;
            image.setWidth(width3d);
            image.setHeight(height3d);
            image.onPropsSet();
        } else if (this instanceof VRTFlexView) {
            VRTFlexView flexView = (VRTFlexView) this;
            flexView.setWidth(width3d);
            flexView.setHeight(height3d);
        } else if (this instanceof VRTVideoSurface) {
            VRTVideoSurface videoSurface = (VRTVideoSurface)this;
            videoSurface.setWidth(width3d);
            videoSurface.setHeight(height3d);
            videoSurface.onPropsSet();
        } else if (this instanceof VRTQuad) {
            VRTQuad surface = (VRTQuad) this;
            surface.setWidth(width3d);
            surface.setHeight(height3d);
            surface.updateSurface();
        } else if (this instanceof VRTText) {
            VRTText text = (VRTText) this;
            text.setWidth(width3d);
            text.setHeight(height3d);
            text.onPropsSet();
        } else {
            this.setScale(new float[]{width3d, height3d, 1});
        }

        // normalize bounds so that they assume left & top == 0, we shouldn't set the pivots because
        // 1) they're already correct
        // 2) if you set pivots, the view will cease to use its default (center) and use the value you
        //    give it (see View's setPivotX/setPivotY javadocs)
        setLeft(0);
        setTop(0);
        setRight((int) size[0]);
        setBottom((int) size[1]);
    }

*/

