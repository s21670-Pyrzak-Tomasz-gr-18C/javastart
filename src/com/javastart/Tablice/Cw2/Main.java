package com.javastart.Tablice.Cw2;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Person person1 = new Person(80);
        Person person2 = new Person(80);
        Person person3 = new Person(80);
        Person person4 = new Person(80);
        Person person5 = new Person(800);

        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);
        elevator.add(person4);
        elevator.add(person5);

        elevator.start();
        elevator.emptyTheElevator();



    }
}
