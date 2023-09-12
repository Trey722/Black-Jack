package objects;


import java.util.Random;


public class deck {
    private int size; 
    private Card[] deck; 
    private Card top; 

    public int getSize() { return size; }

    public Card getTopCard() {return top;}

    public void shuffleDeck(){
        Random rand = new Random();

        for (int i = size - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // Generate a random index between 0 and i (inclusive)
    
            // Swap the cards at index i and j
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card deal() {
        if (size > 0) {
            Card card = deck[0]; 
    
            
            for (int i = 1; i < size; i++) {
                deck[i - 1] = deck[i];
            }
    
            
            deck[size - 1] = null;
    
           
            size--;
            top = size > 0 ? deck[0] : null;
    
            return card;
        } else {
            return null; 
        }
    }

    public void printDeck(){

        for (int i = 0; i < size; i++)
        {
            System.out.println("The card color is " + deck[i].getColor() + "The value is" + deck[i].getValue());
        }

    }
    


    
}
