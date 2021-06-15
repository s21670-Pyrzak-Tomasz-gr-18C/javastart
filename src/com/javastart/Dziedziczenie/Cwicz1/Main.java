package com.javastart.Dziedziczenie.Cwicz1;

public class Main {

    public static void main(String[] args) {
        Part opona = new Tire(1,"Michelin","F1",123,16,220);
        System.out.println(opona);

        Part wydech = new ExhaustPart(2, "firma krzak","***",657465,true);
        System.out.println(wydech);
    }
}
