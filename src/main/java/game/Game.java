package game;

import Player.GamePlayersProvider;

import java.util.Scanner;

public abstract class Game {


    private GamePlayersProvider gamePlayersProvider;

    public Game(GamePlayersProvider gamePlayersProvider) {
        this.gamePlayersProvider = gamePlayersProvider;
    }

    public int NumberOfPlayers;

    public abstract void Introduction();

    public abstract void Execute();

    public abstract void AssignRoles();

    public void Resume() {
    }

    public void SelectPlayers() {
    }
}