package com.javastart.Enkapsulacja;

public class PrintService {


    public static void printService(Client client1, double price1, double priceDiscount1) {

        if ((client1.getFirstName() != null) && (client1.getLastName() != null))
        {
            System.out.println("Witaj " + client1.getFirstName() + " " + client1.getLastName());

        }else if (client1.getFirstName() == null){
            System.out.println("Dzień dobry panie/pani "+client1.getLastName());
        }else if (client1.getLastName() == null){
            System.out.println("Witaj "+client1.getFirstName());
        }else
            System.out.println("Witaj nieznajomy");

        System.out.println("Kwota przed rabatem: " + price1);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount1);
    }
}
