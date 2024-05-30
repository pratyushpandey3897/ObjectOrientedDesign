package casestudies.blackjack;

import java.util.List;

public class Hand {
    List<Card> cards;

    public Hand (Card card1 , Card card2) {
        cards.add(card1);
        cards.add(card2);
    }

    int getScore () {
        int score = 0;
//        for (Card card : cards) {
//            score += card.faceValue;
//        }
        return score;
    }

    public void addCard (Card card) {
        cards.add(card);
    }

}
