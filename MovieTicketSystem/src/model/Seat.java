package model;

public class Seat {
    String seatType;
    int seatNumber;

    public Seat(String seatType, int seatNumber) {
        this.seatType = seatType;
        this.seatNumber = seatNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}