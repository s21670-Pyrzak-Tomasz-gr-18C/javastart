package com.javastart.Enkapsulacja;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

        Client client3 = new Client(null, "Nowak", false);
        double price3=1200;

        Client client5 = new Client("Adam", null, false);
        double price5 =1000;

        Client client4 = new Client(null, null, false);
        double price4=1200;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);
        double priceDiscount3 = discountService.calculateDiscountPrice(client3, price3);
        double priceDiscount4 = discountService.calculateDiscountPrice(client4, price4);
        double priceDiscount5 = discountService.calculateDiscountPrice(client5, price5);


        PrintService print = new PrintService();
        print.printService(client1,price1,priceDiscount1);
        System.out.println();
        print.printService(client2, price2, priceDiscount2);
        System.out.println();
        print.printService(client3, price3, priceDiscount3);
        System.out.println();
        print.printService(client4, price4, priceDiscount4);
        System.out.println();
        print.printService(client5, price5, priceDiscount5);
    }

}
