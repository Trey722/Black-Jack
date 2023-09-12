package objects;


import java.util.Random;

import objects.Utility; 



public class deck {
    private int size; 
    private Card[] decks; 
    private Card top; 

    public deck(Card[] cardDeck) {
        this.decks = cardDeck;
        this.size = 52;
        this.top = cardDeck[0]; 
    }

    public int getSize() { return size; }

    public Card getTopCard() {return top;}


    //Helper function to get random int between two numbers
    public int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

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

    public void printDeck(){

        for (int i = 0; i < size - 1; i++)
        {
            System.out.println("The card color is " + decks[i].getColor() + "The value is" + decks[i].getValue());
        }

    }

    
    


    
}
