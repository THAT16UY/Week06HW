package week06HW;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private int score;
	private List<Card> hand;
	private String name;
	Player(String n){
		
		score = 0;
		name = n;
		hand = new ArrayList<Card>();
	}
	
	public void describe() {
		//compile player content
		String strName = "Name: " + this.name + "\n";
		String strScore = "Score: " + this.score + "\n";
		
		//compile player cards in hand
		String strHand = "";
		for (int i = 0; i < hand.size(); i++) {
			strHand += hand.get(i).describe();
		}
		
		//print out all information
		System.out.println(strName + strScore + strHand);
	}
	
	public Card flip() {
		Card retCard = hand.remove(0);
		return retCard;
	}
	
	public int getScore() {
		return score;
	}
	
	public void draw(Deck d) {
		Card reCard = d.draw();
		hand.add(reCard);
	}
	
	public void incrementScore() {
		this.score += 1;
	}
	

	
	

}
