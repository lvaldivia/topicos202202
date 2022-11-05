package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.core.screens.BaseScreen;
import com.mygdx.game.entities.Floor;
import com.mygdx.game.entities.Player;
import com.mygdx.game.entities.Spike;

public class GameScreen extends BaseScreen {
    private OrthographicCamera camera;
    private World world;
    private Box2DDebugRenderer renderer;
    private Player player;
    private Floor floor;
    private Spike spike;

    @Override
    protected void init() {
        Gdx.app.log("SCREEN","GAME PHYSICS");
        world = new World(new Vector2(0,-10),true);
        camera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        renderer = new Box2DDebugRenderer();
        player = new Player(world,null,null);
        floor = new Floor(world,null,null);
        spike = new Spike(world,null,null);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        world.step(delta,6,2);
        camera.update();
        renderer.render(world,camera.combined);
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
