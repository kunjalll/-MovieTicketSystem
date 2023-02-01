package model;

public class Movie extends Category{
    String name;
    String director;
    String showTime;
    int price;


    public Movie(int seat, int sofa, String genre, String name, String director, String showTime, int price) {
        super(seat, sofa, genre);
        this.name = name;
        this.director = director;
        this.showTime = showTime;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Name:" + this.getName());
        System.out.println("Director: " + this.getDirector());
        System.out.println("ShowTime: "+ this.getShowTime());
        System.out.println("Price: " + this.getPrice());
    }


    public void getMovies(String showTime) {
        if (this.showTime.equals(showTime)) {
            System.out.println("Movie:" + this.getName());
        }
        else{
            System.out.println("No movie for the above mentioned show time!!!");
        }
    }
}