package com.mygdx.game.screens;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public abstract class PhysicsScreen extends BaseScreen{
    protected World world;
    protected Vector2 gravity = new Vector2(0,-10);

    @Override
    protected void init() {
        world = new World(gravity,true);
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
