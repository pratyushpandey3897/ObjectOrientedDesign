package casestudies.parkinglot;

import casestudies.parkinglot.parkingspot.ParkingSpot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingLotSystem {
    private int id;
    private String name;
    private String address;
    List<Entrance> entrances = new ArrayList<> ();
    List<Exit> exits = new ArrayList<> ();
    List< ParkingSpot > parkingSpots = new ArrayList<> ();

    //singleton
    private static ParkingLotSystem parkingLotSystem = null;
    private ParkingLotSystem() {
        this.name = "Parking Lot";
        this.address = "Bangalore";

    }
    public static ParkingLotSystem getInstance() {
        if (parkingLotSystem == null) {
            parkingLotSystem = new ParkingLotSystem();
        }
        return parkingLotSystem;
    }

    public boolean addEntrance(Entrance entrance) {
        // add entrance
        entrances.add(entrance);
        return true;
    }
    public boolean addExit(Exit exit) {
        // add exit
        exits.add(exit);
        return true;
    }
    public boolean addParkingSpot(ParkingSpot parkingSpot) {
        // add parking spot
        parkingSpots.add(parkingSpot);
        return true;
    }
    HashMap<Integer, Ticket> ticketMap = new HashMap<>();
    public Ticket getTicket(Vehicle vehicle) {

        return vehicle.getTicket();
    }

}
