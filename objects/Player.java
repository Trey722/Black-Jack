package objects;

import javax.management.ValueExp;
import javax.management.monitor.MonitorSettingException;

public class Player {
    hand Hand; 
    int money;
    int moneyIn;  
    private int valueHand; 

    public Player player(hand Hand, int money, int moneyIn, int valueHand)
    {
        return this.player(Hand, money, moneyIn, valueHand); 
    }
    public hand getHand()
    {
        return Hand; 
    }

    public int getMoney()
    {
        return money; 
    }

    public int getMoneyIn()
    {
        return moneyIn; 
    }

    public int getValueHand()
    {
        return Utility.calculateDeckValue(Hand); 
    }

    public int Hit(objects.deck deck)
    {
        Hand.addCard(deck.deal()); 
        return 0; 
    }

    public Player(int money)
    {
        this.money = money; 
        this.Hand = null; 
        this.moneyIn = 0; 
        this.valueHand = 0; 
    }

    //THis is used to increase the amount a player has bidded
    public int increaseBid(int amount)
    {
        if (money < amount)
        {
            return -1; 
        }

        money -= amount;

        moneyIn += amount; 

        return 0; 
    }

    public int calculateHandValue()
    {
        hand curHand = Hand; 

        int total_value = 0; 

        int card_value = 0;

        int ace = 0; 
       

        for (int i = 0; i < curHand.getSize(); i++)
        {
            card_value = Hand.cards[i].getValue(); 

                if (card_value == 14)
                {
                    ace += 1;
                    if (total_value + 11 > 21)
                    {
                        total_value += 1; 
                    }
                else {
                    ace += 1; 
                    card_value += 1; 
                    }

                    
            }

            if (card_value > 21)
            {
                for (int j = 0; j < ace; j++)
                {
                    card_value -= 10; 
                }

                if (card_value > 21) return 100; 
            }
        }

        return card_value; 


    }



   
}

