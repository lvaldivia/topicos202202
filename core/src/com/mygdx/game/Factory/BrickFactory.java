package com.mygdx.game.Factory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Brick;
import com.mygdx.game.Interface.IFactory;

import java.util.ArrayList;

public class BrickFactory implements IFactory {
    ArrayList<Brick> bricks;
    public BrickFactory() {
        bricks = new ArrayList<>();
    }

    public void build(int index){
        Brick brick = new Brick(0, 0,40,10);
        int x = index * (brick.getWidth() + 20);
        brick.setY(Gdx.graphics.getHeight() - brick.getHeight());
        brick.setX(x);
        bricks.add(brick);
    }

    @Override
    public void render(ShapeRenderer renderer) {
        for (Brick brick: bricks) {
            brick.draw();
            brick.render(renderer);
        }
    }

    @Override
    public void destroy() {

    }
}
