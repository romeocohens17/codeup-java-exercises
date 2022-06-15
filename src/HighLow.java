import java.util.Scanner;

public class HighLow {

    static Scanner scan = new Scanner(System.in);

    public static void guessingGame() {
        System.out.println("Guess a number between 1 and 100");
        int userGuess = scan.nextInt();
        int randomNumber = (int) (Math.random() * (100 - 1)) + 1;
        if (userGuess < 1) {
            System.out.println("HIGHER");
            guessingGame();
        }else if (userGuess > 100) {
            System.out.println("LOWER");
            guessingGame();
        }else if (userGuess == randomNumber) {
            System.out.printf("GOOD GUESS! %n Your number was %d%n Random number was %d%n", userGuess, randomNumber);
        }else if (userGuess >= 1 && userGuess <= 100) {
            System.out.printf("NICE TRY! %n Your number was %d%n Random number was %d%n", userGuess, randomNumber);
        }
        System.out.println("Do you want to guess again? Y/N");
        String choice = scan.next();
        if (choice.equalsIgnoreCase("y")) {
            guessingGame();
        }

    }









    public static void main(String[] args){


        //Guessing Game
        guessingGame();





    }

}
