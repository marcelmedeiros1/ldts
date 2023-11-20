package com.ldts.steven.model.game.elements;

public class Hero extends Element{
    private int lifes;

    public Hero(int x, int y) {
        super(x, y);
        this.lifes= 3;
    }

    public void decreaseEnergy() {
        this.lifes--;
    }

    public int getEnergy() {
        return lifes;
    }

}
