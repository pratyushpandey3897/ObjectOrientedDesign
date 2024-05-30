package casestudies.parkinglot;

public class Car extends Vehicle{
    public Car(String licensePlate) {
        this.type = Type.COMPACT;
        this.setLicensePlate (licensePlate);
    }

    @Override
    public void assignTicket(Ticket ticket) {
//        this.ticket = ticket;
        this.ticket =  (ticket);
        System.out.println ("Ticket assigned to car");
    }
}
