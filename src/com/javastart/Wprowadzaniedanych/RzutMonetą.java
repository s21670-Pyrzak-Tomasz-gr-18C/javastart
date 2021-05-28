package com.javastart.Wprowadzaniedanych;

import java.util.Random;
import java.util.Scanner;

public class RzutMonetą {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz: \n" +
                "1 - jeśli uważasz,że wypadnie orzeł\n" +
                "0 - jesli uważasz, że wypadnie reszka");
        int choice = sc.nextInt();

        Random random = new Random();

        int randomValue = random.nextInt(2);

        String sideOfCoin ;
        if (randomValue == 0) {
            sideOfCoin = "reszkę";
        }else sideOfCoin = "orła";

        System.out.println((randomValue == choice)?"Brawo wygrana wyrzucono "+sideOfCoin:"Niestety przegrałeś wyrzucono ");

    }
}
