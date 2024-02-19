package designPatterns.observer;

public class Client {
    public static void main (String[] args) {
        Amazon amazon = Amazon.getInstance ();
        EmailSender emailSender = new EmailSender ();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator ();
        amazon.orderPlaced ();

    }
}
