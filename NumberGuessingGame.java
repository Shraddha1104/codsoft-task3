import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int rounds = 0;
        int score = 0;
        boolean playAgain;

        do {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("Round " + (rounds + 1) + ": Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    guessedCorrectly = true;
                    score++;
                    System.out.println("Correct! You've guessed the number.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You've used all your attempts. The correct number was: " + numberToGuess);
            }

            rounds++;
            System.out.println("Your score: " + score + "/" + rounds);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thanks for playing! Your final score is " + score + "/" + rounds);
        scanner.close();
    }
}
/*
 OUTPUT
 Round 1: Guess the number between 1 and 100. You have 5 attempts.
Enter your guess: 50
Too high.
Enter your guess: 42
Too high.
Enter your guess: 76
Too high.
Enter your guess: 45
Too high.
Enter your guess: 79
Too high.
You've used all your attempts. The correct number was: 31
Your score: 0/1
Do you want to play again? (yes/no): no
Thanks for playing! Your final score is 0/1
 */

