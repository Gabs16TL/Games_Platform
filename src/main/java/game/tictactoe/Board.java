package game.tictactoe;

public class Board {
    private Piece[][] pieces = new Piece[3][3];
    //public int EmptySquare;

    public Piece[][] createBoard() {
        for (Piece[] row : pieces) {
            for (Piece pieces : row) {
                pieces = Piece.Empty;
            }
        }
        return pieces;
    }

    public void paintBoard() {
        System.out.println("-------------");
        for (Piece[] row : pieces) {
            System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " | ");
            System.out.println("-------------");
        }
    }

    public void putPiece(Position position, Piece piece) {
        int x = position.getX();
        int y = position.getY();

        if (piece == Piece.X) {
            x--;
            y--;
        }
        pieces[x][y] = piece;
    }

    public boolean isFull() {
        for (Piece[] row : pieces) {
            for (Piece piece : row) {
                if (piece == Piece.Empty) return false;
            }
        }
        return true;
    }

    public boolean checkMovement(Position position, Piece piece) {
        int x = position.getX();
        int y = position.getY();

        if (piece == Piece.X) {
            x--;
            y--;
        }
        if (x > 3 || y > 3) return false;

        if (pieces[x][y] != Piece.X && pieces[x][y] != Piece.O) return true;

        /*if (pieces[position.getX()][position.getY()] !=
                Piece.X && pieces[position.getX()][position.getY()] !=
                Piece.O)
            return true;*/
        return false;
    }

    public boolean checkWinner(Piece box) {
        if ((pieces[0][0] == box && pieces[0][1] == box && pieces[0][2] == box) ||
                (pieces[1][0] == box && pieces[1][1] == box && pieces[1][2] == box) ||
                (pieces[2][0] == box && pieces[2][1] == box && pieces[2][2] == box) ||
                (pieces[0][0] == box && pieces[1][0] == box && pieces[2][0] == box) ||
                (pieces[0][1] == box && pieces[1][1] == box && pieces[2][1] == box) ||
                (pieces[0][2] == box && pieces[1][2] == box && pieces[2][2] == box) ||
                (pieces[0][0] == box && pieces[1][1] == box && pieces[2][2] == box) ||
                (pieces[0][2] == box && pieces[1][1] == box && pieces[2][0] == box)) {
            return true;
        }
        return false;
    }

}

