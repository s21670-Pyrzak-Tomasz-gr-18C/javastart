package com.javastart.Algorytmika;

import java.util.Scanner;

public class Cwicz2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int multi = 1;

        for (int index = 0; index < 5; index++) {
            int next = scanner.nextInt();
            multi *= next;
        }

        if (multi >= 0) {
            System.out.println("Nieujemna");
        } else {
            System.out.println("Ujemna");
        }
    }
}



