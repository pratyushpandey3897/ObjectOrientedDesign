package casestudies.parkinglot;

public class ParkingRate {
    public int getHours () {
        return hours;
    }

    public void setHours (int hours) {
        this.hours = hours;
    }

    public int getRate () {
        return rate;
    }

    public void setRate (int rate) {
        this.rate = rate;
    }

    private int hours;
    private int rate;

    public void calculateRate() {
        // calculate rate
    }
}
