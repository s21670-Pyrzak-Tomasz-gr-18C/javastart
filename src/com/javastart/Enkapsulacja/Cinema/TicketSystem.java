package com.javastart.Enkapsulacja.Cinema;

public class TicketSystem {



    public Ticket sellTickets(Movie movie,Client client) {
        if (movie.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (client.getAge() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = movie.getMaxSeats() - movie.getFreeSeats() + 1;
            movie.setFreeSeats(movie.getFreeSeats() - 1);
            return new Ticket(ticketId, client, movie);
        }
    }
}
