import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int min = 0;
        int max = 100;
        Random r = new Random();
        int secret = r.nextInt(max - min) + min;
        // System.out.println("The scret number is "+secret);
        while (true) {
            System.out.print("Make a guess (between " + min + " and " + max + "): ");
            int guess = number.nextInt();
            if (guess > max || guess < min) {
                System.out.println("Please make a valid guess!");
                continue;
            }
            if (guess == secret) {
                System.out.println("You win!!The scret number is " + secret);
                break;
            } else if (guess > secret && max > guess) {
                max = guess;
                // System.out.println("between "+ min + " to "+ max);
            } else {
                min = guess;
                // System.out.println("between "+ guess + " to "+ max);
            }
        }

    }
}
