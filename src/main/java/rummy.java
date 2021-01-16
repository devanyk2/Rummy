import java.util.ArrayList;

public class rummy implements game{
	private ArrayList<player> players;
	private deck currentDeck;
	private ArrayList<card> pile;

	public rummy(){
	}

	@Override
	public void startGame(int numPlayers){
		initPlayers(numPlayers);
		initDeck();
		deal();
		turnOver();
	}

	/* load the deck */
	private void initDeck(){
		if (currentDeck == null){
			currentDeck = new deck();
		}
		else{
			currentDeck.refresh();
		}
	}

	/* load the players */
	private void initPlayers(int num){
		for(int i; i < numPlayers; i++){
			String name = "player" + i;
			player p = new player(name);
			players.add(p);
		}
	}
	
	/* deal 7 cards to each player */
	private void deal(){
	}
	
	/* initialize the discard pile */
	private void turnOver(){
	}

	@Override
	public void rotation(){
		while(true){
			for(player p : players){
				p.draw(this);
				p.play(this);
				p.discard(this);
			}
		}
	}

	@Override
	public void score(){
	}
	
	@Override 
	public void endGame(){
	}


}
