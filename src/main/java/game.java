import java.util.ArrayList;

public interface game{
	public void startGame();
	public void rotation();
	public void score();
	public void endGame();
	public ArrayList<player> getPlayers();
	public gameRoutine getRoutine();
}


