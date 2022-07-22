package game;

public abstract class Game {
    protected GamePlayersProvider gamePlayersProvider;

    public Game(GamePlayersProvider gamePlayersProvider) {
        this.gamePlayersProvider = gamePlayersProvider;
    }

    public abstract void Introduction();

    public abstract void Execute();

    public abstract void Resume();

    public abstract GamePlayer[] AssignRoles(GamePlayer gamePlayer1, GamePlayer gamePlayer2);
}