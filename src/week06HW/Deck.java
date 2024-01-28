package week06HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>(52);
	
	Deck(){
		//cards = new ArrayList<Card>(52);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 2; j <= 14; j++) {
				Card retCard = new Card();
				retCard.setValue(j); //set value
				
				//Compile card name
				String cardName = "";
				switch (j) { //card value
				case 11: //jack
					cardName += "Jack";
					break;
				case 12: //queen
					cardName += "Queen";
					break;
				case 13: //king
					cardName += "King";
					break;
				case 14: //ace
					cardName += "Ace";
					break;
				default: //value matches number
					cardName += String.valueOf(j);
					break;
				}
				switch (i % 4) { //card type
				case 0: //Diamonds
					cardName += " of Diamonds"; //set name
					break;
				case 1: //Hearts
					cardName += " of Hearts"; //set name
					break;
				case 2: //Clubs
					cardName += " of Clubs"; //set name
					break;
				case 3: //Spades
					cardName += " of Spades"; //set name
					break;
				}
				retCard.setName(cardName);
				
				//add the finalized card to the deck
				cards.add(retCard);
			}
		}
	}
	
	public void Shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		if (cards.isEmpty()) {return null;}
		Card retCard = cards.remove(0);
		return retCard;
	}
	
	

}
