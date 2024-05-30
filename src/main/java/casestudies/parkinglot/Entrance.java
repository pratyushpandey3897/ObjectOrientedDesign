package casestudies.parkinglot;

public class Entrance {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void processVehicle(Vehicle vehicle) {
        Ticket ticket = new Ticket();
        ticket.assignVehicle(vehicle);
        System.out.println ("Vehicle processed");
    }
}
