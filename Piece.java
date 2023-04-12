public abstract class Piece {
    private boolean captured;
    private int color;
    
    Piece(int color) {
        if(color == 0 && color == 1){
            this.color = color;
        }
    }
}