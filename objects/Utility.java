package objects;

import java.util.Random;

public class Utility {

    public int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
    
}
