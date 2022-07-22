package game.tictactoe;

import game.GamePlayer;
import game.hangman.HangManPlayer;
import game.hangman.HangedMan;
import game.tictactoe.TicTacToePlayer;

public class TurnTicTacToe {
    TicTacToePlayer gamePlayerX;
    TicTacToePlayer gamePlayerO;
    TicTacToePlayer result;
    Board board;

    public TurnTicTacToe(GamePlayer gamePlayerX, GamePlayer gamePlayerO) {
        this.gamePlayerX = gamePlayerX;
        this.gamePlayerO = gamePlayerO;
        this.board = new Board();
    }

    public void play() {
        TicTacToePlayer current = gamePlayerX;
        Piece piece = Piece.X;
        board.createBoard();
        board.paintBoard();
        while (!board.isFull() && board.getWinner() == Piece.Null) {
            Position position = current.putMark();
            String move = "Invalid move! Try again.";
            if (board.putPiece(position, piece)) {
                move = "\n" + current + " moved to (" + position.getY() + ", " + position.getY() + ")";
                current = (current.equals(gamePlayerX)) ? gamePlayerO : gamePlayerX;
                piece = (current.equals(gamePlayerX)) ? Piece.X : Piece.O;
            }
            System.out.println(move);
            board.paintBoard();
        }
        setResult(board.getWinner());
    }

    private void setResult(Piece piece) {
        if (board.getWinner() != Piece.Null) {
            if (board.getWinner() == Piece.X)
                this.result = gamePlayerX;
            else if (board.getWinner() != Piece.O)
                this.result = gamePlayerO;
        }
    }

    public TicTacToePlayer getResult() {
        return this.result;
    }
}
