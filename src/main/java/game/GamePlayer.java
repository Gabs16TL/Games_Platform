package game;


import game.hangman.HangManPlayer;
import game.tictactoe.TicTacToePlayer;

public interface GamePlayer extends HangManPlayer, TicTacToePlayer {
      void processResult(int result);
}
