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
        ballFactory = new BallFactory();
        paddleFactory = new PaddleFactory();
        shapeRenderer = new ShapeRenderer();
        brickFactory = new BrickFactory();
        InitGame();
    }

    private void InitGame(){
        int y =  0;
        int index = -1;
        for (int i = 0; i < 45; i++) {
            index++;
            if(index % 11 == 0){
                y += 50;
                index = 0;
            }
            brickFactory.build(index,y);
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
        brickFactory.collideWithBall(ballFactory.getBall());
    }

    @Override
    public void dispose() {

    }
}
