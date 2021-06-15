package com.javastart.Dziedziczenie.Cwicz2;

public class Course {
    private String courseId;
    private int rating;
    private String name;
    private String description;

    public Course(String courseId, int rating, String name, String description) {
        this.courseId = courseId;
        this.rating = rating;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", rating=" + rating +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
