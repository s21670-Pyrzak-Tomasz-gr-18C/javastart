package com.javastart.Enkapsulacja.Cinema;

public class Ticket {
    static int ticket1Id = 0;
    private Client ticketPersonData ;
    private Movie ticketMovieTitle ;

    public Ticket(int ticket1Id, Client ticketPersonData, Movie ticketMovieTitle) {
        this.ticketPersonData = ticketPersonData;
        this.ticketMovieTitle = ticketMovieTitle;
        this.ticket1Id = ticket1Id;

    }

    public int getTicket1Id() {
        return ticket1Id;
    }

    public void setTicket1Id(int ticket1Id) {
        this.ticket1Id = ticket1Id;
    }

    public Client getTicketPersonData() {
        return ticketPersonData;
    }

    public void setTicketPersonData(Client ticketPersonData) {
        this.ticketPersonData = ticketPersonData;
    }

    public Movie getTicketMovieTitle() {
        return ticketMovieTitle;
    }

    public void setTicketMovieTitle(Movie ticketMovieTitle) {
        this.ticketMovieTitle = ticketMovieTitle;
    }
}
