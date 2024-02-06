package objects;

public class hand {
        int size;
        Card[] cards; 
        int extraSize; 

       public hand()
       {
        Card cards[] = {}; 
        this.cards = cards; 
        this.size = 0; 
       }

       public int getSize() {
        return size; 
        }

        public Card getCard1() {
            if (size > 0)
            {
                return cards[0]; 
            }

            throw new Error("The hand does not have enough cards");
        }

        public Card getCard2(){
            if (size > 1)
            {
                return cards[1]; 

            }

            throw new Error("The hand does not have enough cards");
        }

        public int addCard(Card card) {
             size += 1;
            cards[size]  = card; 
        
            return 0; 

        }

}
