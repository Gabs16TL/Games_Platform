package game;

import Player.GamePlayersProvider;
import Player.Player;

import java.util.Scanner;

public abstract class Game {


    protected GamePlayersProvider gamePlayersProvider;

    public Game(GamePlayersProvider gamePlayersProvider) {
        this.gamePlayersProvider = gamePlayersProvider;
    }

    public int NumberOfPlayers;

    public abstract void Introduction();

    public abstract void Execute();

    public abstract Player[] AssignRoles(Player player1, Player player2);

    public void Resume() {
    }

    public abstract Player SelectPlayers();
}