package casestudies.parkinglot;

public class Exit {
    private int id;

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    private String name;

    public void validateTicket(Ticket ticket) {
//        ticket.calculateFee();
        System.out.println("Ticket validated");
    }
}
