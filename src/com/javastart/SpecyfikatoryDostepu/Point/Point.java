package com.javastart.SpecyfikatoryDostepu.Point;

public class Point {
    private int wspX;
    private int wspY;


    public Point() {}

    public Point(int wspX, int wspY) {
        this.wspX = wspX;
        this.wspY = wspY;
    }

    public int getWspX() {
        return wspX;
    }

    public void setWspX(int wspX) {
        this.wspX = wspX;
    }

    public int getWspY() {
        return wspY;
    }

    public void setWspY(int wspY) {
        this.wspY = wspY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "wspX=" + wspX +
                ", wspY=" + wspY +
                '}';
    }
}
