package game.tictactoe;

import java.util.Arrays;

public class Board {
    private Piece[][] squares = new Piece[3][3];
    public int EmptySquare = 9;

    public void createBoard() {
        for (Piece[] row : squares) {
            Arrays.fill(row, Piece.Null);
        }
    }

    public void paintBoard() {
        System.out.println("-------------");
        for (Piece[] row : squares) {
            System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " | ");
            System.out.println("-------------");
        }
        System.out.println();
    }

    public boolean putPiece(Position position, Piece piece) {
        if (position.getX() > 3 || position.getY() > 3) return false;
        if (position.getX() <= 0 || position.getY() <= 0) return false;
        if (squares[position.getX() - 1][position.getY() - 1] == Piece.Null) {
            squares[position.getX() - 1][position.getY() - 1] = piece;
            EmptySquare--;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return EmptySquare <= 0;
    }

    public Piece getWinner() {
        if (checkRows() != Piece.Null)
            return checkRows();
        if (checkColumns() != Piece.Null)
            return checkColumns();
        if (checkDiagonals() != Piece.Null)
            return checkDiagonals();
        return Piece.Null;
    }

    private Piece checkRows() {
        Piece piece = Piece.Null;
        for (Piece[] row : squares) {
            if (row[0] == row[1] && row[0] == row[2]) {
                piece = row[0];
                break;
            }
        }
        return piece;
    }

    private Piece checkColumns() {
        Piece piece = Piece.Null;
        for (int i = 0; i < 3; i++) {
            if (squares[0][i] == squares[1][i] && squares[0][i] == squares[2][i]) {
                piece = squares[0][i];
                break;
            }
        }
        return piece;
    }

    private Piece checkDiagonals() {
        Piece piece = Piece.Null;
        if ((squares[0][0] == squares[1][1] && squares[0][0] == squares[2][2])
                || squares[0][2] == squares[1][1] && squares[0][2] == squares[2][0])
            piece = squares[1][1];
        return piece;
    }

}

