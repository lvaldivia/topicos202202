package com.mygdx.game.factory.physics;

import com.badlogic.gdx.physics.box2d.BodyDef;

public class BodyDefFactory {

    public static BodyDef createPlayer(){
        BodyDef def = new BodyDef();
        def.position.set(0,0.5f);
        def.type = BodyDef.BodyType.DynamicBody;
        return def;
    }

    public static BodyDef createSpikes(float x){
        return null;
    }

    public static BodyDef createFloor(){
        BodyDef def = new BodyDef();
        def.position.set(0,-1);
        return def;
    }
}
