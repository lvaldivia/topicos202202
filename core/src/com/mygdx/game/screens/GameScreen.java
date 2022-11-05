package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.ContactListener;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.Manifold;
import com.mygdx.game.core.screens.PhysicsScreen;
import com.mygdx.game.entities.Floor;
import com.mygdx.game.entities.Player;
import com.mygdx.game.entities.Spike;

public class GameScreen extends PhysicsScreen {

    private Player player;
    private Floor floor;
    private Spike spike;



    @Override
    protected void init() {
        this.debugging = true;
        this.gravity = new Vector2(0,-10);
        super.init();
        Gdx.app.log("SCREEN","GAME PHYSICS");
        player = new Player(world,null,null);
        floor = new Floor(world,null,null);
        spike = new Spike(world,null,null);
        world.setContactListener(new ContactListener() {
            @Override
            public void beginContact(Contact contact) {
                Fixture fixtureA = contact.getFixtureA();
                Fixture fixtureB = contact.getFixtureB();
                if(fixtureA == player.getFixture() && fixtureB == floor.getFixture()){
                    Gdx.app.log("SCREEN","HUBO COLISION ENTRE PISO Y PLAYER");
                }

                if(fixtureA == spike.getFixture() && fixtureB == floor.getFixture()){
                    Gdx.app.log("SCREEN","HUBO COLISION ENTRE PISO Y SPIKE");
                }
            }

            @Override
            public void endContact(Contact contact) {

            }

            @Override
            public void preSolve(Contact contact, Manifold oldManifold) {

            }

            @Override
            public void postSolve(Contact contact, ContactImpulse impulse) {

            }
        });
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        if(Gdx.input.isTouched()){
            player.jump();
        }
    }

    @Override
    protected void draw(float delta) {

    }


    @Override
    public void dispose() {
        super.dispose();
        world.dispose();
    }
}
