import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean correctGuess = false;
        int guess = 0;
        int increment = 0;

        System.out.println("Hello user. What is your name?");

        String name = input.nextLine();
        System.out.println("Welcome " + name + " I'm thinking of a number between 1 and 100.");

        Random rand = new Random();

        int number = rand.nextInt(100);

        System.out.println("Try to guess my number.");

        while (correctGuess == false) {
            increment++;
            int guessNum;
            try {
                guessNum = input.nextInt();
            } catch (Exception e) {
                String badInput = input.next();
                System.out.println("That's not an integer, try again.");
                continue;
            }

            if ((guessNum > 100) || (guessNum < 1)) {
                System.out.println("Your guess is out of range. Please try again.");
            } else if (guessNum > number) {
                System.out.println("Your guess is too high. Please try again");
            } else if (guessNum < number) {
                System.out.println("Your guess is too low. Please try again");
            } else if (guessNum == number) {
                System.out.println("Well done, " + name + "! You found my number in " + increment + " tries!");
                correctGuess = true;
            }
        }
//        new MarsExpedition();
        new FindingLists();
    }
}