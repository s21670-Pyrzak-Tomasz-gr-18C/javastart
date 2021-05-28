package com.javastart.Petle.Cwicz2;

public class Patient {
    private String name;
    private String surname;
    private String Pesel;

    public Patient(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        Pesel = pesel;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Pesel=" + Pesel +
                '}';
    }
}
