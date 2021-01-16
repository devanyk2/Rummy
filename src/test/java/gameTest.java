import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class gameTest{
	
	/* Test number functions of constructor */
	@Test public void game_constructor(){
		game test = new rummy(3);
		assertTrue(test != null);
	}

	/* Test Rummy */
	@Test public void rummy_startgame_players(){
		game test = new rummy(3);
		ArrayList<player> players = test.getPlayers();
		assertEquals(3, players.size());
	}
	
	/* Test Rummy */
	@Test public void rummy_startgame_deck(){
		game test = new rummy(3);
		assertTrue(test.getDeck != null);
	}

	/* Test Rummy */
	@Test public void rummy_startgame_players(){
	}
	
	/* Test Rummy */
	@Test public void rummy_startgame_deck(){
	}

}
