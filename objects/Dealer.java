package objects;

public class Dealer {
    hand Hand; 
    deck Deck; 


    public Dealer(deck Decks) {
        
        deck Deck = Decks; 
    }

    public void DealStart(Player player) {

       player.Hand.cards[0] = Deck.deal(); 
       player.Hand.cards[1] = Deck.deal(); 
       player.Hand.size = 2; 

       Hand.cards[0] = Deck.deal(); 
       Hand.cards[1] = Deck.deal(); 

       Hand.size = 2; 

    }

    public int DealUntilWin(int value) //Returns 1 on win | Returns 0 in Loss
    {
        while (Utility.calculateDeckValue(Hand) < value)
        {
            int size = Hand.size; 
            Hand.cards[size] = Deck.deal(); 
            Hand.size += 1; 
        }

        if (Utility.calculateDeckValue(Hand) > 21)
        {
            return 0; 
        }

        return 1; 
    }
}
