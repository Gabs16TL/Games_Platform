package Player;

import game.GamePlayer;

import java.util.Random;

public abstract class Player implements GamePlayer {

    private int idPlayer;
    private String playerName;


    public Player(String playerName) {
        this.playerName = playerName;
    }


    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int throwDice() {
        Random rd = new Random();
        int flip = rd.nextInt(1) + 0;

        if (flip == 0)
            return 0;
        else
            return 1;
    }
}
