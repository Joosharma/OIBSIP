import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            // Game settings
            int min = 1;
            int max = 100;
            int maxAttempts = 10; // Maximum number of attempts per round
            int rounds = 3; // Number of rounds
            int score = 0;

            // Instructions
            System.out.println("Welcome to the Guess the Number game!");
            System.out.println("I have selected a random number between " + min + " and " + max + ".");
            System.out.println("Try to guess it within " + maxAttempts + " attempts.");
            System.out.println("You will play " + rounds + " rounds. Points are awarded based on the number of attempts taken.");

            // Main game loop for multiple rounds
            for (int round = 1; round <= rounds; round++) {
                System.out.println("\nRound " + round + " of " + rounds);

                int targetNumber = random.nextInt(max - min + 1) + min;
                int attempts = 0;
                boolean guessedCorrectly = false;

                // Round loop for attempts
                while (attempts < maxAttempts) {
                    System.out.print("Enter your guess: ");
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess == targetNumber) {
                        guessedCorrectly = true;
                        score += (maxAttempts - attempts + 1); // Points based on attempts taken
                        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                        System.out.println("You earned " + (maxAttempts - attempts + 1) + " points.");
                        break;
                    } else if (userGuess < targetNumber) {
                        System.out.println("sorry smaller than target! Try again.");
                    } else {
                        System.out.println("sorry greater than target! Try again.");
                    }
                }

                if (!guessedCorrectly) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
                }
            }

            // Final score display
            System.out.println("\nGame Over! Your final score is: " + score);

            // Close the scanner
            scanner.close();
        }
    }


