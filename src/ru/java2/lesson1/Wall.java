package ru.java2.lesson1;

public class Wall {

    private double wallHeight;

    Wall(double wallHeight) {
        this.wallHeight = wallHeight;
    }

    public void setWallHeight(double wallHeight) {
        this.wallHeight = wallHeight;
    }

    public double getWallHeight() {
        return this.wallHeight;
    }
}
