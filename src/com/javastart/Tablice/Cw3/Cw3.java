package com.javastart.Tablice.Cw3;

import java.util.Arrays;

public class Cw3 {
    public static void main(String[] args) {
        double[][] tab = new double[3][3];
        tab[0][0] = 1;
        tab[0][1] = 1.5;
        tab[0][2] = 2.5;
        tab[1][0] = 1.5;
        tab[1][1] = 2;
        tab[1][2] = 2.5;
        tab[2][0] = 2;
        tab[2][1] = 2.5;
        tab[2][2] = 3;

        showTable(tab);


        System.out.println("Suma wartości na przekątnych " + sumOfTheProductsOfDiagonal1(tab));
    }

    private static void showTable(double[][] tab) {
        Arrays.toString(tab);
    }

    public static double sumOfTheProductsOfDiagonal1(double[][] tab) {
        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (j == i) {
                    sum += tab[i][j];
                }

                if (j == tab.length - 1 - i)
                    sum += tab[i][j];
            }
        }
        return sum;
    }
}

