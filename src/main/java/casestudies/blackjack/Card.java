package casestudies.blackjack;

public class Card {
    Suit suit;
    private int faceValue;

    public Card (Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }
}
