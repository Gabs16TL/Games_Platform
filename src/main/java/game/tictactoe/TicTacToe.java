package game.tictactoe;

import game.Game;
import game.GamePlayer;
import game.GamePlayersProvider;

import java.util.ArrayList;

public class TicTacToe extends Game {
    private final int GAME_PLAYER_X = 0;
    private final int GAME_PLAYER_O = 1;
    private final int NUMBER_OF_TURNS = 2;
    private final int NUMBER_OF_PLAYERS = 2;
    private TurnTicTacToe turnTicTacToe;

    public TicTacToe(GamePlayersProvider gamePlayersProvider) {
        super(gamePlayersProvider);
    }



    @Override
    public void Execute() {
        results = new ArrayList<>();
        gamePlayers = gamePlayersProvider.getGamePlayers(NUMBER_OF_PLAYERS);
        GamePlayer[] roles = AssignRoles(gamePlayers);
        for (int i = 0; i < NUMBER_OF_TURNS; i++) {
            turnTicTacToe = new TurnTicTacToe(roles[GAME_PLAYER_X], roles[GAME_PLAYER_O]);
            System.out.println("\nPreparing a new turn...\n");
            System.out.println("Game Player X: " + roles[GAME_PLAYER_X]);
            System.out.println("Game Player O: " + roles[GAME_PLAYER_O]);
            turnTicTacToe.play();
            if (turnTicTacToe.getResult() != null) {
                results.add((GamePlayer) turnTicTacToe.getResult());
            }
            roles = flipRoles(roles);
        }
    }

}