import java.util.HashMap;

public class table{
	private game currGame;
	private HashMap<String, game> gameMap = new HashMap<String,game>() {{
		put("Rummy", new rummy());	
	}};

	public void main(String[] args){
		initGame();
		runGame();
	}

	private void initGame(){
		String game = settings.gameChoice();
		int numPlayers = settings.gameSize();
		currGame = gameMap.get(game);
		currGame.startGame(numPlayers);
	}

	private void runGame(){
		rotation();
		score();
		endGame();
	}



}
