import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int target;
        if (args.length >= 1) {
            try {
                target = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                target = random.nextInt(100) + 1;
            }
        } else {
            target = random.nextInt(100) + 1;
        }
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        while (guess != target) {
            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next();
                continue;
            }
            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Your guess must be between 1 and 100.");
            } else if (guess < target) {
                System.out.println("Too low. Try again.");
            } else if (guess > target) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
