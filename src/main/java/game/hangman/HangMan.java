package game.hangman;

import Player.GamePlayersProvider;
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
    public void AssignRoles() {
    }

    @Override
    public void SelectPlayers() {

    }
}
