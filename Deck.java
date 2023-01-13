import java.util.Random;

public class Deck {
    private Card[] deck;
    private int currentCardIndex;
    
	//stocke les cartes dans  Card[ ] deck et ensuite il appelle la fonction shuflleDeck().
   
    public Deck() {
    	Card []deck = new card[52];	
    	card.shufflleDeck();
    }
    
    
	//shuffleDeck, pour mélanger les cartes à l'aide de l'algorithme de mélange de Fisher-Yates:
	//https://www.geeksforgeeks.org/shuffle-a-given-array-using-fisher-yates-shuffle-algorithm/
    private void shuffleDeck() {
    	Random rn = new Random();
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < deck.length; j++) {
				Cards(i, rn.nextInt(52));
			}
		}
		nextCardIndex = 0;
    }
    
    public Card drawCard() {
        if(currentCardIndex == 51) {
            Card currCard = deck[currentCardIndex];
            shuffleDeck();
            return currCard;
        }
        else {
            return deck[currentCardIndex++];        
        }
    }

}
