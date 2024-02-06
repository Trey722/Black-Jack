package objects;

import java.util.Random;

public class Utility {

    public int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static int calculateDeckValue(hand Hand)
    {
        int value = 0; 
        int Ace = 0; 
        for (int i =0; i < Hand.size; i++)
        {
            int cur = Hand.cards[i].getValue(); 
            if (cur == 14)
            {
                Ace += 1;
            }

            value += cur; 

        }

        if (value > 21)
        {
            if (Ace > 0)
            {
                for (int i =0; i < Ace; i++)
                {
                    value -= 13; 
                    if (value <= 21)
                    {
                        return value; 
                    }
                }
                if (value > 21)
                {
                    return 100; 
                }
            }

            return 100; 
        }

        return value;
    }
    
}
