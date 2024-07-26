package casestudies.movieBooking;

import java.util.List;

public class Ticket {
    List<ShowSeats> bookedSeats;
    String bookedBy;
    // many to one
    Show show;
    //one to many
    List<Payments> payments;
}
