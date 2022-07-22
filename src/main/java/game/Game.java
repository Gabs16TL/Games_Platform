package game;

import util.Dice;

import java.util.List;

public abstract class Game {
    protected GamePlayer[] gamePlayers;
    protected GamePlayersProvider gamePlayersProvider;
    protected List<GamePlayer> results;

    public Game(GamePlayersProvider gamePlayersProvider) {
        this.gamePlayersProvider = gamePlayersProvider;
    }

    public abstract void Execute();

    public void Introduction() {
        System.out.println("\nWelcome to the game!!");
        System.out.println("Let's choose some players to start!");
    }

    public void Resume() {
        System.out.println("The result is: ");
        for (int i = 0; i < results.size(); i++) {
            System.out.println("Winner " + (i + 1) + ": " + results.get(i));
        }
    }

    protected GamePlayer[] AssignRoles(GamePlayer[] gamePlayers) {
        if (Dice.generateValue(100) > 50)
            return new GamePlayer[] {gamePlayers[1], gamePlayers[0]};
        return new GamePlayer[] {gamePlayers[0], gamePlayers[1]};
    }

    protected GamePlayer[] flipRoles(GamePlayer[] gamePlayers) {
        return new GamePlayer[] {gamePlayers[1], gamePlayers[0]};
    }
}