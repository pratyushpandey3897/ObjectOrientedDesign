package casestudies.chess;

public class Move {
    Cell startBox;
    Cell endBox;
    Piece pieceMoved;
    Piece pieceKilled;
    boolean castlingMove = false;

    Move(Cell startBox, Cell endBox){
        this.startBox = startBox;
        this.endBox = endBox;
        this.pieceMoved = startBox.getPiece();
    }


}
