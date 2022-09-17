package com.mygdx.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

public class Player extends GameObject{
    public Player(World world, Texture texture, Vector2 position) {
        super(world, texture, position);
        BodyDef def = new BodyDef();
        def.position.set(position);
        def.type = BodyDef.BodyType.DynamicBody;
        body = world.createBody(def);
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(0.5f,0.5f);
        fixture = body.createFixture(shape,3);
        shape.dispose();
        //cambiar tamaño y explicar conversión de pixel a metros
    }

    @Override
    protected void update(float delta) {

    }
}
