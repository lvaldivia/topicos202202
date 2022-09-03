package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Ball;

import java.util.ArrayList;
import java.util.Random;

public class MyGdxGame extends ApplicationAdapter {
    ShapeRenderer shapeRenderer;
    /*int x = 50;
    int y = 50;
    int xSpeed = 5;*/
    ArrayList<Ball> balls = new ArrayList<>();
    Random r = new Random();

    @Override
    public void create() {
        shapeRenderer = new ShapeRenderer();
        for (int i = 0; i < 10; i++) {
            balls.add(new Ball(r.nextInt(Gdx.graphics.getWidth()),
					r.nextInt(Gdx.graphics.getHeight()),
					r.nextInt(100),
					r.nextInt(15),
					r.nextInt(15)));
        }
        //ball = new Ball(150,200,70,12,5);
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		/*x+= xSpeed;
		if(x > Gdx.graphics.getWidth()){
			xSpeed = -5;
		}
		if(x<0){
			xSpeed = 5;
		}
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.circle(x,y,50);
		shapeRenderer.end();*/
		/*.update();
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		ball.draw(shapeRenderer);
		shapeRenderer.end();*/
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		for (Ball ball: balls) {
			ball.update();
			ball.draw(shapeRenderer);
		}
		shapeRenderer.end();
    }

    @Override
    public void dispose() {

    }
}
