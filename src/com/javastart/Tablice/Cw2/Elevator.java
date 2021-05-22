package com.javastart.Tablice.Cw2;

public class Elevator {
    private double sumOfWeight;
    private int peopleNumber = 0;
    private Person[] persons = new Person[4];

    public void add(Person person) {
        if (peopleNumber< persons.length) {
            persons[peopleNumber] = person;
            sumOfWeight += person.getWeight();
            peopleNumber++;
        }else
            System.out.println("Nie ma miejsc");

    }

    public void start() {
        if (sumOfWeight > 400) {
            System.out.println("Winada przeciążona o: " + (sumOfWeight - 400));
        } else {
            System.out.println("winda wystartowała");
        }
    }

    public void emptyTheElevator() {
        for (int i = 0; i < persons.length; i++) {
            persons[i] = null;
        }
        peopleNumber = 0;
        System.out.println("winda jest pusta");
    }
}
