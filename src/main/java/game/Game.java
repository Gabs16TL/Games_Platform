package game;

import java.util.Scanner;

public abstract class Game {

    public int NumberOfPlayers;

    public abstract int Introduction();

    public abstract int Execute(int option);

    public abstract int AssignRoles();

    public void Resume() {
    }

    public void SelectPlayers() {
    }
}