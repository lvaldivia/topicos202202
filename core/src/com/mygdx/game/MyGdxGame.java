package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.Factory.BallFactory;
import com.mygdx.game.Factory.BrickFactory;
import com.mygdx.game.Factory.PaddleFactory;

public class MyGdxGame extends ApplicationAdapter {
    ShapeRenderer shapeRenderer;
    BallFactory ballFactory;
    PaddleFactory paddleFactory;
    BrickFactory brickFactory;
    @Override
    public void create() {
        ballFactory = new BallFactory(1);
        paddleFactory = new PaddleFactory();
        shapeRenderer = new ShapeRenderer();
        brickFactory = new BrickFactory();
        for (int i = 0; i < 11; i++) {
            brickFactory.build(i);
        }
    }
    
    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        ballFactory.render(shapeRenderer);
        paddleFactory.render(shapeRenderer);
        brickFactory.render(shapeRenderer);
		shapeRenderer.end();
        update();
    }

    private void update(){
        paddleFactory.update(Gdx.input.getX());
        ballFactory.collideWithPaddle(paddleFactory.getPaddle());
    }

    @Override
    public void dispose() {

    }
}
