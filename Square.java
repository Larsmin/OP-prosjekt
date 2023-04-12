public class Square {
    private Piece piece;
    private int x;
    private int y;

    Square(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y; 
    }
    // Returns the piece on a square, if the square does not have a piece this.piece will be None.
    public Piece getPiece() {
        return this.piece;
    }
    // Puts a new piece on the square.
    public void setPiece(Piece p) {
        this.piece = p;

    }
    // Returns the x-coordinate of the square.
    public int getX() {
        return this.x;
    }
    // Sets the x coordinate of the square, (When will this be used?)
    public void setX(int x) {
        this.x = x;
    }
    // Returns the y-coordinate of the square.
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }



}