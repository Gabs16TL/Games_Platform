package game.hangman;

import game.Game;
import game.GamePlayer;
import game.GamePlayersProvider;

import java.util.ArrayList;

public class HangMan extends Game {
    private final int GIVER = 0;
    private final int GUESSER = 1;
    private final int NUMBER_OF_TURNS = 2;
    private final int NUMBER_OF_PLAYERS = 2;
    private TurnHangMan turnHangMan;

    public HangMan(GamePlayersProvider gamePlayersProvider) {
        super(gamePlayersProvider);
    }

    @Override
    public void Execute() {
        results = new ArrayList<>();
        gamePlayers = gamePlayersProvider.getGamePlayers(NUMBER_OF_PLAYERS);
        GamePlayer[] roles = AssignRoles(gamePlayers);
        for (int i = 0; i < NUMBER_OF_TURNS; i++) {
            turnHangMan = new TurnHangMan(roles[GIVER], roles[GUESSER]);
            System.out.println("\nPreparing a new turn...\n");
            System.out.println("Giver: " + roles[GIVER]);
            System.out.println("Guesser: " + roles[GUESSER]);
            turnHangMan.play();
            if (turnHangMan.getResult() != null) {
                results.add((GamePlayer) turnHangMan.getResult());
            }
            roles = flipRoles(roles);
        }
    }

}
