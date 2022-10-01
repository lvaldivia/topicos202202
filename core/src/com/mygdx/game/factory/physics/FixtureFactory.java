package com.mygdx.game.factory.physics;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.PolygonShape;

public class FixtureFactory {

    public static Fixture createPlayerFixture(Body playerBody){
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(0.5f,0.5f);
        Fixture fixture = playerBody.createFixture(shape,3);
        shape.dispose();
        return fixture;
    }

    public static Fixture createFloorFixture(Body floorBody){
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(500,1);
        Fixture fixture = floorBody.createFixture(shape,3);
        shape.dispose();
        return fixture;
    }

    public static Fixture createSpikeFixture(Body spikeBody){
        return null;
    }
}
