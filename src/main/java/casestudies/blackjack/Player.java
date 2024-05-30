package casestudies.blackjack;

import java.util.List;

public abstract class Player {
    String id;
    Hand hand;
    private double balance;
    private String password;
    private String username;

    public Player (Hand hand) {
        this.hand = hand;
    }

    public void addHand (Hand hand) {
        this.hand = hand;
    }

    public void removeHand (Hand hand) {
        this.hand = null;
    }


    public void addToHand (Card card) {
        this.hand.cards.add(card);
    }
}
