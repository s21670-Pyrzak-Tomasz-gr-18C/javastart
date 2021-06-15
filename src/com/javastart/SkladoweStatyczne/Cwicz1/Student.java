package com.javastart.SkladoweStatyczne.Cwicz1;

public class Student {

    private String name;
    private String surname;
    private int indexNumber;
    public static int numberOfStudents;

    public Student(String name, String surname, int indexNumber) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
        numberOfStudents++;
    }
}
