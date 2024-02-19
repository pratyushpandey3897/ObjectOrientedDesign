package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private List<Subscriber> subscribers = new ArrayList<> ();

    // singleton
    private  static Amazon amazon = null;
    public static Amazon getInstance() {
        if (amazon == null) {
            amazon = new Amazon();
        }
        return amazon;
    }
    void register(Subscriber subscriber) {
        // add subscriber to list
        subscribers.add(subscriber);
    }

    void unregister(Subscriber subscriber) {
        // remove subscriber from list
        subscribers.remove(subscriber);
    }

    public void orderPlaced() {
        // if subscriber was not there
        // appnotifier.notify();
        //invoice.generate();
        //es.send();

        for (Subscriber subscriber : subscribers) {
            subscriber.announce();
        }
    }
}
