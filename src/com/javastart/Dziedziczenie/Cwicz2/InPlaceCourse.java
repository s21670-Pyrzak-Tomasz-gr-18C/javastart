package com.javastart.Dziedziczenie.Cwicz2;

public class InPlaceCourse extends Course{
    private String city;
    private int numberOfMeatings;


    public InPlaceCourse(String courseId, int rating, String name, String description, String city, int numberOfMeatings) {
        super(courseId, rating, name, description);
        this.city = city;
        this.numberOfMeatings = numberOfMeatings;
    }

    @Override
    public String toString() {
        return "InPlaceCourse{" +
                "city='" + city + '\'' +
                ", numberOfMeatings=" + numberOfMeatings +
                "} "+super.toString();
    }
}
