package objects;

public class hand {
    private int size; 
        private Card card1; 
        private Card card2; 

       public hand(Card card1, Card card2)
       {
        this.card1 = card1; 
        this.card2 = card2; 
        this.size = 0; 
       }

       public int getSize() {
        return size; 
        }

        public Card getCard1() {
            return card1; 
        }

        public Card getCard2(){
            return card2; 
        }

}
