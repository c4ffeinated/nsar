// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/uimanager/annotations/ReactProp.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360ImageManager.java


/*

used in :

    @ReactProp(name = "debug", defaultBoolean = false)
    public void setDebug(VRT3DSceneNavigator navigator, boolean debug) {
        navigator.setDebug(debug);
    }

    @ReactProp(name = "hdrEnabled", defaultBoolean = true)
    public void setHDREnabled(VRT3DSceneNavigator navigator, boolean enabled) {
        navigator.setHDREnabled(enabled);
    }

    @ReactProp(name = "pbrEnabled", defaultBoolean = true)
    public void setPBREnabled(VRT3DSceneNavigator navigator, boolean enabled) {
        navigator.setPBREnabled(enabled);
    }

    @ReactProp(name = "bloomEnabled", defaultBoolean = true)
    public void setBloomEnabled(VRT3DSceneNavigator navigator, boolean enabled) {
        navigator.setBloomEnabled(enabled);
    }

    @ReactProp(name = "shadowsEnabled", defaultBoolean = true)
    public void setShadowsEnabled(VRT3DSceneNavigator navigator, boolean enabled) {
        navigator.setShadowsEnabled(enabled);
    }

    @ReactProp(name = "multisamplingEnabled", defaultBoolean = true)
    public void setMultisamplingEnabled(VRT3DSceneNavigator navigator, boolean enabled) {
        navigator.setMultisamplingEnabled(enabled);
    }

    @ReactProp(name = "currentSceneIndex")
    public void setCurrentSceneIndex(VRT3DSceneNavigator view, int selectedIndex) {
        view.setCurrentSceneIndex(selectedIndex);
    }

    @ReactProp(name = "hasOnExitViroCallback", defaultBoolean = false)
    public void setHasOnExitViroCallback(VRT3DSceneNavigator navigator, boolean hasOnExitViroCallback) {
        navigator.setHasOnExitViroCallback(hasOnExitViroCallback);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360VideoManager.java

/*

used in :

    @ReactProp(name = "source")
    public void setSource(VRT360Image view, ReadableMap source) {
        view.setSource(source);
    }

    @ReactProp(name = "rotation")
    public void setRotation(VRT360Image view, ReadableArray rotation) {
        view.setRotation(rotation);
    }

    @ReactProp(name = "format")
    public void setFormat(VRT360Image view, String format) { view.setFormat(format); }

    @ReactProp(name = "stereoMode")
    public void setStereoMode(VRT360Image view, String mode) { view.setStereoMode(mode); }

    @ReactProp(name = "isHdr", defaultBoolean = false)
    public void setIsHdr(VRT360Image view, boolean hdr) { view.setIsHdr(hdr); }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT3DSceneNavigatorManager.java

/*

used in :

    @ReactProp(name = "paused", defaultBoolean = true)
    public void setPaused(VRT360Video view, boolean visibility) {
        view.setPaused(visibility);
    }

    @ReactProp(name = "loop", defaultBoolean = false)
    public void setLoop(VRT360Video view, boolean visibility) {
        view.setLoop(visibility);
    }

    @ReactProp(name = "muted", defaultBoolean = false)
    public void setMuted(VRT360Video view, boolean visibility) {
        view.setMuted(visibility);
    }

    @ReactProp(name = "volume", defaultFloat = 1f)
    public void setVolume(VRT360Video view, float opacity) {
        view.setVolume(opacity);
    }

    @ReactProp(name = "source")
    public void setSource(VRT360Video view, @Nullable ReadableMap map) {
        view.setSource(map.getString("uri"));
    }

    @ReactProp(name = "stereoMode")
    public void setStereoMode(VRT360Video view, String mode) { view.setStereoMode(mode); }

    @ReactProp(name = "rotation")
    public void setRotation(VRT360Video view, ReadableArray rotation) {
        view.setRotation(rotation);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTAmbientLightManager.java

/*

used in :

    @ReactProp(name = "color", customType = "Color")
    public void setColor(VRTAmbientLight ambientLight, @Nullable Integer color) {
        if(color == null) {
            ambientLight.setColor(Color.WHITE);
        } else {
            ambientLight.setColor(color);
        }
    }

    @ReactProp(name = "intensity", defaultFloat = 1000.0f)
    public void setIntensity(VRTAmbientLight ambientLight, float intensity) {
        ambientLight.setIntensity(intensity);
    }

    @ReactProp(name = "temperature", defaultFloat = 6500f)
    public void setTemperature(VRTAmbientLight ambientLight, float temperature) {
        ambientLight.setTemperature(temperature);
    }

    @ReactProp(name = "influenceBitMask")
    public void setInfluenceBitMask(VRTAmbientLight ambientLight, int bitMask) {
        ambientLight.setInfluenceBitMask(bitMask);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTAnimatedComponentManager.java

/*

used in :

    @ReactProp(name = "animation")
    public void setAnimation(VRTAnimatedComponent animatedComponent, String animationName) {
        animatedComponent.setAnimation(animationName);
    }

    @ReactProp(name = "loop", defaultBoolean = false)
    public void setLoop(VRTAnimatedComponent animatedComponent, boolean loop) {
        animatedComponent.setLoop(loop);
    }

    @ReactProp(name = "delay", defaultFloat = 0)
    public void setDelay(VRTAnimatedComponent animatedComponent, float delay) {
        animatedComponent.setDelay(delay);
    }

    @ReactProp(name = "run", defaultBoolean = true)
    public void setRun(VRTAnimatedComponent animatedComponent, boolean run) {
        animatedComponent.setRun(run);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTARSceneNavigatorManager.java

/*

used in :

    @ReactProp(name = "currentSceneIndex")
    public void setCurrentSceneIndex(VRTARSceneNavigator view, int selectedIndex) {
        view.setCurrentSceneIndex(selectedIndex);
    }

    @ReactProp(name = "numberOfTrackedImages")
    public void setNumberOfTrackedImages(VRTARSceneNavigator navigator, int numberOfTrackedImages) {
        // no-op
    }

    @ReactProp(name = "autofocus", defaultBoolean = false)
    public void setAutoFocus(VRTARSceneNavigator navigator, boolean enabled) {
        navigator.setAutoFocusEnabled(enabled);
    }


    @ReactProp(name = "hdrEnabled", defaultBoolean = true)
    public void setHDREnabled(VRTARSceneNavigator navigator, boolean enabled) {
        navigator.setHDREnabled(enabled);
    }

    @ReactProp(name = "pbrEnabled", defaultBoolean = true)
    public void setPBREnabled(VRTARSceneNavigator navigator, boolean enabled) {
        navigator.setPBREnabled(enabled);
    }

    @ReactProp(name = "bloomEnabled", defaultBoolean = true)
    public void setBloomEnabled(VRTARSceneNavigator navigator, boolean enabled) {
        navigator.setBloomEnabled(enabled);
    }

    @ReactProp(name = "shadowsEnabled", defaultBoolean = true)
    public void setShadowsEnabled(VRTARSceneNavigator navigator, boolean enabled) {
        navigator.setShadowsEnabled(enabled);
    }

    @ReactProp(name = "multisamplingEnabled", defaultBoolean = true)
    public void setMultisamplingEnabled(VRTARSceneNavigator navigator, boolean enabled) {
        navigator.setMultisamplingEnabled(enabled);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTControllerManager.java

/*

used in :

    @ReactProp(name = "reticleVisibility", defaultBoolean = VRTController.DEFAULT_RETICLE_VISIBILITY)
    public void setReticleVisibility(VRTController view, boolean reticleVisibility) {
        view.setReticleVisibility(reticleVisibility);
    }

    @ReactProp(name = "controllerVisibility", defaultBoolean = VRTController.DEFAULT_CONTROLLER_VISIBILITY)
    public void setControllerVisibility(VRTController view, boolean controllerVisibility) {
        view.setControllerVisibility(controllerVisibility);
    }

    @ReactProp(name = "canClick", defaultBoolean = VRTController.DEFAULT_CAN_CLICK)
    public void setCanClick(VRTController view, boolean canClick) {
        view.setCanClick(canClick);
    }

    @ReactProp(name = "canTouch", defaultBoolean = VRTController.DEFAULT_CAN_TOUCH)
    public void setCanTouch(VRTController view, boolean canTouch) {
        view.setCanTouch(canTouch);
    }

    @ReactProp(name = "canSwipe", defaultBoolean = VRTController.DEFAULT_CAN_SWIPE)
    public void setCanSwipe(VRTController view, boolean canSwipe) {
        view.setCanSwipe(canSwipe);
    }

    @ReactProp(name = "canScroll", defaultBoolean = VRTController.DEFAULT_CAN_SCROLL)
    public void setCanScroll(VRTController view, boolean canScroll) {
        view.setCanScroll(canScroll);
    }

    @ReactProp(name = "canFuse", defaultBoolean = VRTController.DEFAULT_CAN_FUSE)
    public void setCanFuse(VRTController view, boolean canFuse) {
        view.setCanFuse(canFuse);
    }

    @ReactProp(name = "canGetControllerStatus", defaultBoolean = VRTController.DEFAULT_CAN_GET_CONTROLLER_STATUS)
    public void setCanGetControllerStatus(VRTController view, boolean canGetControllerStatus) {
        view.setCanGetControllerStatus(canGetControllerStatus);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTDirectionalLightManager.java

/*

used in :

    @ReactProp(name = "color", customType = "Color")
    public void setColor(VRTDirectionalLight directionalLight, @Nullable Integer color) {
        if(color == null) {
            directionalLight.setColor(Color.WHITE);
        }else {
            directionalLight.setColor(color);
        }
    }

    @ReactProp(name = "intensity", defaultFloat = 1000.0f)
    public void setIntensity(VRTDirectionalLight directionalLight, float intensity) {
        directionalLight.setIntensity(intensity);
    }

    @ReactProp(name = "temperature", defaultFloat = 6500f)
    public void setTemperature(VRTAmbientLight ambientLight, float temperature) {
        ambientLight.setTemperature(temperature);
    }

    @ReactProp(name = "direction")
    public void setDirection(VRTDirectionalLight directionalLight, ReadableArray direction) {
        directionalLight.setDirection(Helper.toFloatArray(direction));
    }

    @ReactProp(name = "influenceBitMask")
    public void setInfluenceBitMask(VRTDirectionalLight directionalLight, int bitMask) {
        directionalLight.setInfluenceBitMask(bitMask);
    }

    @ReactProp(name = "castsShadow")
    public void setCastsShadow(VRTDirectionalLight directionalLight, boolean castsShadow) {
        directionalLight.setCastsShadow(castsShadow);
    }

    @ReactProp(name = "shadowOpacity")
    public void setShadowOpacity(VRTDirectionalLight directionalLight, float opacity) {
        directionalLight.setShadowOpacity(opacity);
    }

    @ReactProp(name = "shadowOrthographicPosition")
    public void setShadowOrthographicPosition(VRTDirectionalLight directionalLight, ReadableArray position) {
        directionalLight.setShadowOrthographicPosition(Helper.toFloatArray(position));
    }

    @ReactProp(name = "shadowOrthographicSize")
    public void setShadowOrthographicSize(VRTDirectionalLight directionalLight, float size) {
        directionalLight.setShadowOrthographicSize(size);
    }

    @ReactProp(name = "shadowMapSize")
    public void setShadowMapSize(VRTDirectionalLight directionalLight, int mapSize) {
        directionalLight.setShadowMapSize(mapSize);
    }

    @ReactProp(name = "shadowBias")
    public void setShadowBias(VRTDirectionalLight directionalLight, float bias) {
        directionalLight.setShadowBias(bias);
    }

    @ReactProp(name = "shadowNearZ")
    public void setShadowNearZ(VRTDirectionalLight directionalLight, float nearZ) {
        directionalLight.setShadowNearZ(nearZ);
    }

    @ReactProp(name = "shadowFarZ")
    public void setShadowFarZ(VRTDirectionalLight directionalLight, float farZ) {
        directionalLight.setShadowFarZ(farZ);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTLightingEnvironmentManager.java

/*

used in :

    @ReactProp(name = "source")
    public void setSource(VRTLightingEnvironment view, ReadableMap source) {
        view.setSource(source);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTMaterialVideoManager.java

/*

used in :

    @ReactProp(name = "material")
    public void setMaterial(VRTMaterialVideo view, String material) { view.setMaterial(material);}

    @ReactProp(name = "paused", defaultBoolean = true)
    public void setPaused(VRTMaterialVideo view, boolean paused) {
        view.setPaused(paused);
    }

    @ReactProp(name = "loop", defaultBoolean = false)
    public void setLoop(VRTMaterialVideo view, boolean loop) {
        view.setLoop(loop);
    }

    @ReactProp(name = "muted", defaultBoolean = false)
    public void setMuted(VRTMaterialVideo view, boolean muted) {
        view.setMuted(muted);
    }

    @ReactProp(name = "volume", defaultFloat = 1f)
    public void setVolume(VRTMaterialVideo view, float volume) {
        view.setVolume(volume);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTOmniLightManager.java

/*

used in :

    @ReactProp(name = "color", customType = "Color")
    public void setColor(VRTOmniLight omniLight, @Nullable Integer color) {
        if(color == null) {
            omniLight.setColor(Color.WHITE);
        } else {
            omniLight.setColor(color);
        }
    }

    @ReactProp(name = "intensity", defaultFloat = 1000.0f)
    public void setIntensity(VRTOmniLight omniLight, float intensity) {
        omniLight.setIntensity(intensity);
    }

    @ReactProp(name = "temperature", defaultFloat = 6500f)
    public void setTemperature(VRTAmbientLight ambientLight, float temperature) {
        ambientLight.setTemperature(temperature);
    }

    @ReactProp(name = "position")
    public void setPosition(VRTOmniLight omniLight, ReadableArray position) {
        omniLight.setPosition(Helper.toFloatArray(position));
    }

    @ReactProp(name = "attenuationStartDistance", defaultFloat = 2f)
    public void setAttenuationStartDistance(VRTOmniLight omniLight, float attenuationStartDistance) {
        omniLight.setAttenuationStartDistance(attenuationStartDistance);
    }

    @ReactProp(name = "attenuationEndDistance", defaultFloat = 10f)
    public void setAttenuationEndDistance(VRTOmniLight omniLight, float attenuationEndDistance) {
        omniLight.setAttenuationEndDistance(attenuationEndDistance);
    }

    @ReactProp(name = "influenceBitMask")
    public void setInfluenceBitMask(VRTOmniLight omniLight, int bitMask) {
        omniLight.setInfluenceBitMask(bitMask);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSceneNavigatorManager.java

/*

used in :

    @ReactProp(name = "vrModeEnabled", defaultBoolean = true)
    public void setVrModeEnabled(VRTVRSceneNavigator navigator, boolean vrModeEnabled) {
        navigator.setVrModeEnabled(vrModeEnabled);
    }

    @ReactProp(name = "debug", defaultBoolean = false)
    public void setDebug(VRTVRSceneNavigator navigator, boolean debug) {
        navigator.setDebug(debug);
    }

    @ReactProp(name = "currentSceneIndex")
    public void setCurrentSceneIndex(VRTVRSceneNavigator view, int selectedIndex) {
        view.setCurrentSceneIndex(selectedIndex);
    }

    @ReactProp(name = "hasOnExitViroCallback", defaultBoolean = false)
    public void setHasOnExitViroCallback(VRTVRSceneNavigator navigator, boolean hasOnExitViroCallback) {
        navigator.setHasOnExitViroCallback(hasOnExitViroCallback);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSkyBoxManager.java

/*

used in :

    @ReactProp(name = "source")
    public void setSource(VRTSkyBox view, ReadableMap source) {
        view.setSource(source);
    }

    
    // Color is expecting a double because ReactNative doesn't support a long prop type
     
    @ReactProp(name = "color", customType = "Color")
    public void setColor(VRTSkyBox view, @Nullable Integer color) {
        if(color != null) {
            view.setColor((long) color);
        }
    }

    @ReactProp(name = "format")
    public void setFormat(VRTSkyBox view, String format) { view.setFormat(format); }

    protected final static String SKYBOX_LOAD_START = "onViroSkyBoxLoadStart";
    protected final static String SKYBOX_LOAD_END = "onViroSkyBoxLoadEnd";

    @Override
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of(
                SKYBOX_LOAD_START, MapBuilder.of("registrationName", SKYBOX_LOAD_START),
                SKYBOX_LOAD_END, MapBuilder.of("registrationName", SKYBOX_LOAD_END));

    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundFieldManager.java

/*

used in :

    @ReactProp(name = "source")
    public void setSource(VRTSoundField sound, ReadableMap source) {
        sound.setSource(source);
    }

    @ReactProp(name = "paused", defaultBoolean = false)
    public void setPaused(VRTSoundField sound, boolean paused) {
        sound.setPaused(paused);
    }

    @ReactProp(name = "volume", defaultFloat = 1.0f)
    public void setVolume(VRTSoundField sound, float volume) {
        sound.setVolume(volume);
    }

    @ReactProp(name = "muted", defaultBoolean = false)
    public void setMuted(VRTSoundField sound, boolean muted) {
        sound.setMuted(muted);
    }

    @ReactProp(name = "loop", defaultBoolean = false)
    public void setLoop(VRTSoundField sound, boolean loop) {
        sound.setLoop(loop);
    }

    @ReactProp(name = "rotation")
    public void setRotation(VRTSoundField sound, ReadableArray rotation) {
        sound.setRotation(Helper.toFloatArray(rotation));
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundManager.java

/*

used in :

    @ReactProp(name = "source")
    public void setSource(VRTSound sound, ReadableMap source) {
        sound.setSource(source);
    }

    @ReactProp(name = "paused", defaultBoolean = false)
    public void setPaused(VRTSound sound, boolean paused) {
        sound.setPaused(paused);
    }

    @ReactProp(name = "volume", defaultFloat = 1.0f)
    public void setVolume(VRTSound sound, float volume) {
        sound.setVolume(volume);
    }

    @ReactProp(name = "muted", defaultBoolean = false)
    public void setMuted(VRTSound sound, boolean muted) {
        sound.setMuted(muted);
    }

    @ReactProp(name = "loop", defaultBoolean = false)
    public void setLoop(VRTSound sound, boolean loop) {
        sound.setLoop(loop);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpatialSoundManager.java

/*

used in :

    @ReactProp(name = "source")
    public void setSource(VRTSpatialSoundWrapper sound, ReadableMap source) {
        sound.setSource(source);
    }

    @ReactProp(name = "paused", defaultBoolean = false)
    public void setPaused(VRTSpatialSoundWrapper sound, boolean paused) {
        sound.setPaused(paused);
    }

    @ReactProp(name = "volume", defaultFloat = 1.0f)
    public void setVolume(VRTSpatialSoundWrapper sound, float volume) {
        sound.setVolume(volume);
    }

    @ReactProp(name = "muted", defaultBoolean = false)
    public void setMuted(VRTSpatialSoundWrapper sound, boolean muted) {
        sound.setMuted(muted);
    }

    @ReactProp(name = "loop", defaultBoolean = false)
    public void setLoop(VRTSpatialSoundWrapper sound, boolean loop) {
        sound.setLoop(loop);
    }

    @ReactProp(name = "position")
    public void setPosition(VRTSpatialSoundWrapper sound, ReadableArray position) {
        sound.setPosition(Helper.toFloatArray(position));
    }

    @ReactProp(name = "rolloffModel")
    public void setRolloffModel(VRTSpatialSoundWrapper sound, String rolloffModel) {
        sound.setRolloffModel(rolloffModel);
    }

    @ReactProp(name = "minDistance", defaultFloat = 0f)
    public void setMinDistance(VRTSpatialSoundWrapper sound, float minDistance) {
        sound.setMinDistance(minDistance);
    }

    @ReactProp(name = "maxDistance", defaultFloat = 0f)
    public void setMaxDistance(VRTSpatialSoundWrapper sound, float maxDistance) {
        sound.setMaxDistance(maxDistance);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpotLightManager.java

/*

used in :

    @ReactProp(name = "color", customType = "Color")
    public void setColor(VRTSpotLight spotLight, @Nullable Integer color) {
        if(color == null) {
            spotLight.setColor(Color.WHITE);
        } else {
            spotLight.setColor(color);
        }
    }

    @ReactProp(name = "intensity", defaultFloat = 1000.0f)
    public void setIntensity(VRTSpotLight spotLight, float intensity) {
        spotLight.setIntensity(intensity);
    }

    @ReactProp(name = "temperature", defaultFloat = 6500f)
    public void setTemperature(VRTAmbientLight ambientLight, float temperature) {
        ambientLight.setTemperature(temperature);
    }

    @ReactProp(name = "direction")
    public void setDirection(VRTSpotLight spotLight, ReadableArray direction) {
        spotLight.setDirection(Helper.toFloatArray(direction));
    }

    @ReactProp(name = "position")
    public void setPosition(VRTSpotLight spotLight, ReadableArray position) {
        spotLight.setPosition(Helper.toFloatArray(position));
    }

    @ReactProp(name = "attenuationStartDistance", defaultFloat = 2f)
    public void setAttenuationStartDistance(VRTSpotLight spotLight, float attenuationStartDistance) {
        spotLight.setAttenuationStartDistance(attenuationStartDistance);
    }

    @ReactProp(name = "attenuationEndDistance", defaultFloat = 10f)
    public void setAttenuationEndDistance(VRTSpotLight spotLight, float attenuationEndDistance) {
        spotLight.setAttenuationEndDistance(attenuationEndDistance);
    }

    @ReactProp(name = "innerAngle", defaultFloat = 0f)
    public void setInnerAngle(VRTSpotLight spotLight, float innerAngle) {
        spotLight.setInnerAngle(innerAngle);
    }

    @ReactProp(name = "outerAngle", defaultFloat = 45f)
    public void setOuterAngle(VRTSpotLight spotLight, float outerAngle) {
        spotLight.setOuterAngle(outerAngle);
    }


    @ReactProp(name = "influenceBitMask")
    public void setInfluenceBitMask(VRTSpotLight spotLight, int bitMask) {
        spotLight.setInfluenceBitMask(bitMask);
    }

    @ReactProp(name = "castsShadow")
    public void setCastsShadow(VRTSpotLight spotLight, boolean castsShadow) {
        spotLight.setCastsShadow(castsShadow);
    }

    @ReactProp(name = "shadowOpacity")
    public void setShadowOpacity(VRTSpotLight spotLight, float opacity) {
        spotLight.setShadowOpacity(opacity);
    }


    @ReactProp(name = "shadowMapSize")
    public void setShadowMapSize(VRTSpotLight spotLight, int mapSize) {
        spotLight.setShadowMapSize(mapSize);
    }

    @ReactProp(name = "shadowBias")
    public void setShadowBias(VRTSpotLight spotLight, float bias) {
        spotLight.setShadowBias(bias);
    }

    @ReactProp(name = "shadowNearZ")
    public void setShadowNearZ(VRTSpotLight spotLight, float nearZ) {
        spotLight.setShadowNearZ(nearZ);
    }

    @ReactProp(name = "shadowFarZ")
    public void setShadowFarZ(VRTSpotLight spotLight, float farZ) {
        spotLight.setShadowFarZ(farZ);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTViroViewGroupManager.java

/*

used in :

    @ReactProp(name = "position")
    public void setPosition(T view, ReadableArray position) {
        // no-op
    }

        @ReactProp(name = "position")
        public void setPosition(@Nullable ReadableArray position) {
            // no-op
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

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTVRSceneNavigatorManager.java

/*

used in :

    @ReactProp(name = "vrModeEnabled", defaultBoolean = true)
    public void setVrModeEnabled(VRTVRSceneNavigator navigator, boolean vrModeEnabled) {
        navigator.setVrModeEnabled(vrModeEnabled);
    }

    @ReactProp(name = "hdrEnabled", defaultBoolean = true)
    public void setHDREnabled(VRTVRSceneNavigator navigator, boolean enabled) {
        navigator.setHDREnabled(enabled);
    }

    @ReactProp(name = "pbrEnabled", defaultBoolean = true)
    public void setPBREnabled(VRTVRSceneNavigator navigator, boolean enabled) {
        navigator.setPBREnabled(enabled);
    }

    @ReactProp(name = "bloomEnabled", defaultBoolean = true)
    public void setBloomEnabled(VRTVRSceneNavigator navigator, boolean enabled) {
        navigator.setBloomEnabled(enabled);
    }

    @ReactProp(name = "shadowsEnabled", defaultBoolean = true)
    public void setShadowsEnabled(VRTVRSceneNavigator navigator, boolean enabled) {
        navigator.setShadowsEnabled(enabled);
    }

    @ReactProp(name = "multisamplingEnabled", defaultBoolean = true)
    public void setMultisamplingEnabled(VRTVRSceneNavigator navigator, boolean enabled) {
        navigator.setMultisamplingEnabled(enabled);
    }

    @ReactProp(name = "debug", defaultBoolean = false)
    public void setDebug(VRTVRSceneNavigator navigator, boolean debug) {
        navigator.setDebug(debug);
    }

    @ReactProp(name = "currentSceneIndex")
    public void setCurrentSceneIndex(VRTVRSceneNavigator view, int selectedIndex) {
        view.setCurrentSceneIndex(selectedIndex);
    }

@ReactProp(name = "hasOnExitViroCallback", defaultBoolean = false)
    public void setHasOnExitViroCallback(VRTVRSceneNavigator navigator, boolean hasOnExitViroCallback) {
        navigator.setHasOnExitViroCallback(hasOnExitViroCallback);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARImageMarkerManager.java

/*

used in :

    @ReactProp(name="pauseUpdates", defaultBoolean = false)
    public void setPauseUpdates(VRTARImageMarker arImageMarker, boolean pauseUpdates) {
        arImageMarker.setPauseUpdates(pauseUpdates);
    }

    @ReactProp(name="target")
    public void setTarget(VRTARImageMarker arImageMarker, String targetName) {
        arImageMarker.setTarget(targetName);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARObjectMarkerManager.java

/*

used in :

    @ReactProp(name="pauseUpdates", defaultBoolean = false)
    public void setPauseUpdates(VRTARObjectMarker arObjectMarker, boolean pauseUpdates) {
        // no-op
    }

    @ReactProp(name="target")
    public void setTarget(VRTARObjectMarker arObjectMarker, String targetName) {
        // no-op
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARPlaneManager.java

/*

used in :

    @ReactProp(name="minWidth", defaultFloat = 0f)
    public void setMinWidth(VRTARPlane arPlane, float minWidth) {
        arPlane.setMinWidth(minWidth);
    }

    @ReactProp(name="minHeight", defaultFloat = 0f)
    public void setMinHeight(VRTARPlane arPlane, float minHeight) {
        arPlane.setMinHeight(minHeight);
    }

    @ReactProp(name="alignment")
    public void setAlignment(VRTARPlane arPlane, String alignment) {
        arPlane.setAlignment(alignment);
    }

    @ReactProp(name="anchorId")
    public void setAnchorId(VRTARPlane arPlane, String anchorId) {
        arPlane.setAnchorId(anchorId);
    }

    @ReactProp(name="pauseUpdates", defaultBoolean = false)
    public void setPauseUpdates(VRTARPlane arPlane, boolean pauseUpdates) {
        arPlane.setPauseUpdates(pauseUpdates);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARSceneManager.java

/*

used in :

    @ReactProp(name="displayPointCloud", defaultBoolean = false)
    public void setDisplayPointCloud(VRTARScene scene, boolean displayPointCloud) {
        scene.setDisplayPointCloud(displayPointCloud);
    }

    @ReactProp(name="pointCloudImage")
    public void setPointCloudImage(VRTARScene scene, ReadableMap pointCloudImage) {
        scene.setPointCloudImage(pointCloudImage);
    }

    @ReactProp(name="pointCloudScale")
    public void setPointCloudScale(VRTARScene scene, ReadableArray pointCloudScale) {
        try {
            if (pointCloudScale == null) {
                scene.setPointCloudScale(new Vector(.01f, .01f, .01f));

            } else {
                scene.setPointCloudScale(Helper.toVector(pointCloudScale));
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("imageScale requires 3 scale values for [x, y, z].");
        }
    }

    @ReactProp(name="pointCloudMaxPoints", defaultInt = 500)
    public void setPointCloudMaxPoints(VRTARScene scene, int maxPoints) {
        scene.setPointCloudMaxPoints(maxPoints);
    }

    @ReactProp(name="anchorDetectionTypes")
    public void setAnchorDetectionTypes(VRTARScene scene, @Nullable ReadableArray array) {
        scene.setAnchorDetectionTypes(array);
    }

    @ReactProp(name = "canCameraARHitTest", defaultBoolean = VRTNode.DEFAULT_CAN_CAMERA_HIT_TEST)
    public void setCanCameraARHitTest(VRTARScene scene, boolean canCameraARHitTest) {
        scene.setCanCameraARHitTest(canCameraARHitTest);
    }

    @ReactProp(name = "canARPointCloudUpdate", defaultBoolean = VRTNode.DEFAULT_CAN_AR_POINT_CLOUD_UPDATE)
    public void setCanARPointCloudUpdate(VRTARScene scene, boolean canARPointCloudUpdate) {
        scene.setCanARPointCloudUpdate(canARPointCloudUpdate);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTCameraManager.java

/*

used in :

    @ReactProp(name="displayPointCloud", defaultBoolean = false)
    public void setDisplayPointCloud(VRTARScene scene, boolean displayPointCloud) {
        scene.setDisplayPointCloud(displayPointCloud);
    }

    @ReactProp(name="pointCloudImage")
    public void setPointCloudImage(VRTARScene scene, ReadableMap pointCloudImage) {
        scene.setPointCloudImage(pointCloudImage);
    }

    @ReactProp(name="pointCloudScale")
    public void setPointCloudScale(VRTARScene scene, ReadableArray pointCloudScale) {
        try {
            if (pointCloudScale == null) {
                scene.setPointCloudScale(new Vector(.01f, .01f, .01f));

            } else {
                scene.setPointCloudScale(Helper.toVector(pointCloudScale));
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("imageScale requires 3 scale values for [x, y, z].");
        }
    }

    @ReactProp(name="pointCloudMaxPoints", defaultInt = 500)
    public void setPointCloudMaxPoints(VRTARScene scene, int maxPoints) {
        scene.setPointCloudMaxPoints(maxPoints);
    }

    @ReactProp(name="anchorDetectionTypes")
    public void setAnchorDetectionTypes(VRTARScene scene, @Nullable ReadableArray array) {
        scene.setAnchorDetectionTypes(array);
    }

    @ReactProp(name = "canCameraARHitTest", defaultBoolean = VRTNode.DEFAULT_CAN_CAMERA_HIT_TEST)
    public void setCanCameraARHitTest(VRTARScene scene, boolean canCameraARHitTest) {
        scene.setCanCameraARHitTest(canCameraARHitTest);
    }

    @ReactProp(name = "canARPointCloudUpdate", defaultBoolean = VRTNode.DEFAULT_CAN_AR_POINT_CLOUD_UPDATE)
    public void setCanARPointCloudUpdate(VRTARScene scene, boolean canARPointCloudUpdate) {
        scene.setCanARPointCloudUpdate(canARPointCloudUpdate);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTFlexViewManager.java

/*

used in :

    @ReactProp(name = "position")
    public void setPosition(VRTCamera camera, ReadableArray position) {
        float[] posArray = {(float) position.getDouble(0), (float) position.getDouble(1),
                (float) position.getDouble(2)};
        camera.setPosition(posArray);
    }

    @ReactProp(name = "fieldOfView", defaultFloat = VRTCamera.DEFAULT_FOV)
    public void setFieldOfView(VRTCamera camera, float fov) {
        camera.setFieldOfView(fov);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNodeManager.java

/*

used in :

    @ReactProp(name = "width", defaultFloat = 1)
    public void setWidth(VRTFlexView view, float width) {
        view.setWidth(width);
    }

    @ReactProp(name = "height", defaultFloat = 1)
    public void setHeight(VRTFlexView view, float height) {
        view.setHeight(height);
    }

    @ReactProp(name = "backgroundColor", customType = "Color")
    public void setBackgroundColor(VRTFlexView view, Integer color) {
        if(color == null){
            view.setBackgroundColor(Color.TRANSPARENT);
        } else {
            view.setBackgroundColor((long) color);
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTOrbitCameraManager.java

/*

used in :

    @ReactProp(name = "position")
    public void setPosition(T view, ReadableArray position) {
        view.setPosition(Helper.toFloatArray(position, DEFAULT_ZERO_VEC));
    }

    @ReactProp(name = "rotation")
    public void setRotation(VRTNode view, ReadableArray rotation) {
        view.setRotation(Helper.toFloatArray(rotation, DEFAULT_ZERO_VEC));
    }

    @ReactProp(name = "scale")
    public void setScale(VRTNode view, ReadableArray scale) {
        view.setScale(Helper.toFloatArray(scale, new float[]{1,1,1}));
    }

    @ReactProp(name = "rotationPivot")
    public void setRotationPivot(VRTNode view, ReadableArray scale) {
        view.setRotationPivot(Helper.toFloatArray(scale, DEFAULT_ZERO_VEC));
    }

    @ReactProp(name = "scalePivot")
    public void setScalePivot(VRTNode view, ReadableArray scale) {
        view.setScalePivot(Helper.toFloatArray(scale, DEFAULT_ZERO_VEC));
    }

    @ReactProp(name = "opacity", defaultFloat = 1f)
    public void setOpacity(VRTNode view, float opacity) {
        view.setOpacity(opacity);
    }

    @ReactProp(name = "visible", defaultBoolean = true)
    public void setVisible(VRTNode view, boolean visibility) {
        view.setVisible(visibility);
    }

    @ReactProp(name = "renderingOrder", defaultInt = 0)
    public void setRenderingOrder(VRTNode view, int renderingOrder) {
        view.setRenderingOrder(renderingOrder);
    }

    @ReactProp(name = "canHover", defaultBoolean = VRTNode.DEFAULT_CAN_HOVER)
    public void setCanHover(VRTNode view, boolean canHover) {
        view.setCanHover(canHover);
    }

    @ReactProp(name = "canClick", defaultBoolean = VRTNode.DEFAULT_CAN_CLICK)
    public void setCanClick(VRTNode view, boolean canClick) {
        view.setCanClick(canClick);
    }

    @ReactProp(name = "canTouch", defaultBoolean = VRTNode.DEFAULT_CAN_TOUCH)
    public void setCanTouch(VRTNode view, boolean canTouch) {
        view.setCanTouch(canTouch);
    }

    @ReactProp(name = "canScroll", defaultBoolean = VRTNode.DEFAULT_CAN_SCROLL)
    public void setCanScroll(VRTNode view, boolean canScroll) {
        view.setCanScroll(canScroll);
    }

    @ReactProp(name = "canSwipe", defaultBoolean = VRTNode.DEFAULT_CAN_SWIPE)
    public void setCanSwipe(VRTNode view, boolean canSwipe) {
        view.setCanSwipe(canSwipe);
    }

    @ReactProp(name = "canDrag", defaultBoolean = VRTNode.DEFAULT_CAN_DRAG)
    public void setCanDrag(VRTNode view, boolean canDrag) {
        view.setCanDrag(canDrag);
    }

    @ReactProp(name = "canFuse", defaultBoolean = VRTNode.DEFAULT_CAN_FUSE)
    public void setCanFuse(VRTNode view, boolean canFuse) {
        view.setCanFuse(canFuse);
    }

    @ReactProp(name = "canPinch", defaultBoolean = VRTNode.DEFAULT_CAN_PINCH)
    public void setCanPinch(VRTNode view, boolean canPinch) {
        view.setCanPinch(canPinch);
    }

    @ReactProp(name = "canRotate", defaultBoolean = VRTNode.DEFAULT_CAN_ROTATE)
    public void setCanRotate(VRTNode view, boolean canRotate) {
        view.setCanRotate(canRotate);
    }

    @ReactProp(name = "timeToFuse", defaultFloat = VRTNode.DEFAULT_TIME_TO_FUSE_MILLIS)
    public void setTimeToFuse(VRTNode view, float durationMillis) {
        view.setTimeToFuse(durationMillis);
    }

    @ReactProp(name = "dragType")
    public void setDragType(VRTNode view, String dragType) {
        view.setDragType(dragType);
    }

    @ReactProp(name = "dragPlane")
    public void setDragPlane(VRTNode view, ReadableMap dragPlane) {
        view.setDragPlane(dragPlane);
    }

    @ReactProp(name = "animation")
    public void setAnimation(VRTNode view, @androidx.annotation.Nullable ReadableMap map) {
        view.setAnimation(map);
    }

    @ReactProp(name = "ignoreEventHandling", defaultBoolean = VRTNode.DEFAULT_IGNORE_EVENT_HANDLING)
    public void setIgnoreEventHandling(VRTNode view, boolean ignore) {
        view.setIgnoreEventHandling(ignore);
    }

    @ReactProp(name = "materials")
    public void setMaterials(VRTNode view, @Nullable ReadableArray materials) {
        // get material manager
        MaterialManager materialManager = getContext().getNativeModule(MaterialManager.class);

        ArrayList<Material> nativeMaterials = new ArrayList<>();
        if (materials != null) {
            for (int i = 0; i < materials.size(); i++) {
                Material nativeMaterial = materialManager.getMaterial(materials.getString(i));
                if (materialManager.isVideoMaterial(materials.getString(i))) {
                    if (!(nativeMaterial.getDiffuseTexture() instanceof VideoTexture)) {
                        // Recreate the material with the proper context.
                        if (view.getViroContext() != null) {
                            MaterialWrapper materialWrapper = materialManager.getMaterialWrapper(materials.getString(i));
                            VideoTexture videoTexture = new VideoTexture(view.getViroContext(), materialWrapper.getVideoTextureURI());
                            materialWrapper.recreate(videoTexture);
                            nativeMaterial = materialWrapper.getNativeMaterial();
                        }
                    }
                }

                if (nativeMaterial == null) {
                    throw new IllegalArgumentException("Material [" + materials.getString(i) + "] not found. Did you create it?");
                }

                nativeMaterials.add(nativeMaterial);
            }
        }
        view.setMaterials(nativeMaterials);
    }

    @ReactProp(name = "transformBehaviors")
    public void setTransformBehaviors(VRTNode view, @Nullable ReadableArray transformBehaviors) {

        String[] behaviors = new String[0];
        if (transformBehaviors != null) {
            behaviors = new String[transformBehaviors.size()];
            for (int i = 0; i < transformBehaviors.size(); i++) {
                behaviors[i] = transformBehaviors.getString(i);
            }
        }
        view.setTransformBehaviors(behaviors);
    }

     * This shadow node is so that views associated with FlexViews (and FlexViews themselves) have
     * their properties properly converted from 3D to 2D units. It's easiest if we just make all Nodes
     * have FlexEnabledShadowNodes, and the components can choose whether or not

    protected class FlexEnabledShadowNode extends ViroLayoutShadowNode {
        private final String TAG = ViroLog.getTag(VRTNodeManager.class);

        @ReactProp(name = "width", defaultFloat = 1)
        public void setWidth(Dynamic width) {
            if (width.getType() == ReadableType.String) {
                super.setWidth(width);
            } else if (width.getType() == ReadableType.Number){
                JavaOnlyMap map = JavaOnlyMap.of(WIDTH_NAME, width.asDouble() * s2DUnitPer3DUnit);
                Dynamic newWidth = DynamicFromMap.create(map, WIDTH_NAME);
                super.setWidth(newWidth);
            } else {
                ViroLog.warn(TAG, "Width is not of type Number or String. Doing nothing.");
            }
        }

        @ReactProp(name = "height", defaultFloat = 1)
        public void setHeight(Dynamic height) {
            if (height.getType() == ReadableType.String) {
                super.setHeight(height);
            } else if (height.getType() == ReadableType.Number) {
                JavaOnlyMap map = JavaOnlyMap.of(HEIGHT_NAME, height.asDouble() * s2DUnitPer3DUnit);
                Dynamic newHeight = DynamicFromMap.create(map, HEIGHT_NAME);
                super.setHeight(newHeight);
            } else {
                ViroLog.warn(TAG, "Height is not of type Number or String. Doing nothing.");
            }
        }

        @ReactPropGroup(names = {
                ViewProps.PADDING,
                ViewProps.PADDING_VERTICAL,
                ViewProps.PADDING_HORIZONTAL,
                ViewProps.PADDING_LEFT,
                ViewProps.PADDING_RIGHT,
                ViewProps.PADDING_TOP,
                ViewProps.PADDING_BOTTOM,
        }, defaultFloat = YogaConstants.UNDEFINED)
        public void setPaddings(int index, Dynamic padding) {
            if (padding.getType() == ReadableType.String) {
                super.setPaddings(index, padding);
            } else if (padding.getType() == ReadableType.Number) {
                JavaOnlyMap map = JavaOnlyMap.of(PADDING_NAME, padding.asDouble() * s2DUnitPer3DUnit);
                Dynamic newPadding = DynamicFromMap.create(map, PADDING_NAME);
                super.setPaddings(index, newPadding);
            } else {
                ViroLog.warn(TAG, "Padding is not of type Number of String. Doing nothing.");
            }
        }

        @ReactPropGroup(names = {
                ViewProps.BORDER_WIDTH,
                ViewProps.BORDER_LEFT_WIDTH,
                ViewProps.BORDER_RIGHT_WIDTH,
                ViewProps.BORDER_TOP_WIDTH,
                ViewProps.BORDER_BOTTOM_WIDTH,
        }, defaultFloat = YogaConstants.UNDEFINED)
        public void setBorderWidths(int index, float borderWidth) {
            super.setBorderWidths(index, borderWidth * s2DUnitPer3DUnit);
        }
    }


    @ReactProp(name = "physicsBody")
    public void setPhysicsBody(VRTNode view, ReadableMap map) {
        view.setPhysicsBody(map);
    }

    @ReactProp(name = "canCollide", defaultBoolean = VRTNode.DEFAULT_CAN_FUSE)
    public void setCanCollide(VRTNode view, boolean canCollide) {
        view.setCanCollide(canCollide);
    }

    @ReactProp(name = "viroTag")
    public void setViroTag(VRTNode view, String tag) {
        view.setViroTag(tag);
    }

    @ReactProp(name = "hasTransformDelegate", defaultBoolean = false)
    public void setViroTag(VRTNode view, boolean hasDelegate) {
        view.setOnNativeTransformDelegate(hasDelegate);
    }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTPortalSceneManager.java

/*

used in :

    @ReactProp(name = "position")
    public void setPosition(VRTCamera camera, ReadableArray position) {
        float[] posArray = {(float) position.getDouble(0), (float) position.getDouble(1),
                (float) position.getDouble(2)};
        camera.setPosition(posArray);
    }

    @ReactProp(name = "focalPoint")
    public void setFocalPoint(VRTOrbitCamera camera, ReadableArray focalPoint) {
        float[] focalPointArray = {(float) focalPoint.getDouble(0), (float) focalPoint.getDouble(1),
                (float) focalPoint.getDouble(2)};
        camera.setFocalPoint(focalPointArray);
    }

    @ReactProp(name = "fieldOfView", defaultFloat = VRTCamera.DEFAULT_FOV)
    public void setFieldOfView(VRTCamera camera, float fov) {
        camera.setFieldOfView(fov);
    }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTSceneManager.java

/*

used in :

    @ReactProp(name = "passable")
    public void setPassable(VRTPortalScene view, boolean passable) {view.setPassable(passable); }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRT3DObjectManager.java

/*

used in :

    @ReactProp(name = "canClick", defaultBoolean = VRTNode.DEFAULT_CAN_CLICK)
    public void setCanClick(VRTScene scene, boolean canClick) {
        scene.setCanClick(canClick);
    }

    @ReactProp(name = "canHover", defaultBoolean = VRTNode.DEFAULT_CAN_HOVER)
    public void setCanHover(VRTScene scene, boolean canHover) {
        scene.setCanHover(canHover);
    }

    @ReactProp(name = "canFuse", defaultBoolean = VRTNode.DEFAULT_CAN_FUSE)
    public void setCanFuse(VRTScene scene, boolean canFuse) {
        scene.setCanFuse(canFuse);
    }

    @ReactProp(name = "timeToFuse", defaultFloat = VRTNode.DEFAULT_TIME_TO_FUSE_MILLIS)
    public void setTimeToFuse(VRTScene scene, float durationMillis) {
        scene.setTimeToFuse(durationMillis);
    }
    @ReactProp(name = "soundRoom")
    public void setSoundRoom(VRTScene scene, ReadableMap soundRoom) {
        scene.setSoundRoom(soundRoom);
    }

    @ReactProp(name = "postProcessEffects")
    public void setPostProcessEffects(VRTScene scene, @Nullable ReadableArray effects) {
        scene.setPostProcessEffects(effects);
    }

    @ReactProp(name = "canCameraTransformUpdate", defaultBoolean = VRTNode.DEFAULT_CAN_CAMERA_TRANSFORM_UPDATE)
    public void setCanCameraTransformUpdate(VRTScene scene, boolean canCameraTransformUpdate) {
        scene.setCanCameraTransformUpdate(canCameraTransformUpdate);
    }

    @Override
    public Map getExportedCustomDirectEventTypeConstants() {
        Map map = MapBuilder.of(ViroEvents.ON_FUSE, MapBuilder.of("registrationName", ViroEvents.ON_FUSE));
        map.put(ViroEvents.ON_HOVER, MapBuilder.of("registrationName", ViroEvents.ON_HOVER));
        map.put(ViroEvents.ON_CLICK, MapBuilder.of("registrationName", ViroEvents.ON_CLICK));
        map.put(ViroEvents.ON_SWIPE, MapBuilder.of("registrationName", ViroEvents.ON_SWIPE));
        map.put(ViroEvents.ON_SCROLL, MapBuilder.of("registrationName", ViroEvents.ON_SCROLL));
        map.put(ViroEvents.ON_COLLIDED, MapBuilder.of("registrationName", ViroEvents.ON_COLLIDED));
        map.put(ViroEvents.ON_PLATFORM_UPDATE, MapBuilder.of("registrationName", ViroEvents.ON_PLATFORM_UPDATE));
        map.put(ViroEvents.ON_CAMERA_TRANSFORM_UPDATE, MapBuilder.of("registrationName", ViroEvents.ON_CAMERA_TRANSFORM_UPDATE));
        return map;
    }

    @ReactProp(name = "physicsWorld")
    public void setPhysicsWorld(VRTScene scene, ReadableMap map) {
        scene.setPhysicsWorld(map);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTAnimatedImageManager.java

/*

used in :

    @ReactProp(name = "source")
    public void setSource(VRT3DObject object3d, @Nullable ReadableMap map) {
        if (!map.hasKey(URI_KEY)) {
            throw new IllegalArgumentException("Unable to find \"uri\" key in given source map.");
        }

        object3d.setSource(map.getString(URI_KEY));
    }

    @ReactProp(name = "resources")
    public void setResources(VRT3DObject object3d, @Nullable ReadableArray resources) {
        List<String> resourceList = null;
        if (resources != null) {
            resourceList = new ArrayList<>();
            for (int i = 0; i < resources.size(); i++) {
                ReadableMap resourceMap = resources.getMap(i);
                if (!resourceMap.hasKey(URI_KEY)) {
                    throw new IllegalArgumentException("Received object resource map without URI key.");
                }
                resourceList.add(resourceMap.getString(URI_KEY));
            }
        }
        object3d.setResources(resourceList);
    }

    @ReactProp(name = "morphTargets")
    public void setMorphTargets(VRT3DObject object3d, @Nullable ReadableArray targets) {
        if (targets == null || targets.size() <=0) {
            return;
        }

        List<Pair<String, Float>> targetList = new ArrayList<>();
        for (int i = 0; i < targets.size(); i++) {
            ReadableMap resourceMap = targets.getMap(i);
            if (!resourceMap.hasKey("target") || !resourceMap.hasKey("weight")) {
                throw new IllegalArgumentException("Received invalid morph target map.");
            }

            String key = resourceMap.getString("target");
            Float weight = new Float(resourceMap.getDouble("weight"));
            targetList.add(new Pair<String, Float>(key, weight));
        }
        object3d.setMorphTargets(targetList);
    }

    @ReactProp(name = "type")
    public void setType(VRT3DObject object3d, @Nullable String type) {
        object3d.setType(type);
    }

    @ReactProp(name = "lightReceivingBitMask", defaultInt = 1)
    public void setLightReceivingBitMask(VRT3DObject object3d, int bitMask) {object3d.setLightReceivingBitMask(bitMask); }

    @ReactProp(name = "shadowCastingBitMask", defaultInt = 1)
    public void setShadowCastingBitMask(VRT3DObject object3d, int bitMask) {object3d.setShadowCastingBitMask(bitMask); }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTBoxManager.java

/*

used in :

    @ReactProp(name = "width", defaultFloat = 1f)
    public void setWidth(VRTAnimatedImage view, float width) {
        view.setWidth(width);
    }

    @ReactProp(name = "height", defaultFloat = 1f)
    public void setHeight(VRTAnimatedImage view, float height) {
        view.setHeight(height);
    }

    @ReactProp(name = "source")
    public void setSource(VRTAnimatedImage view, ReadableMap map) {
        view.setSource(map);
    }

    @ReactProp(name = "placeholderSource")
    public void setPlaceholderSource(VRTAnimatedImage view, ReadableMap map) {
        view.setPlaceholderSource(map);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(VRTAnimatedImage view, String resizeMode) {
        view.setResizeMode(resizeMode);
    }

    @ReactProp(name = "imageClipMode")
    public void setImageClipMode(VRTAnimatedImage view, String imageClipMode) {
        view.setImageClipMode(imageClipMode);
    }

    @ReactProp(name = "stereoMode")
    public void setStereoMode(VRTAnimatedImage view, String mode) {
        view.setStereoMode(mode);
    }

    @ReactProp(name = "paused", defaultBoolean = false)
    public void setPaused(VRTAnimatedImage view, boolean paused) {
        view.setPaused(paused);
    }

    @ReactProp(name = "loop", defaultBoolean = true)
    public void setLoop(VRTAnimatedImage view, boolean loop) {
        view.setLoop(loop);
    }


    @ReactProp(name = "lightReceivingBitMask", defaultInt = 1)
    public void setLightReceivingBitMask(VRTAnimatedImage view, int bitMask) {
        view.setLightReceivingBitMask(bitMask);
    }

    @ReactProp(name = "shadowCastingBitMask", defaultInt = 1)
    public void setShadowCastingBitMask(VRTAnimatedImage view, int bitMask) {
        view.setShadowCastingBitMask(bitMask);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTControlManager.java

/*

used in :

    @ReactProp(name = "width", defaultFloat = 1.0f)
    public void setWidth(VRTBox box, float width) {
        box.setWidth(width);
    }

    @ReactProp(name = "height", defaultFloat = 1.0f)
    public void setHeight(VRTBox box, float height) {
        box.setHeight(height);
    }

    @ReactProp(name = "length", defaultFloat = 1.0f)
    public void setLength(VRTBox box, float length) {
        box.setLength(length);
    }

    @ReactProp(name = "lightReceivingBitMask", defaultInt = 1)
    public void setLightReceivingBitMask(VRTBox box, int bitMask) {box.setLightReceivingBitMask(bitMask); }

    @ReactProp(name = "shadowCastingBitMask", defaultInt = 1)
    public void setShadowCastingBitMask(VRTBox box, int bitMask) {box.setShadowCastingBitMask(bitMask); }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTGeometryManager.java

/*

used in :

    @ReactProp(name = "highAccuracyEvents", defaultBoolean = VRTNode.DEFAULT_HIGH_ACCURACY_EVENTS)
    public void setHighAccuracyEvents(VRTControl control, boolean highAccuracyEvents) {
        control.setHighAccuracyEvents(highAccuracyEvents);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTImageManager.java

/*

used in :

    @ReactProp(name = "source")
    public void setSource(VRTImage view, ReadableMap map) {
        view.setSource(map);
    }

    @ReactProp(name = "placeholderSource")
    public void setPlaceholderSource(VRTImage view, ReadableMap map) {
        view.setPlaceholderSource(map);
    }

    @ReactProp(name = "width", defaultFloat = 1)
    public void setWidth(VRTImage view, float width) {
        view.setWidth(width);
    }

    @ReactProp(name = "height", defaultFloat = 1)
    public void setHeight(VRTImage view, float height) {
        view.setHeight(height);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(VRTImage view, String resizeMode) {
        view.setResizeMode(resizeMode);
    }

    @ReactProp(name = "imageClipMode")
    public void setImageClipMode(VRTImage view, String imageClipMode) {
        view.setImageClipMode(imageClipMode);
    }

    @ReactProp(name = "mipmap")
    public void setMipmap(VRTImage view, boolean mipmap) { view.setMipmap(mipmap); }

    @ReactProp(name = "format")
    public void setFormat(VRTImage view, String format) { view.setFormat(format); }

    @ReactProp(name = "stereoMode")
    public void setStereoMode(VRTImage view, String mode) { view.setStereoMode(mode); }

    @ReactProp(name = "lightReceivingBitMask", defaultInt = 1)
    public void setLightReceivingBitMask(VRTImage view, int bitMask) {view.setLightReceivingBitMask(bitMask); }

    @ReactProp(name = "shadowCastingBitMask", defaultInt = 1)
    public void setShadowCastingBitMask(VRTImage view, int bitMask) {view.setShadowCastingBitMask(bitMask); }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTParticleEmitterManager.java

/*

used in :

    @ReactProp(name = "duration", defaultFloat = VRTParticleEmitter.DEFAULT_DURATION)
    public void setDuration(VRTParticleEmitter emitter, float width) {
        emitter.setDuration(width);
    }

    @ReactProp(name = "delay", defaultFloat = VRTParticleEmitter.DEFAULT_DELAY)
    public void setDelay(VRTParticleEmitter emitter, float height) {
        emitter.setDelay(height);
    }

    @ReactProp(name = "loop", defaultBoolean = VRTParticleEmitter.DEFAULT_LOOP)
    public void setLoop(VRTParticleEmitter emitter, boolean length) {
        emitter.setLoop(length);
    }

    @ReactProp(name = "run", defaultBoolean = VRTParticleEmitter.DEFAULT_RUN)
    public void setRun(VRTParticleEmitter emitter, boolean length) {
        emitter.setRun(length);
    }

    @ReactProp(name = "fixedToEmitter", defaultBoolean = VRTParticleEmitter.DEFAULT_FIXED_TO_EMITTER)
    public void setFixedToEmitter(VRTParticleEmitter emitter, boolean length) {
        emitter.setFixedToEmitter(length);
    }

    @ReactProp(name = "image")
    public void setImage(VRTParticleEmitter emitter, ReadableMap map) {
        emitter.setImage(map);
    }

    @ReactProp(name = "spawnBehavior")
    public void setSpawnBehavior(VRTParticleEmitter emitter, ReadableMap map) {
        emitter.setSpawnBehavior(map);
    }

    @ReactProp(name = "particleAppearance")
    public void setParticleAppearance(VRTParticleEmitter emitter, ReadableMap map) {
        emitter.setParticleAppearance(map);
    }

    @ReactProp(name = "particlePhysics")
    public void setParticlePhysics(VRTParticleEmitter emitter, ReadableMap map) {
        emitter.setParticlePhysics(map);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolygonManager.java

/*

used in :

    @ReactProp(name = "vertices")
    public void setVertices(VRTPolygon view, ReadableArray vertices) {
        if (vertices == null || vertices.size() == 0) {
            throw new IllegalArgumentException("[ViroPolygon] Invalid Polygon vertex boundary list provided!");
        }

        List<Vector> vecVertices = new ArrayList<Vector>();
        for (int i = 0; i < vertices.size(); i ++) {
            ReadableArray vecArray = vertices.getArray(i);
            if (vecArray == null || vecArray.size() < 2) {
                throw new IllegalArgumentException("[ViroPolygon] Invalid Polygon vertex boundary list provided!");
            }

            if (vecArray.size() > 2){
                Log.w("Viro","[ViroPolygon] Polygon only supports xy coordinates! " +
                        "But a set of 3 points had been provided!");

            }

            vecVertices.add(new Vector(vecArray.getDouble(0), vecArray.getDouble(1),0));
        }


        view.setVertices(vecVertices);
    }

    @ReactProp(name = "holes")
    public void setHoles(VRTPolygon view, ReadableArray holesArray) {
        List<List<Vector>> holes = new ArrayList<>();
        for (int h = 0; h < holesArray.size(); h++) {
            ReadableArray holeArray = holesArray.getArray(h);
            if (holeArray == null || holeArray.size() == 0) {
                continue;
            }

            List<Vector> hole = new ArrayList<>();
            for (int i = 0; i < holeArray.size(); i++) {
                ReadableArray vecArray = holeArray.getArray(i);
                if (vecArray == null || vecArray.size() < 2) {
                    throw new IllegalArgumentException("[ViroPolygon] Invalid hole vertex boundary list provided!");
                }
                if (vecArray.size() > 2) {
                    Log.w("Viro","[ViroPolygon] Polygon only supports xy coordinates! " +
                            "But a set of 3 points had been provided for hole " + h + "!");

                }
                hole.add(new Vector(vecArray.getDouble(0), vecArray.getDouble(1),0));
            }
            holes.add(hole);
        }
        view.setHoles(holes);
    }

    @ReactProp(name = "uvCoordinates")
    public void setUVCoordinates(VRTPolygon view, ReadableArray coordinates) {
        float u0 = 0; float v0 = 0; float u1 = 1; float v1 = 1;

        if (coordinates == null) {
            // do-nothing
        } else if (coordinates.size() != 4) {
            throw new IllegalArgumentException("[ViroPolygon] Expected 4 uv coordinates, got " + coordinates.size());
        } else { // not null && has 4 elements
            u0 = (float) coordinates.getDouble(0);
            v0 = (float) coordinates.getDouble(1);
            u1 = (float) coordinates.getDouble(2);
            v1 = (float) coordinates.getDouble(3);
        }

        view.setUVCoordinates(u0, v0, u1, v1);
    }

    @ReactProp(name = "lightReceivingBitMask", defaultInt = 1)
    public void setLightReceivingBitMask(VRTPolygon view, int bitMask) {view.setLightReceivingBitMask(bitMask); }

    @ReactProp(name = "shadowCastingBitMask", defaultInt = 1)
    public void setShadowCastingBitMask(VRTPolygon view, int bitMask) {view.setShadowCastingBitMask(bitMask); }

    @ReactProp(name = "arShadowReceiver", defaultBoolean = false)
    public void setARShadowReceiver(VRTPolygon view, boolean arShadowReceiver) { view.setARShadowReceiver(arShadowReceiver); }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolylineManager.java

/*

used in :

    @ReactProp(name = "points")
    public void setPoints(VRTPolyline polyline, ReadableArray points) {
        polyline.setPoints(points);
    }

    @ReactProp(name = "closed", defaultBoolean = false)
    public void setClosed(VRTPolyline polyline, boolean closed) {
        polyline.setClosed(closed);
    }

    @ReactProp(name = "thickness", defaultFloat = 0.1f)
    public void setThickness(VRTPolyline polyline, float thickness) {
        polyline.setThickness(thickness);
    }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTQuadManager.java

/*

used in :

    @ReactProp(name = "width", defaultFloat = 1)
    public void setWidth(VRTQuad view, float width) {
        view.setWidth(width);
    }

    @ReactProp(name = "height", defaultFloat = 1)
    public void setHeight(VRTQuad view, float height) {
        view.setHeight(height);
    }

    @ReactProp(name = "uvCoordinates")
    public void setUVCoordinates(VRTQuad view, ReadableArray coordinates) {
        float u0 = 0; float v0 = 0; float u1 = 1; float v1 = 1;

        if (coordinates == null) {
            // do-nothing
        } else if (coordinates.size() != 4) {
            throw new IllegalArgumentException("[ViroSurface] Expected 4 uv coordinates, got " + coordinates.size());
        } else { // not null && has 4 elements
            u0 = (float) coordinates.getDouble(0);
            v0 = (float) coordinates.getDouble(1);
            u1 = (float) coordinates.getDouble(2);
            v1 = (float) coordinates.getDouble(3);
        }

        view.setUVCoordinates(u0, v0, u1, v1);
    }

    @ReactProp(name = "lightReceivingBitMask", defaultInt = 1)
    public void setLightReceivingBitMask(VRTQuad view, int bitMask) {view.setLightReceivingBitMask(bitMask); }

    @ReactProp(name = "shadowCastingBitMask", defaultInt = 1)
    public void setShadowCastingBitMask(VRTQuad view, int bitMask) {view.setShadowCastingBitMask(bitMask); }

    @ReactProp(name = "arShadowReceiver", defaultBoolean = false)
    public void setARShadowReceiver(VRTQuad view, boolean arShadowReceiver) { view.setARShadowReceiver(arShadowReceiver); }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTSphereManager.java

/*

used in :

    @ReactProp(name = "facesOutward", defaultBoolean = VRTSphere.DEFAULT_FACES_OUTWARD)
    public void setFacesOutward(VRTSphere sphere, boolean facesOutward) {
        sphere.setFacesOutward(facesOutward);
    }

    @ReactProp(name = "widthSegmentCount", defaultInt = VRTSphere.DEFAULT_WIDTH_SEGMENT)
    public void setWidthSegmentCount(VRTSphere sphere, int widthSegmentCount) {
        sphere.setWidthSegmentCount(widthSegmentCount);
    }

    @ReactProp(name = "heightSegmentCount", defaultInt = VRTSphere.DEFAULT_HEIGHT_SEGMENT)
    public void setHeightSegmentCount(VRTSphere sphere, int heightSegmentCount) {
        sphere.setHeightSegmentCount(heightSegmentCount);
    }

    @ReactProp(name = "radius", defaultFloat = VRTSphere.DEFAULT_RADIUS)
    public void setRadius(VRTSphere sphere, float radius) {
        sphere.setRadius(radius);
    }

    @ReactProp(name = "lightReceivingBitMask", defaultInt = 1)
    public void setLightReceivingBitMask(VRTSphere sphere, int bitMask) {sphere.setLightReceivingBitMask(bitMask); }

    @ReactProp(name = "shadowCastingBitMask", defaultInt = 1)
    public void setShadowCastingBitMask(VRTSphere sphere, int bitMask) {sphere.setShadowCastingBitMask(bitMask); }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTTextManager.java

/*

used in :


    @ReactProp(name = "width", defaultFloat = VRTText.DEFAULT_WIDTH)
    public void setWidth(VRTText text, float width) {
        text.setWidth(width);
    }

    @ReactProp(name = "height", defaultFloat = VRTText.DEFAULT_HEIGHT)
    public void setHeight(VRTText text, float height) {
        text.setHeight(height);
    }

    @ReactProp(name = "extrusionDepth", defaultFloat = 0)
    public void setExtrusionDepth(VRTText text, float extrusionDepth) { text.setExtrusionDepth(extrusionDepth); }

    @ReactProp(name = "text")
    public void setText(VRTText text, String textString) {
        text.setText(textString);
    }

    @ReactProp(name = "color", customType = "Color")
    public void setColor(VRTText text, @Nullable Integer color) {
        if(color == null) {
            text.setColor(Color.WHITE);
        } else {
            text.setColor(color);
        }
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(VRTText text, String fontFamily) {
        text.setFontFamilyName(fontFamily);
    }

    @ReactProp(name = "fontSize", defaultInt = VRTText.DEFAULT_FONT_SIZE)
    public void setFontSize(VRTText text, int size) {
        text.setSize(size);
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(VRTText text, String fontStyle) {
        text.setFontStyle(fontStyle);
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(VRTText text, String fontWeight) {
        text.setFontWeight(fontWeight);
    }

    @ReactProp(name = "outerStroke")
    public void setOuterStroke(VRTText text, @androidx.annotation.Nullable ReadableMap map) {
        text.setOuterStroke(map);
    }

    @ReactProp(name = "maxLines", defaultInt = VRTText.DEFAULT_MAX_LINES)
    public void setMaxLines(VRTText text, int maxLines) {
        text.setMaxLines(maxLines);
    }

    @ReactProp(name = "textClipMode")
    public void setTextClipMode(VRTText text, String textClipMode) {
        text.setTextClipMode(textClipMode);
    }

    @ReactProp(name = "textAlign")
    public void setHorizontalAlignment(VRTText text, String textAlign) {
        text.setHorizontalAlignment(textAlign);
    }

    @ReactProp(name = "textAlignVertical")
    public void setVerticalAlignment(VRTText text, String textAlignVertical) {
        text.setVerticalAlignment(textAlignVertical);
    }

    @ReactProp(name = "textLineBreakMode")
    public void setTextLineBreakMode(VRTText text, String textLineBreakMode) {
        text.setTextLineBreakMode(textLineBreakMode);
    }

    @ReactProp(name = "lightReceivingBitMask", defaultInt = 1)
    public void setLightReceivingBitMask(VRTText text, int bitMask) {text.setLightReceivingBitMask(bitMask); }

    @ReactProp(name = "shadowCastingBitMask", defaultInt = 1)
    public void setShadowCastingBitMask(VRTText text, int bitMask) {text.setShadowCastingBitMask(bitMask); }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTVideoSurfaceManager.java

/*

used in :

    @ReactProp(name = "width", defaultFloat = 1f)
    public void setWidth(VRTVideoSurface view, float width) {
        view.setWidth(width);
    }

    @ReactProp(name = "height", defaultFloat = 1f)
    public void setHeight(VRTVideoSurface view, float height) {
        view.setHeight(height);
    }

    @ReactProp(name = "paused", defaultBoolean = true)
    public void setPaused(VRTVideoSurface view, boolean paused) {
        view.setPaused(paused);
    }

    @ReactProp(name = "loop", defaultBoolean = false)
    public void setLoop(VRTVideoSurface view, boolean loop) {
        view.setLoop(loop);
    }

    @ReactProp(name = "muted", defaultBoolean = false)
    public void setMuted(VRTVideoSurface view, boolean muted) {
        view.setMuted(muted);
    }

    @ReactProp(name = "volume", defaultFloat = 1f)
    public void setVolume(VRTVideoSurface view, float volume) {
        view.setVolume(volume);
    }

    @ReactProp(name = "stereoMode")
    public void setStereoMode(VRTVideoSurface view, String mode) { view.setStereoMode(mode); }

    @ReactProp(name = "source")
    public void setSource(VRTVideoSurface view, @Nullable ReadableMap map) {
        // TODO: verify/make sure this work with local files (ie. release builds)
        view.setSource(map.getString("uri"));
    }

    @ReactProp(name = "lightReceivingBitMask", defaultInt = 1)
    public void setLightReceivingBitMask(VRTVideoSurface view, int bitMask) {view.setLightReceivingBitMask(bitMask); }

    @ReactProp(name = "shadowCastingBitMask", defaultInt = 1)
    public void setShadowCastingBitMask(VRTVideoSurface view, int bitMask) {view.setShadowCastingBitMask(bitMask); }


*/