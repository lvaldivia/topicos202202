package com.mygdx.game.Factory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Ball;
import com.mygdx.game.GameObjects.Paddle;
import com.mygdx.game.Interface.IFactory;

import java.util.ArrayList;
import java.util.Random;

public class BallFactory implements IFactory {
    ArrayList<Ball> balls = new ArrayList<>();
    Random r = new Random();

    public BallFactory(int total){
        for (int i = 0; i < total; i++) {
            balls.add(new Ball(r.nextInt(Gdx.graphics.getWidth()),
                    r.nextInt(Gdx.graphics.getHeight()),
                    20,
                    r.nextInt(15),
                    r.nextInt(15)));
        }
    }

    public BallFactory(){
        for (int i = 0; i < 10; i++) {
            balls.add(new Ball(r.nextInt(Gdx.graphics.getWidth()),
                    r.nextInt(Gdx.graphics.getHeight()),
                    r.nextInt(100),
                    r.nextInt(15),
                    r.nextInt(15)));
        }
    }

    public void collideWithPaddle(Paddle paddle){
        if(balls.get(0).collideWith(paddle)){
            balls.get(0).bounce();
        }
    }

    @Override
    public void render(ShapeRenderer renderer) {
        for (Ball ball: balls) {
            ball.draw();
            ball.render(renderer);
        }
    }

    @Override
    public void destroy() {

    }
}
