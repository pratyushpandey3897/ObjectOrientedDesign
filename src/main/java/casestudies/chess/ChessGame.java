package casestudies.chess;

import java.util.List;

public class ChessGame {
    List<Player> players;
    Board board;
    Player currentPlayer;
    List<Move> movesPlayed;
    Player winner;

    public Move playerMove(Player player, Cell start, Cell end, Piece piece) {
        Move move = new Move(start, end);
        if (isValidMove(player, move, piece)) {
            makeMove (move, player, piece);
            return move;
        }
        return null;
    }
    public boolean isValidMove(Player player, Move move, Piece piece) {
        return false;
    }

    public boolean makeMove(Move move, Player player, Piece piece) {
        return false;
    }
}
