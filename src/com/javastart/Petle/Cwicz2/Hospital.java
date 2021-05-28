package com.javastart.Petle.Cwicz2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hospital {
    List<Patient> listOfPatients = new ArrayList();

    public void addPatientToList(Patient patient){
        if (listOfPatients.size()<10) {
            listOfPatients.add(patient);
        }else
            System.out.println("Lista pełna, brak mozliwości zapisania kolejnrgo pacjenta");
    }

    public void showListOfPatients(){
        for (Patient patient:listOfPatients) {
            System.out.println(patient.toString());
            System.out.println();
        }

    }
}
