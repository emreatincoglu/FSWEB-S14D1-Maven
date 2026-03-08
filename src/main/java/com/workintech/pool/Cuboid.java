package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    public void setHeight(double height) {
        if (height < 0) height = 0;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }

    public Cuboid( double width, double length, double height) {
        super(width, length);
        setHeight(height);
    }
}
