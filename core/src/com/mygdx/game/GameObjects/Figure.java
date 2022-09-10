package com.mygdx.game.GameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

public class Figure {
    protected int x;
    protected int y;
    protected int size;
    protected int xSpeed;
    protected int ySpeed;
    protected int height;
    protected int width;
    protected Color color = Color.WHITE;

    public Figure(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figure(int x, int y, int size, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    protected void draw(ShapeRenderer shapeRenderer){
        shapeRenderer.setColor(color);
    }

    protected Rectangle getArea(){
        return new Rectangle(this.x,this.y,this.width,this.height);
    }

    protected void update(){}

    public boolean collideWith(Figure figure){
        if(getArea().overlaps(figure.getArea())){
            Gdx.app.log("COLISION","GAAA");
            return true;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
