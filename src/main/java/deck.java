import java.util.ArrayList;
import java.util.Random;

public class deck{
	private ArrayList<card> cards;

	public deck(){
		cards = new ArrayList<card>(); 
		refresh();
	}

	public int size(){
		return this.cards.size();
	}

	/* default shuffle */
	public void shuffle(){
		shuffle(100);
	}
	
	/* specified shuffle */
	public void shuffle(int rounds){
		Random r = new Random();
		while (rounds > 0){
			int x = r.nextInt(52);
			int y = r.nextInt(52);
			if (x != y){
				swap(x,y);
				rounds += -1;
			}
		}
	}
	
	/* swaps two cards in an arrayList */
	private void swap(int x, int y){
		card cx = cards.get(x);
		cards.set(x, cards.get(y));
		cards.set(y, cx);
	}
	
	/* reveals the top card but does not remove it */
	public card peek(){
		return cards.get(0);
	}

	public void refresh(){
		String[] suits = {"h", "d", "s", "c"};
		for(String s : suits){			//for every suit, create 13 cards
			int num = 0;
			card c = new card(num, s);
			cards.add(c);
			num++;
			while((num % 13) != 0){		//switch suit on the 14th iteration
				c = new card(num, s);
				cards.add(c);
				num++;
			}
		}
	}
	/* returns a card from the top of the deck */
	public card deal(){
		return this.cards.remove(0);
	}
}
