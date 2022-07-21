package Player;

import java.util.ArrayList;
import java.util.List;

public class ListOfPlayers {

     List<Player> playerList = new ArrayList<Player>();


     public void createPlayer(Player player) {
         playerList.add(player);
     }

     public Player getPlayer(int idPlayer) {

         for (Player player : playerList) {
             if (player.getIdPlayer() == idPlayer) {
                 return player;
             }
         }
         return null;
     }




 public List<Player> getList() {
     return playerList;
 }




}
