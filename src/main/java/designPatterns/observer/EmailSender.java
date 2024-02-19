package designPatterns.observer;

public class EmailSender implements Subscriber{

    public EmailSender (){
        Amazon amazon = Amazon.getInstance ();
        amazon.register (this);
    }
    public void announce() {
        // send email
        sendEmail ();
    }

    public void sendEmail() {
        // send email
        System.out.println("Email sent");
    }
}
