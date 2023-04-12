public abstract class Piece {
    private boolean captured;
    private boolean white;
    
    Piece(boolean white) {
        this.white = white;
    }

    public boolean isWhite() {
        return this.white;
    }
}