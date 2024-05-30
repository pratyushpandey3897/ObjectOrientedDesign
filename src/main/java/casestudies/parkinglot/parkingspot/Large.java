package casestudies.parkinglot.parkingspot;

import casestudies.parkinglot.Type;
import casestudies.parkinglot.Vehicle;

public class Large extends ParkingSpot{

    @Override
    public boolean assignVehicle (Vehicle vehicle) {
        if (isFree() && vehicle.type.equals(Type.LARGE)) {
            this.vehicle = vehicle;
            this.isFree = false;
            return true;
        }
        return false;
    }
}
