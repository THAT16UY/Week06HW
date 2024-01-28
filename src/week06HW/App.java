package week06HW;

public class App {
	
	public static void main(String[] arg) {
		
		Deck d1 = new Deck();
		Player p1 = new Player("Dave");
		Player p2 = new Player("Paul");
		
		d1.Shuffle();
		
		for(int i = 0; i < 52; i++) { // Use a traditional for loop, iterate 52 times calling the Draw method 
			                          //on the other player each iteration using the Deck you instantiated.
			if(i % 2 != 0) {
				p1.draw(d1);
			}
			else {
				p2.draw(d1);
			}
		}
		
		for(int j = 0; j < 26; j++) {  //Using a traditional for loop, iterate 26 
			                          // times and call the flip method for each player.
			Card p1Card = p1.flip();
			Card p2Card = p2.flip();
			p1.describe();
			p2.describe();
			if(p1Card.getValue() < p2Card.getValue()) {
				System.out.println("Player 2 won a point");
				p2.incrementScore();
			}
			else if(p2Card.getValue() < p1Card.getValue()) {
				System.out.println("Player 1 won a point");
				p1.incrementScore();
			}
			else {
				System.out.println("No point awarded.");
			}
			
		}
		
		System.out.println("Player 1: " + p1.getScore());
		System.out.println("Player 2: " + p2.getScore());
		
		if(p1.getScore() > p2.getScore()) {
			System.out.println("Player 1 is the WINNER!");
		}
		else if(p2.getScore() > p1.getScore()) {
			System.out.println("Player 2 is the WINNER!");
		}
		else {
			System.out.println("Its a DRAW!");
		}
		
		
		
	}

}
