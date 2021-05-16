package com.javastart;

public class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "90897812362";

        BankAccount account1 = new BankAccount();
        account1.owner = person;
        account1.balance = 10000;

        Credit credit1 = new Credit();
        credit1.borrower = person;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba: ");
        System.out.println(person.firstName+" "+person.lastName+" "+person.pesel);
        System.out.println("posiada konto bankowe z kwotą: "+account1.balance);
        System.out.println("oraz kredyt na kwotę: "+credit1.cashBorrowed);

        Address address1 = new Address();
        address1.city = "Warszawa";
        address1.street = "Nowa";
        address1.home = 86;
        address1.flat = 12;
        address1.postalCode = "05-520";

        Address address2 = new Address();
        address2.city = "Kraków";
        address2.street = "Typowa";
        address2.home = 12;
        address2.flat = 1;
        address2.postalCode = "36-870";

        Person person1 = new Person();
        person1.firstName = "Adam";
        person1.lastName = "Nowak";
        person1.pesel = "85433153844";
        person1.livingAddress = address1;
        person1.registeredAddress = address1;

        Person person2 = new Person();
        person2.firstName = "Oliwia";
        person2.lastName = "Tukan";
        person2.pesel = "91456274487";
        person2.livingAddress = address1;
        person2.registeredAddress = address2;
    }
}
