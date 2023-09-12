package objects;


import java.util.Random;



public class deck {
    private int size; 
    private Card[] decks; 
    private Card top; 

    public deck() {
        this.decks = populateDeck();
        this.size = 52;
        this.top = decks[0]; 
    }

    public int getSize() { return size; }

    public Card getTopCard() {return top;}


    //Helper function to get random int between two numbers
    public int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    //Shuffles Deck

    public void shuffleDeck(){

        int a, b; 

        Card temp; 

        for (int i = 0; i < 10; i++) {
            a = generateRandomNumber(0, size - 1); 
            b = generateRandomNumber(0, size - 1); 

            temp = decks[a]; 
            decks[a] = decks[b]; 
            decks[b] = temp; 
            
        }
    }

        //Deals a card
    public Card deal() {
        if (size > 0) {
            Card card = decks[0]; 
    
            
            for (int i = 1; i < size; i++) {
                decks[i - 1] = decks[i];
            }
    
            
            decks[size - 1] = null;
    
           
            size--;
            top = size > 0 ? decks[0] : null;
    
            return card;
        } else {
            return null; 
        }
    }

    //Prints every card in the deck 
    public void printDeck(){

        for (int i = 0; i < size - 1; i++)
        {
            System.out.println("The card color is " + decks[i].getColor() + "The value is" + decks[i].getValue());
        }

    }

    //Populates the deck
    public Card[] populateDeck() {
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

    
}
