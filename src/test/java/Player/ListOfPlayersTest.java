package Player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.*;

class ListOfPlayersTest {
    private ListOfPlayers listOfPlayers;
    private Player player;

    @Before
    public void init() {
        player = new Human("Antonio");
        player.setId(1);
        listOfPlayers = new ListOfPlayers();
        listOfPlayers.createPlayer(new Human("Antonio"));
    }

    @Test
    public void testCreatePlayer() {
    }

    @Test
    public void testGetPlayer() {
        Player p = listOfPlayers.getPlayer(1);
        assertEquals(player.getName(), p.getName());
    }


    public void testGetList() {


       /*public void testPrintList () {
        }


        public void testGetGamePlayers () {
        }*/
    }
}