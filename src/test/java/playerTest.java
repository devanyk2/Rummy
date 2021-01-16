import org.junit.Test;
import static org.junit.Assert.*;

public class playerTest{
	
	/* Test constructor */
	@Test public void player_constructor(){
		player test = new human("");
		assertTrue(test != null);
	}

	/* Test constructor */
	@Test public void player_constructor_name(){
		player test = new human("Dave");
		assertTrue("Dave".equals(test.name));
	}

		

}
