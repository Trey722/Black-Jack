package objects;

import javax.management.ValueExp;
import javax.management.monitor.MonitorSettingException;

public class Player {
    private hand Hand; 
    private int money;
    private int moneyIn;  
    private int valueHand; 

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
        return valueHand; 
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

        Card cardA = Hand.getCard1(); 
        Card cardB = Hand.getCard2(); 

        int Value1 = cardA.getValue(); 
        int Value2 = cardB.getValue(); 

        for (int i =0; i )



        



    }



   
}

