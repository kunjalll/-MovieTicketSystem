package model;

import java.util.ArrayList;

public class Ticket {
    ArrayList<Seat> seat;

    public Ticket(ArrayList<Seat> seat, ArrayList<User> user, ArrayList<Movie> movie) {
        this.seat = seat;
        this.user = user;
        this.movie = movie;
    }

    ArrayList<User> user;

    public ArrayList<Seat> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<Seat> seat) {
        this.seat = seat;
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public ArrayList<Movie> getMovie() {
        return movie;
    }

    public void setMovie(ArrayList<Movie> movie) {
        this.movie = movie;
    }

    ArrayList<Movie> movie;

    public void getTickets() {

        ArrayList<Seat> seatArrayList = this.getSeat();

        for(Seat singleSeat: seatArrayList) {
            System.out.println("Occupied seat: " + singleSeat.getSeatNumber());

        }

    }
}
