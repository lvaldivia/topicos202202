package com.mygdx.game.core.screens;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

public abstract class PhysicsScreen extends BaseScreen {
    protected World world;
    protected boolean debugging = false;
    protected Vector2 gravity = new Vector2(0,-10);
    protected Box2DDebugRenderer renderer;
    @Override
    protected void init() {
        world = new World(gravity,true);
        if(debugging){
            renderer = new Box2DDebugRenderer();
        }
    }

    @Override
    protected void draw(float delta) {
        world.step(delta,6,2);
    }

    @Override
    public void dispose() {
        super.dispose();
        world.dispose();
    }
}
