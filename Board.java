import java.util.ArrayList;
import java.util.List;

public class Board {
    //Representation of the board
    public Square[][] board;

    public List<Piece> whitePieces;
    public List<Piece> blackPieces;

    public boolean whiteTurn;

    public Board(){
        board = new Square[8][8];
        whitePieces = new ArrayList<>();
        blackPieces = new ArrayList<>();
        whiteTurn = true;
    }
}
