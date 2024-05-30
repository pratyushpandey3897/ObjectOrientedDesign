package casestudies.parkinglot;

public abstract class Vehicle {
    public Type getType () {
        return type;
    }

    public void setType (Type type) {
        this.type = type;
    }

    public String getLicensePlate () {
        return licensePlate;
    }

    public void setLicensePlate (String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Type type;
    private String licensePlate;
    Ticket ticket;


    public abstract void assignTicket(Ticket ticket) ;
    public Ticket getTicket() {
        return ticket;
    }
}
