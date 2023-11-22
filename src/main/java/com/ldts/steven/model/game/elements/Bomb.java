package com.ldts.steven.model.game.elements;
public class Bomb extends Element{
    private boolean exploded;
    private int explosionRadius;

    public Bomb(int x, int y) {
        super(x, y);
        this.exploded = false;
        this.explosionRadius = 3; // Pode mudar se tiver com poderes, etc.
    };

    private void explode() {
        this.exploded = true;
    }

    public boolean hasExploded() {
        return exploded;
    }

    public int getExplosionRadius() {
        return explosionRadius;
    }

    public void setExplosionRadius(int explosionRadius) {
        this.explosionRadius = explosionRadius;
    }
}
