package com.javastart.Tablice.Cw2;

public class Person {
   private  int id=0;
   private double weight;

    public Person( double weight) {
        id +=1;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
