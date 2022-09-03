package com.mygdx.game.GameObjects;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.Interface.IFigure;

public class Paddle extends Figure implements IFigure {

    public Paddle(int x, int y, int height, int width) {
        super(x,y,height,width);
    }

    protected void draw(ShapeRenderer shapeRenderer) {
        super.draw(shapeRenderer);
        shapeRenderer.rect(x,y,height,width);
    }

    @Override
    public void render(ShapeRenderer shapeRenderer) {
        draw(shapeRenderer);
    }

    @Override
    public void draw() {

    }
}
