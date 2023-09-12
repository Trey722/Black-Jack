import java.util.Random;

public class test {
    public static void main(String[] args) {
        int min = 1; // Minimum value (inclusive)
        int max = 100; // Maximum value (inclusive)

        // Create a Random object
        Random random = new Random();

        // Generate a random integer between min and max
        int randomNumber = random.nextInt((max - min) + 1) + min;

        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }
}
