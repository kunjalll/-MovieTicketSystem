import model.Movie;
import model.Seat;
import model.Ticket;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        Movie m1 = new Movie(1, 6, "Action, Drama", "Pathaan", "Siddharth Anand", "12 ", 650);
        moviesList.add(m1);
        Movie m2 = new Movie(2,7, "Action", "Michael", "Michael", "11", 599);
        moviesList.add(m2);
        Movie m3 = new Movie(3,8, "Romance", "After Ever Happy", "Anna Todd", "12", 500);
        moviesList.add(m3);

        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("Kunjal", 17,"kunjal@gmail.com");
        users.add(u1);
        User u2 = new User("kiki", 18, "kiki@gmail.com");
        users.add(u2);

        ArrayList<Seat> seats = new ArrayList<>();
        Seat s1 = new Seat("FrontSeat", 4);
        seats.add(s1);
        Seat s2 = new Seat("Center", 5);
        seats.add(s2);

        Ticket t1 = new Ticket(seats,users,moviesList);


        m1.getInfo();

        t1.getTickets();

        m3.getMovies("2pm");
    }
}