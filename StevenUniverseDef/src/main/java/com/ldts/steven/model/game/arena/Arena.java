package com.ldts.steven.model.game.arena;
import com.ldts.steven.model.game.elements.Hero;
import com.ldts.steven.model.game.elements.Monster;
import com.ldts.steven.model.game.elements.Wall;

import java.util.List;

public class Arena {
    private int width;
    private int height;

    private Hero hero;
    private List<Monster> monsters;
    private List<Wall> walls;

    public Arena(int width, int height) {
        this.height = height;
        this.width = width;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
