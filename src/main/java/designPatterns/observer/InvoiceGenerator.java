package designPatterns.observer;

public class InvoiceGenerator implements Subscriber{

    public InvoiceGenerator (){
        Amazon amazon = Amazon.getInstance ();
        amazon.register (this);
    }
    public void announce() {
        // generate invoice
        generateInvoice ();
    }

    public void generateInvoice() {
        // generate invoice
        System.out.println("Invoice generated");
    }
}
