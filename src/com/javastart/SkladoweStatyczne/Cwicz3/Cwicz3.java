package com.javastart.SkladoweStatyczne.Cwicz3;

public class Cwicz3 {
    public static void main(String[] args) {
        System.out.println(convertCupsToMilliliters(1.5));
        System.out.println(convertTablespoonsToMilliliters(4));
        System.out.println(convertTeaspoonsToMilliliters(6));
    }

    public static double convertCupsToMilliliters(double numberOfCups){
        return numberOfCups*250;
    }

    public static double convertTablespoonsToMilliliters(double numberOfSpoons){
        return  numberOfSpoons*15;
    }

    public static double convertTeaspoonsToMilliliters(double numberOfSpoons){
        return numberOfSpoons*5;
    }
}
