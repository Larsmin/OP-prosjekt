public class Square {
    private Piece piece;
    private int x;
    private int y;

    Square(int x, int y) {
        this.x = x;
        this.y = y; 
    }
    // Returns the piece on a square, if the square does not have a piece this.piece will be None.
    public Piece getOccupyingPiece() {
        return this.piece;
    }

    // Return true if the square has a piece
    public boolean isOccupied(){
        if(this.piece != null){
            return true;
        }
        else{
            return false;
        }
    }
    // Puts a new piece on the square.
    public void setOccupyingPiece(Piece p) {
        this.piece = p;
    }

    // Removes the piece from the current square
    public void removePiece() {
        this.piece = null;
    }


    public void capture(Piece p) {
        Piece c = getOccupyingPiece();
        if(c.)
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