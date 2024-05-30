package casestudies.parkinglot;

public class Ticket {
    public int getTicketNo () {
        return ticketNo;
    }

    public void setTicketNo (int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getEntryTime () {
        return entryTime;
    }

    public void setEntryTime (String entryTime) {
        this.entryTime = entryTime;
    }

    public String getExitTime () {
        return exitTime;
    }

    public void setExitTime (String exitTime) {
        this.exitTime = exitTime;
    }

    public int getAmount () {
        return amount;
    }

    public void setAmount (int amount) {
        this.amount = amount;
    }

    public Payment getPayment () {
        return payment;
    }

    public void setPayment (Payment payment) {
        this.payment = payment;
    }

    private int ticketNo;
    private String entryTime;
    private String exitTime;
    private int amount;
    private Payment payment;
    private Vehicle vehicle;
    private Entrance entrance;
    private Exit exit;
    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
