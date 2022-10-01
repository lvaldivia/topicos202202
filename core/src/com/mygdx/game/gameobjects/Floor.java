package com.mygdx.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.core.objects.PhysicsObject;
import com.mygdx.game.factory.physics.BodyDefFactory;
import com.mygdx.game.factory.physics.FixtureFactory;

public class Floor extends PhysicsObject {

    public Floor(World world, Texture texture, Vector2 position) {
        super(world, texture, position);
        body = world.createBody(BodyDefFactory.createFloor());
        fixture = FixtureFactory.createFloorFixture(body);
    }

    @Override
    protected void update(float delta) {

    }
}
