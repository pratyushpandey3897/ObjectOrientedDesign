package casestudies.chess;

public class King extends Piece{
    boolean castlingDone = false;

    @Override
    boolean canMove (Board board, Cell start, Cell end) {
        return false;
    }
}
