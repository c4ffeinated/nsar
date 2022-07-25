// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/JSApplicationCausedNativeException.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTBaseSound.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNode.java

/*

    used in :

    private void recreatePhysicsBodyIfNeeded(ReadableMap map){
        float mass = 0;
        if (map.hasKey("mass")){
            mass = (float) map.getDouble("mass");
        }

        // Determine if the physics body type has changed
        String bodyTypeProp = map.getString("type");
        String bodyTypeCurrent = (mPhysicsMap != null && mPhysicsMap.hasKey("type")) ?
                mPhysicsMap.getString("type") : null;
        boolean hasBodyTypeChanged = bodyTypeProp != bodyTypeCurrent;
        if (bodyTypeProp != null){
            hasBodyTypeChanged = !bodyTypeProp.equals(bodyTypeCurrent);
        }

        String bodyTypeError = PhysicsBody.checkIsValidBodyType(bodyTypeProp, mass);
        if (bodyTypeError != null){
            throw new JSApplicationCausedNativeException(bodyTypeError);
        }

        PhysicsBody.RigidBodyType rigidBodyType;
        if (bodyTypeProp.equalsIgnoreCase("Dynamic")) {
            rigidBodyType = PhysicsBody.RigidBodyType.DYNAMIC;
        }
        else if (bodyTypeProp.equalsIgnoreCase("Static")) {
            rigidBodyType = PhysicsBody.RigidBodyType.STATIC;
        }
        else if (bodyTypeProp.equalsIgnoreCase("Kinematic")) {
            rigidBodyType = PhysicsBody.RigidBodyType.KINEMATIC;
        }
        else {
            throw new JSApplicationCausedNativeException("Invalid physics body type [" + bodyTypeProp + "]");
        }

        // Determine if the physics shape has changed
        ReadableMap shapeTypeProp = map.hasKey("shape") ? map.getMap("shape") : null;
        ReadableMap shapeTypeCurrent = (mPhysicsMap != null && mPhysicsMap.hasKey("shape")) ?
                mPhysicsMap.getMap("shape") : null;
        boolean hasShapeChanged = shapeTypeProp != shapeTypeCurrent;
        if (shapeTypeProp != null){
            hasShapeChanged = !shapeTypeProp.equals(shapeTypeCurrent);
        }

        // Create or update the VROPhysicsBody only if needed
        if (!hasPhysicsBody || hasBodyTypeChanged || hasShapeChanged){
            String propShapeType = null;
            float params[] = {};
            PhysicsShape shape = null;

            // Recreate a physics shape with the latest properties by grabbing
            // the current shapeType (required in JS if providing a physics shape)
            if (shapeTypeProp != null) {
                propShapeType = shapeTypeProp.getString("type");
                if (shapeTypeProp.hasKey("params")) {
                    ReadableArray readableParams = shapeTypeProp.getArray("params");
                    params = new float[readableParams.size()];
                    for (int i = 0; i < readableParams.size(); i++) {
                        params[i] = (float) readableParams.getDouble(i);
                    }
                }

                String error = PhysicsBody.checkIsValidShapeType(propShapeType, params);
                if (error != null){
                    throw new JSApplicationCausedNativeException(error);
                }

                if (propShapeType.equalsIgnoreCase("sphere")) {
                    shape = new PhysicsShapeSphere(params[0]);
                }
                else if (propShapeType.equalsIgnoreCase("box")) {
                    shape = new PhysicsShapeBox(params[0], params[1], params[2]);
                }
                else if (propShapeType.equalsIgnoreCase("compound")) {
                    shape = new PhysicsShapeAutoCompound();
                }
                else {
                    throw new JSApplicationCausedNativeException("Invalid shape type [" + propShapeType + "]");
                }
            }

            if (!hasPhysicsBody || hasBodyTypeChanged){
                clearPhysicsBody();
                createPhysicsBody(rigidBodyType, mass, shape);
            } else {
                mNodeJni.getPhysicsBody().setShape(shape);
            }
        }
    }

    private void updatePhysicsBodyProperties(ReadableMap map){
        if (map.hasKey("mass")) {
            float mass = (float)map.getDouble("mass");
            String bodyType = map.getString("type");
            String bodyTypeError = PhysicsBody.checkIsValidBodyType(bodyType, mass);
            if (bodyTypeError != null){
                throw new JSApplicationCausedNativeException(bodyTypeError);
            }
            mNodeJni.getPhysicsBody().setMass(mass);
        }

        if (map.hasKey("inertia")){
            ReadableArray paramsArray = map.getArray("inertia");
            float inertiaArray[] = new float[paramsArray.size()];
            for (int i = 0; i < paramsArray.size(); i ++){
                inertiaArray[i] = (float) paramsArray.getDouble(i);
            }

            if (inertiaArray.length != 3){
                throw new JSApplicationCausedNativeException("Incorrect parameters " +
                        "provided for inertia, expected: [x, y, z]!");
            }

            mNodeJni.getPhysicsBody().setMomentOfInertia(new Vector(inertiaArray));
        }

        if (map.hasKey("friction")) {
            mNodeJni.getPhysicsBody().setFriction((float)map.getDouble("friction"));
        }

        if (map.hasKey("restitution")) {
            mNodeJni.getPhysicsBody().setRestitution((float)map.getDouble("restitution"));
        }

        if (map.hasKey("enabled")) {
            mPhysicsEnabled = map.getBoolean("enabled");
        } else {
            mPhysicsEnabled = true;
        }
        mNodeJni.getPhysicsBody().setEnabled(shouldAppear() && mPhysicsEnabled);

        if (map.hasKey("useGravity")) {
            String bodyType = map.getString("type");
            if (!bodyType.equalsIgnoreCase("dynamic")){
                ViroLog.warn(TAG,"Attempted to set useGravity for non-dynamic phsyics bodies.");
            } else {
                mNodeJni.getPhysicsBody().setUseGravity(map.getBoolean("useGravity"));
            }
        }

        if (map.hasKey("velocity")) {
            ReadableArray paramsArray = map.getArray("velocity");
            float velocityArray[] = new float[paramsArray.size()];
            for (int i = 0; i < paramsArray.size(); i ++){
                velocityArray[i] = (float) paramsArray.getDouble(i);
            }

            if (velocityArray.length != 3){
                throw new JSApplicationCausedNativeException("Incorrect parameters " +
                        "provided for velocity, expected: [x, y, z]!");
            }

            mNodeJni.getPhysicsBody().setVelocity(new Vector(velocityArray), true);
        } else {
            mNodeJni.getPhysicsBody().setVelocity(new Vector(0, 0, 0), true);
        }
    }

    private void applyForcesOnBody(ReadableMap map){
        // Determine if the applied torque has changed
        ReadableArray torqueProp = map.hasKey("torque") ? map.getArray("torque") : null;
        boolean currentMapHasTorque = mPhysicsMap != null && mPhysicsMap.hasKey("torque");
        ReadableArray currentTorque = currentMapHasTorque ? mPhysicsMap.getArray("torque") : null;
        boolean hasTorqueChanged = torqueProp != currentTorque;
        if (torqueProp != null){
            hasTorqueChanged = !torqueProp.equals(currentTorque);
        }

        // Determine if the applied force has changed
        ArrayList<ReadableMap> forcesListProp = getForcesFromReactMap(map);
        ArrayList<ReadableMap> forcesListCurrent = getForcesFromReactMap(mPhysicsMap);
        boolean hasForceChanged = !forcesListProp.equals(forcesListCurrent);

        // If nothing has changed, return
        if (!hasForceChanged && !hasTorqueChanged){
            return;
        }

        mNodeJni.getPhysicsBody().clearForce();

        // Apply Torque
        if (map.hasKey("torque")){
            ReadableArray paramsArray = map.getArray("torque");
            float torqueArray[] = new float[paramsArray.size()];
            for (int i = 0; i < paramsArray.size(); i ++){
                torqueArray[i] = (float) paramsArray.getDouble(i);
            }

            if (torqueArray.length != 3){
                throw new JSApplicationCausedNativeException("Incorrect parameters " +
                        "provided for torque, expected: [x, y, z]!");
            }

            mNodeJni.getPhysicsBody().applyTorque(new Vector(torqueArray));
        }

        // Apply force
        for (ReadableMap forceMap : forcesListProp){
            float forceArray[];
            if (forceMap.hasKey("value")){
                ReadableArray paramsArray = forceMap.getArray("value");
                forceArray = new float[paramsArray.size()];
                for (int i = 0; i < paramsArray.size(); i ++){
                    forceArray[i] = (float) paramsArray.getDouble(i);
                }

                if (forceArray.length != 3){
                    throw new JSApplicationCausedNativeException("Incorrect parameters " +
                            "provided for force's value, expected: [x, y, z]!");
                }
            } else {
                throw new JSApplicationCausedNativeException("Incorrect parameters: missing" +
                        " value of format [x, y, z] for force!");
            }

            float positionArray[];
            if (forceMap.hasKey("position")){
                ReadableArray paramsArray = forceMap.getArray("position");
                positionArray = new float[paramsArray.size()];
                for (int i = 0; i < paramsArray.size(); i ++){
                    positionArray[i] = (float) paramsArray.getDouble(i);
                }

                if (positionArray.length != 3){
                    throw new JSApplicationCausedNativeException("Incorrect parameters " +
                            "provided for force's position, expected: [x, y, z]!");
                }
            } else {
                // Fallback to a central force if no position is provided
                positionArray = new float[]{0,0,0};
            }

            mNodeJni.getPhysicsBody().applyForce(new Vector(forceArray), new Vector(positionArray));
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTScene.java

/*

    public void setPhysicsWorld(ReadableMap map){
        if (map == null){
            return;
        }

        if (map.hasKey("gravity")){
            ReadableArray readableParams = map.getArray("gravity");
            if (readableParams.size() != 3){
                throw new JSApplicationCausedNativeException("Incorrect parameters provided " +
                        "for gravity, expected: [x, y, z]!");
            } else {
                float params[] = new float[readableParams.size()];
                for (int i = 0; i < readableParams.size(); i ++){
                    params[i] = (float) readableParams.getDouble(i);
                }
                mNativeScene.getPhysicsWorld().setGravity(new Vector(params));
            }
        }

        if (map.hasKey("drawBounds")) {
            mNativeScene.getPhysicsWorld().setDebugDraw(map.getBoolean("drawBounds"));
        } else {
            mNativeScene.getPhysicsWorld().setDebugDraw(false);
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SceneModule.java

/*
used in :

    @ReactMethod
    public void findCollisionsWithShapeAsync(final int viewTag, final ReadableArray fromPos, final ReadableArray toPos,
                               final String shapeTypeString, final ReadableArray paramsArray,
                               final String tag, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(sceneView instanceof VRTScene)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling findCollisionsWithShapeAsync: expected a ViroScene!");
                }

                float[] fromPosArray = Helper.toFloatArray(fromPos);
                float[] toPosArray = Helper.toFloatArray(toPos);
                if (fromPosArray.length != 3 || toPosArray.length !=3){
                    throw new IllegalViewOperationException("Invalid From / To positions or tag " +
                            "provided for findCollisionsWithShapeAsync!");
                }

                float[] params = Helper.toFloatArray(paramsArray);
                String error = PhysicsBody.checkIsValidShapeType(shapeTypeString, params);
                if (error != null){
                    throw new IllegalViewOperationException(error);
                }

                PhysicsShape shape = null;
                if (shapeTypeString.equalsIgnoreCase("sphere")) {
                    shape = new PhysicsShapeSphere(params[0]);
                }
                else if (shapeTypeString.equalsIgnoreCase("box")) {
                    shape = new PhysicsShapeBox(params[0], params[1], params[2]);
                }
                else if (shapeTypeString.equalsIgnoreCase("compound")) {
                    shape = new PhysicsShapeAutoCompound();
                }
                else {
                    throw new JSApplicationCausedNativeException("Invalid shape type [" + shapeTypeString + "]");
                }

                String rayCastTag = tag != null ? tag : "";
                VRTScene scene = (VRTScene) sceneView;
                scene.findCollisionsWithShapeAsync(fromPosArray, toPosArray, shape, rayCastTag,
                        new PhysicsWorld.HitTestListener() {
                            @Override
                            public void onComplete(boolean hasHit) {
                                promise.resolve(hasHit);
                            }
                        });
            }
        });
    }

*/