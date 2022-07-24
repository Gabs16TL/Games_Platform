package Player;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PlayersTest {
    private ListOfPlayers listOfPlayers;
    private Player player;

    @Before
    public void init() {
        player = new Human("Antonio");
        player = new Human("Jesus");
        player.setId(1);
        listOfPlayers = new ListOfPlayers();
      //  listOfPlayers.createPlayer(new Human("Antonio"));


    }



    @Test
    public void testCreatePlayer() {
        player = new Human("Manuel");
        listOfPlayers.createPlayer(player);
        assertNotNull(player);
        System.out.println("CreatePlayer: " + listOfPlayers.getList());
    }

    @Test
    public void testGetPlayer() {
        Player p = listOfPlayers.getPlayer(2);
        assertEquals(player.getName(), p.getName());
    }

    @Test
    public void testGetList() {

        List<Player> playerList = (List<Player>) listOfPlayers.getList();

       for (Player players : playerList) {
           System.out.println(players);
       }


        //1. Check List Size
        assertThat(playerList.size(), is(2));


        //2. check empty list
        assertThat("Not Empty", listOfPlayers.playersList.isEmpty(), is(false));


    }


    @Test
    public void testSetElementNull() {
        listOfPlayers.playersList.add(new Human("Quinteros"));
        listOfPlayers.playersList.set(2, null);
        System.out.println("Set Element Null: " + listOfPlayers.playersList);
    }



}