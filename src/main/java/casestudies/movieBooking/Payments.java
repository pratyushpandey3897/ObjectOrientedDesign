package casestudies.movieBooking;

public class Payments {
    int amount;
    String paymentType;
    String paymentStatus;
    String paymentDate;

    //many to one
    Ticket ticket;
}
