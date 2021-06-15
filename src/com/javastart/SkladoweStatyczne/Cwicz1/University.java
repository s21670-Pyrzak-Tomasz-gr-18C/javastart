package com.javastart.SkladoweStatyczne.Cwicz1;

public class University {
    public static void main(String[] args) {
        Student st1 = new Student("Adam", "Mickiewicz",213123);
        Student st2 = new Student("henryk", "Sienkiewicz",56753);

        System.out.println("Liczba studentów: "+Student.numberOfStudents);

    }
}
