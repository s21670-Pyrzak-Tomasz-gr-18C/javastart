package com.javastart.KlasyIObiekty;

public class Employee {
    private String name;
    private String lastName;
    private int bornYear;
    private int seniority;

    public Employee(String name, String lastname, int bornYear, int seniority){
        this.name = name;
        this.lastName = lastname;
        this.bornYear = bornYear;
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Imie: "+name+"\n"+"Nazwisko: "+lastName+"\n"+"Data urodzenia: "+bornYear+"\n"+"Staż pracy: "+seniority+"\n";
    }

}
