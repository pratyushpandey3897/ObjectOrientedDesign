package casestudies.AmazonOnline.Payment;

public abstract class Payment {
    String paymentId;
    double amount;
    PaymentStatus status;

    public abstract PaymentStatus makePayment();
}
