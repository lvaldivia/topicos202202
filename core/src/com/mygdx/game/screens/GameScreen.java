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


    }



    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    }

    @Override
    protected void draw(float delta) {

    }


    @Override
    public void dispose() {
        super.dispose();

    }
}
