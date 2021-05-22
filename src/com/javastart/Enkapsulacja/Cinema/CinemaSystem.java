package com.javastart.Enkapsulacja.Cinema;

public class CinemaSystem {
    public static void main(String[] args) {

        TicketSystem seans1 = new TicketSystem();

        Client client1 = new Client("Jan", "Kowalski", 15);
        Client client2 = new Client("Anna", "Zalewska", 19);

        Movie movie1 = new Movie("Omen", "horror", 128, 16, 72, 72);
                
    }
}
