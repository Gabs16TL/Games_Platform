package game.hangman;

import game.Game;

import java.util.Scanner;

public class HangMan extends Game {
    public int NumberOfPlayers;
    TurnHangMan turnhangman;
    Scanner option = new Scanner(System.in);

    public int Introduction() {
        return 0;
    }

    @Override
    public void Resume() {
    }

    @Override
    public int Execute(int option) {
        return 0;
    }

    @Override
    public int AssignRoles() {
        return 0;
    }

    @Override
    public void SelectPlayers() {

    }
}
