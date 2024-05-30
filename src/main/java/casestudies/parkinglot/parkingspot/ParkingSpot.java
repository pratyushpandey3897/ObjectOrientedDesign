package casestudies.parkinglot.parkingspot;

import casestudies.parkinglot.Vehicle;

public abstract class ParkingSpot {
    private int id;
    boolean isFree;
    Vehicle vehicle;

    public boolean isFree() {
        return isFree;
    }

    public boolean removeVehicle() {
        this.vehicle = null;
        this.isFree = true;
        return true;
    }

    public abstract boolean assignVehicle(Vehicle vehicle);
}
