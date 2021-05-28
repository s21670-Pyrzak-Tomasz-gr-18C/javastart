package com.javastart.Petle.Cwicz1;

import java.util.Scanner;

public class Cwicz1 {
    public static void main(String[] args) {
        getDataFromUser();
    }

    private static void getDataFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość liczb do zsumowania: ");
        int numberOfValues = sc.nextInt();
        double sumOfValues = 0;
        System.out.println("Podaj pierwsza wartość: ");
        do{
            sumOfValues += sc.nextDouble();
            if (numberOfValues>1)
                System.out.println("Podaj kolejna wartość: ");
            numberOfValues--;

        }while(numberOfValues>0);
        System.out.println("Suma podanych liczb: "+sumOfValues);
    }
}
