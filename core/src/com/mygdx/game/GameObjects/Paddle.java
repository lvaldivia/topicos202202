package com.mygdx.game.GameObjects;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Paddle extends Figure{
    int height;
    int width;

    public Paddle(int x, int y, int height, int width) {
        super(x,y);
        this.height = height;
        this.width = width;
    }

    public void draw(ShapeRenderer shapeRenderer) {
        super.draw(shapeRenderer);
        shapeRenderer.rect(x,y,height,width);
    }
}
