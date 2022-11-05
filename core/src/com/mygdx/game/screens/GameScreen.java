package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.core.screens.BaseScreen;

public class GameScreen extends BaseScreen {
    private OrthographicCamera camera;
    private World world;
    private Fixture playerFixture;
    private Box2DDebugRenderer renderer;
    private Body player;
    private Fixture floorFixture;
    private Body floor;

    @Override
    protected void init() {
        world = new World(new Vector2(0,-10),true);
        renderer = new Box2DDebugRenderer();
        //camera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        camera = new OrthographicCamera(32,18);
        Gdx.app.log("SCREEN","GAME PHYSICS");
        player = world.createBody(createDef(BodyDef.BodyType.DynamicBody));
        floor = world.createBody(createDef(BodyDef.BodyType.StaticBody));

        PolygonShape playShape = new PolygonShape();
        playShape.setAsBox(0.5f,0.5f);
        playerFixture = player.createFixture(playShape,1);
        playShape.dispose();

        PolygonShape floorShape = new PolygonShape();
        floorShape.setAsBox(1000,2);
        floorFixture = floor.createFixture(floorShape,1);
        floorShape.dispose();

    }

    private BodyDef createDef(BodyDef.BodyType type){
        BodyDef def = new BodyDef();
        def.position.set(0,10);
        def.type = type;
        return def;
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        world.step(delta,6,2);
        camera.update();
        renderer.render(world, camera.combined);
    }

    @Override
    protected void draw(float delta) {

    }


    @Override
    public void dispose() {
        super.dispose();
        world.destroyBody(player);
        world.dispose();
    }
}
