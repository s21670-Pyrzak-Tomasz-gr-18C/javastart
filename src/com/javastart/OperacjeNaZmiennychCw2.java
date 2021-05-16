package com.javastart;

public class OperacjeNaZmiennychCw2 {
    public static void main(String[] args) {
        int nettoPrice = 100;
        double vat=0.23;
        double vatAmount = vat*nettoPrice;
        double bruttoPrice = nettoPrice+vat;
        System.out.println("Cena netto: " + nettoPrice);
        System.out.println("Kwota VAT: " + vatAmount);
        System.out.println("Do zapłaty (brutto): " + bruttoPrice);
    }
}
