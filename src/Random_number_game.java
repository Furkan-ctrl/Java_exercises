import java.util.Random;
import java.util.Scanner;

public class Random_number_game {
    public static void main(){

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("---Number Guessing Game---");
        System.out.printf("Guess a number between %d-%d: ", min, max);

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low!");
            }
            else if (guess > randomNumber) {
                System.out.println("Too High!");
            }
            else{
                System.out.println("Correct!! The number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        }
        while (guess != randomNumber);

        scanner.close();

    }
}
