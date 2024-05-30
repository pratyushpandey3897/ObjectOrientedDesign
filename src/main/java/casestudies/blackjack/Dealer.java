package casestudies.blackjack;

public class Dealer extends Player{
    Hand hand;
    public Dealer(Hand hand){
        super(hand);
    }
    public int getTotalScore(){
        return 0;
    }
}
