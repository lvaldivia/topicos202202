package com.mygdx.game.Factory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Ball;

import java.util.ArrayList;
import java.util.Random;

public class BallFactory {
    ArrayList<Ball> balls = new ArrayList<>();
    Random r = new Random();

    public BallFactory(int total){
        for (int i = 0; i < total; i++) {
            balls.add(new Ball(r.nextInt(Gdx.graphics.getWidth()),
                    r.nextInt(Gdx.graphics.getHeight()),
                    r.nextInt(100),
                    r.nextInt(15),
                    r.nextInt(15)));
        }
    }

    @Override
    public String toString() {
        return "BallFactory{" +
                "balls=" + balls.size() +
                ", r=" + r +
                '}';
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

    public void render(ShapeRenderer shapeRenderer){
        for (Ball ball: balls) {
            ball.draw();
            ball.render(shapeRenderer);
        }
    }
}
