package casestudies.chess;

public abstract class Piece {
    boolean killed = false;
    boolean white;

    boolean isWhite() {
        return white;
    }
    boolean isKilled() {
        return killed;
    }

    abstract boolean canMove(Board board, Cell start, Cell end);


}
