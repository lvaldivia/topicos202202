package com.mygdx.game.Factory;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Paddle;

public class PaddleFactory {
    public Paddle getPaddle() {
        return paddle;
    }

    public void setPaddle(Paddle paddle) {
        this.paddle = paddle;
    }

    private Paddle paddle;
    public PaddleFactory() {
        this.paddle = new Paddle(150,0,200,30);
    }

    public void render(ShapeRenderer renderer){
        paddle.render(renderer);
    }

    public void update(int x){
        paddle.setX(x);
    }
}
