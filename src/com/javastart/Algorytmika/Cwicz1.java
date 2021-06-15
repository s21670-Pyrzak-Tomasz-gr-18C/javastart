package com.javastart.Algorytmika;

import java.util.Scanner;

public
    class Cwicz1 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj pierwsza liczbę: ");
            double suma = sc.nextDouble();

            while (suma<=100){
                System.out.println("Podaj kolejna liczbę: ");
                suma += sc.nextDouble();
            }
            if (suma %2 == 0){
                System.out.println("suma: "+suma+" jest liczba parzystą");
            }else
                System.out.println("suma: "+suma+" jest liczba nieparzystą");
    }
}
