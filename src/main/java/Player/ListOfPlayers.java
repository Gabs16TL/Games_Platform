package Player;

import game.Game;
import game.GamePlayer;
import game.GamePlayersProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfPlayers implements GamePlayersProvider {
    private final Scanner sn = new Scanner(System.in);
    List<Player> playersList = new ArrayList<Player>();

    public ListOfPlayers() {
        createPlayer(new Human("Antonio"));
        createPlayer(new Human("Jesus"));
    }

    public void createPlayer(Player player) {
        player.setId(playersList.size() + 1);
        playersList.add(player);
    }

    public Player getPlayer(int id) {
        for (Player p : playersList) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public List<Player> getList() {
        return playersList;
    }

    private void printList() {
        System.out.println("\nPlayers list: ");
        for (Player player : playersList) {
            System.out.println(player.getId() + ". " + player.getName());
        }
    }

    @Override
    public Player[] getGamePlayers(int size) {
        printList();
        Player[] players = new Player[size];
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter the player id: ");
            int id = (sn.nextInt());
            System.out.println("Selected: " + getPlayer(id).getName());
            players[i] = getPlayer(id);
        }
        return players;
    }
}
