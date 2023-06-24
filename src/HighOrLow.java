import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int userGuess;

        do {
            System.out.print("Guess the number (between 1 and 10): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid numeric guess: ");
                scanner.next();
            }
            userGuess = scanner.nextInt();
        } while (userGuess < 1 || userGuess > 10);

        System.out.println("The random number is: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the number correctly!");
        } else if (userGuess < randomNumber) {
            System.out.println("Too low! Better luck next time!");
        } else {
            System.out.println("Too high! Better luck next time!");
        }
    }
}
