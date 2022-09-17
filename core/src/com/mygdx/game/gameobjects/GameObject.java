package com.mygdx.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Actor;

public abstract class GameObject extends Actor {
    protected boolean alive = true;
    protected World world;
    protected Body body;
    protected Fixture fixture;
    protected Vector2 position;
    protected Texture texture;

    public GameObject(World world,Texture texture, Vector2 position){
        this.world = world;
        this.texture = texture;
        this.position = position;
    }

    public void destroy(){
        if(body != null){
            if(fixture != null){
                body.destroyFixture(fixture);
            }
            world.destroyBody(body);
        }
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        update(delta);
    }

    protected abstract void update(float delta);

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }
}
