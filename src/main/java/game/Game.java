package game;

import java.util.Scanner;

public abstract class Game {

    public int NumberOfPlayers;

    public abstract void Introduction();

    public abstract void Execute();

    public abstract void AssignRoles();

    public void Resume() {
    }

    public void SelectPlayers() {
    }
}