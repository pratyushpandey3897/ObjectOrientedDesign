package casestudies.AmazonOnline.Payment;

public class CreditCard extends Payment{
    String cardNumber;
    String cardHolderName;
    String expiryDate;
    String cvv;


    public PaymentStatus makePayment() {
        return PaymentStatus.COMPLETED;
    }

}
