package game.hangman;

import game.GamePlayersProvider;
import game.GamePlayer;
import Player.Bot;
import game.Game;

public class HangMan extends Game {
    private final int NUMBER_OF_TURNS = 2;
    private final int NUMBER_OF_PLAYERS = 2;
    private final GamePlayer[] gamePlayers;

    public HangMan(GamePlayersProvider gamePlayersProvider) {
        gamePlayers = gamePlayersProvider.getGamePlayers(NUMBER_OF_PLAYERS);
    }

    @Override
    public void Execute() {
        GamePlayer[] roles = AssignRoles();
        for (int i = 0; i < NUMBER_OF_TURNS; i++) {
            turnHangMan = new TurnHangMan(gamePlayer1, gamePlayer2);
            System.out.println("Preparing a new turn...\n");
            System.out.println("Giver: " + roles[0].getName());
            System.out.println("Guesser: " + roles[1].getName());
            turnHangMan = new TurnHangMan(roles[0], roles[1]);
            turnHangMan.play();
            //if (turnHangMan.getResult() != null) {
                //turnHangMan.add(turnHangMan.getResult()); Results assignment
            //}
            roles = flipTurns(roles);
        }
    }
}
