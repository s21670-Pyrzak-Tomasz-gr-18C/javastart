package com.javastart.Dziedziczenie.Cwicz1;

public class Tire extends Part{
    private int size;
    private int width;

    public Tire(int idNumber, String producer, String model, int series, int size, int width) {
        super(idNumber, producer, model, series);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "size=" + size +
                ", width=" + width +
                "} "+ super.toString();
    }
}
