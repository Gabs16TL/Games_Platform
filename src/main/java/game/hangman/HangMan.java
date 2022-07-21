package game.hangman;

import Player.GamePlayersProvider;
import Player.Player;
import Player.Bot;
import game.Game;

import java.util.Scanner;

public class HangMan extends Game {

    public int NumberOfPlayers;
    TurnHangMan turnhangman;
    Scanner option = new Scanner(System.in);

    public HangMan(GamePlayersProvider gamePlayersProvider) {
        super(gamePlayersProvider);
    }

    public void Introduction() {
    }

    @Override
    public void Resume() {
    }

    @Override
    public void Execute() {
    }

    @Override
    public Player[] AssignRoles(Player player1, Player player2) {
        return new Player[0];
    }

    @Override
    public Player SelectPlayers() {
        return new Bot("");
    }
}
