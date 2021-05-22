package com.javastart.Tablice.Cw1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] tab1 = new int[3];
        int [] tab2 = new int[3];

        Random random = new Random();

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = random.nextInt(10);
            tab2[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));

        int sum=0;

        for (int i = 0; i < tab1.length; i++) {
            sum += tab1[i]+tab2[i];
        }
        System.out.println(sum);

        System.out.println(addElementsOfTables(tab1,tab2));

        }


    public static int addElementsOfTables(int [] tab1, int [] tab2){
        int sum = 0;
        for (int i = 0; i < tab1.length; i++) {
            sum += tab1[i] + tab2[i];
        }
        return sum;
    }
}
