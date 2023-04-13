public abstract class Piece {
    private int color;
    private Square currentSquare;
    
    Piece(int color, Square square) {
        if(color == 0 && color == 1){
            this.color = color;
        }
        this.currentSquare = square;
    }

    public boolean move(Square square){
        Piece occupyingPiece = square.getOccupyingPiece();

        if(occupyingPiece != null){
            if(occupyingPiece.getColor() == this.color){
                return false;
            }
            else{
                square.capture(this);
            }
        }

        currentSquare.removePiece();
        this.currentSquare = square;
        currentSquare.setOccupyingPiece(this);
        return true;
    }

    public Square getPostition(){
        return currentSquare;
    }

    public void setPosition(Square square){
        this.currentSquare = square;
    }


    public int getColor(){
        return this.color;
    }

    public int[] getLinearOccupations(Square[][] board, int x, int y) {
        int lastYabove = 0;
        int lastXright = 7;
        int lastYbelow = 7;
        int lastXleft = 0;
        
        for (int i = 0; i < y; i++) {
            if (board[i][x].isOccupied()) {
                if (board[i][x].getOccupyingPiece().getColor() != this.color) {
                    lastYabove = i;
                } else lastYabove = i + 1;
            }
        }

        for (int i = 7; i > y; i--) {
            if (board[i][x].isOccupied()) {
                if (board[i][x].getOccupyingPiece().getColor() != this.color) {
                    lastYbelow = i;
                } else lastYbelow = i - 1;
            }
        }

        for (int i = 0; i < x; i++) {
            if (board[y][i].isOccupied()) {
                if (board[y][i].getOccupyingPiece().getColor() != this.color) {
                    lastXleft = i;
                } else lastXleft = i + 1;
            }
        }

        for (int i = 7; i > x; i--) {
            if (board[y][i].isOccupied()) {
                if (board[y][i].getOccupyingPiece().getColor() != this.color) {
                    lastXright = i;
                } else lastXright = i - 1;
            }
        }
        
        int[] occups = {lastYabove, lastYbelow, lastXleft, lastXright};
        
        return occups;
    }
}