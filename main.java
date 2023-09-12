import objects.deck;
import objects.Card;

public class Main {

    public static Card[] populateDeck() {
        Card[] deck = new Card[52]; 
        int a = 0;
        for (int i = 1; i < 5; i++)
        {
            for (int j = 2; j < 15; j++)
            {
                Card currentCard = new Card(i, j); 
               deck[a] = currentCard; 
               a++; 
            }
        }

        return deck; 
    }


    public static void main(String[] args) {
        deck Deck = new deck(populateDeck());
    

        Deck.deal(); 

        Deck.printDeck(); 



        
    }

   
}

