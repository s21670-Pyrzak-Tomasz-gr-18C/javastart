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
        System.out.println("Suma środkowego wiersza i środkowej kolumny "+ sumOfTheMiddleRowAndColumn(tab));
        System.out.println("Suma elemntów przy krawędziach tablicy "+ sumOElementsAtTheEdge(tab));
    }

    private static void showTable(double[][] tab) {
        for (double [] table:tab) {
            for (double value:table) {
                System.out.print(value+" ");
            }
            System.out.println();
        };
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

    private static double sumOfTheMiddleRowAndColumn(double[][] tab) {
        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i == (tab.length - 1) / 2)
                    sum += tab[i][j];
                if (j == (tab[i].length - 1) / 2)
                    sum += tab[i][j];
            }
        }
        return sum;
    }

    private static double sumOElementsAtTheEdge(double [][] tab){
        double sum = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if ((j == 0)||(i == 0)||(i == tab.length-1)||(j==tab[i].length-1))
                    sum += tab[i][j];
            }
        }
        return sum;
    }
}
