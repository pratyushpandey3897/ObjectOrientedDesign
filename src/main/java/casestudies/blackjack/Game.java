package casestudies.blackjack;

public class Game {
    Player player;
    Dealer dealer;
    Shoe shoe;
    final int MAX_NUMBER_OF_DECKS = 4;

    public Game(Player player, Dealer dealer, Shoe shoe){
        this.player = player;
        this.dealer = dealer;
        this.shoe = shoe;
    }
}
