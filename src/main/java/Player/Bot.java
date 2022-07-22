package Player;


import game.tictactoe.Board;
import game.tictactoe.Piece;
import game.tictactoe.Position;
import util.Dice;

public class Bot extends Player {

    public Bot(String playerName) {
        super(playerName);
    }

    @Override
    public void processResult(int result) {
    }

    @Override
    public String chooseWord() {
        String[] Words = new String[3];
        Words[0] = "HELLO";
        Words[1] = "EXAMPLE";
        Words[2] = "FRIDAY";

        return Words[Dice.generateValue(3)];
    }

    @Override
    public char giveLetter() {
        String letter = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        return letter.charAt(Dice.generateValue(letter.length()));
    }

    @Override
    public Position putMark() {
        int row = Dice.generateValue(4);
        int column = Dice.generateValue(4);
        Piece[][] board = new Board().getBoard();
        while (row <= 0 || column <= 0 || board[row - 1][column - 1] != null) {
            row = Dice.generateValue(3);
            column = Dice.generateValue(3);
        }
        return new Position(row, column);
    }
}
