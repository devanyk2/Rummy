import java.util.ArrayList;

public class human implements player{
	public String name;
	private ArrayList<card> hand;

	/* constructor */
	public human(String name){
		this.name = name;

	}

	/* Player has option to draw from the deck(unseen) or discard pile(seen) */
	@Override
	public void draw(){

	}
	/* If player has a same suit straight(of at least 3 cards) or 3 of a kind they can play */
	@Override
	public void play(){

	}
	/* Player must always end turn by discarding one card */
	@Override
	public void discard(){

	}

}
