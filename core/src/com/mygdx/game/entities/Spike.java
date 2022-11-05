package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.core.objects.PhysicsObject;
import com.mygdx.game.factory.PhysicsFactory;

public class Spike extends PhysicsObject {
    public Spike(World world, Texture texture, Vector2 position) {
        super(world, texture, position);
    }

    @Override
    protected void update(float delta) {

    }

    @Override
    protected void createFixture() {
        body = world.createBody(PhysicsFactory.createDef(BodyDef.BodyType.DynamicBody,new Vector2(50,50)));
        Vector2[] vertices = new Vector2[3];
        vertices[0] = new Vector2(-50f,50f);
        vertices[1] = new Vector2(50f,-50f);
        vertices[2] = new Vector2(50,50f);
        PolygonShape spikeShape = PhysicsFactory.createShape(vertices);
        fixture = body.createFixture(spikeShape,1);
        spikeShape.dispose();
    }
}
