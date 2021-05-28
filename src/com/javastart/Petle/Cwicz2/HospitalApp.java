package com.javastart.Petle.Cwicz2;

import java.util.Scanner;

public class HospitalApp {

    String menu = "Menu: \n" +
            "select 0 - if you want to Quit \n" +
            "select 1 - if you want to Register new patient \n" +
            "select 2 - if you want to display a list of registered patients\n";
    Hospital hospital = new Hospital();
    public void menuStart() {
        System.out.println(menu);
        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt()) {
            case 0:
                System.out.println("Goodbye");
                break;
            case 1:
                System.out.println("Podaj dane pacjenta: Imie, Nazwisko, Pesel");
                hospital.addPatientToList(new Patient(sc.next(), sc.next(), sc.next()));
                menuStart();
                break;
            case 2:
                hospital.showListOfPatients();
                menuStart();
                break;
            default:
                System.out.println("Invalid command");
                menuStart();
        }
    }
}
