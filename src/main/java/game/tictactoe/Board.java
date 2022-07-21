package game.tictactoe;

public class Board {
    private char[][] board = new char[3][3];

    public char[][] CreateBoard() {
        for (char[] row : board) {
            for (char piece : row) {
                piece = ' ';
            }
        }
        return board;
    }

    public void PaintBoard() {
        System.out.println("-------------");
        for (char[] row : board) {
            System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " | ");
            System.out.println("-------------");
        }
    }

    public void Movement(int x, int y, char piece) {
        if (piece == 'X') {
            x--;
            y--;
        }
        board[x][y] = piece;
    }

    public boolean fullBoard() {
        for (char[] row : board) {
            for (char piece : row) {
                if (piece == ' ') return false;
            }
        }
        return true;
    }

    public boolean checkMovement(int x, int y, char piece) {
        if (piece == 'X') {
            x--;
            y--;
        }
        if (x > 3 || y > 3) return false;
        if (board[x][y] != 'X' && board[x][y] != 'O') return true;
        return false;
    }

    public boolean checkWinner(char box) {
        if ((board[0][0] == box && board[0][1] == box && board[0][2] == box) ||
                (board[1][0] == box && board[1][1] == box && board[1][2] == box) ||
                (board[2][0] == box && board[2][1] == box && board[2][2] == box) ||
                (board[0][0] == box && board[1][0] == box && board[2][0] == box) ||
                (board[0][1] == box && board[1][1] == box && board[2][1] == box) ||
                (board[0][2] == box && board[1][2] == box && board[2][2] == box) ||
                (board[0][0] == box && board[1][1] == box && board[2][2] == box) ||
                (board[0][2] == box && board[1][1] == box && board[2][0] == box)) {
            return true;
        }
        return false;
    }

}

