package casestudies.parkinglot;

public class Payment {
    private int paymentId;
    private String paymentTime;
    private Status status;
    private int amount;
    private Ticket ticket;

    public void makePayment() {
        ticket.setAmount(amount);
    }

    public void assignTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void calculateAmount() {
        // calculate amount
    }
}
