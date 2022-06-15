import java.util.Scanner;

public class HighLow {

    static Scanner scan = new Scanner(System.in);

    public static void guessingGame(int numberOfGuesses, int randomNumber) {
        if (numberOfGuesses < 1) {
            System.out.println("YOU LOSE!");
        } else{
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + numberOfGuesses + " trys to guess the correct number!");
            --numberOfGuesses;
            int userGuess = scan.nextInt();
            if (userGuess > randomNumber) {
                System.out.println("LOWER");
                guessingGame(numberOfGuesses, randomNumber);
            }else if (userGuess < randomNumber) {
                System.out.println("HIGHER");
                guessingGame(numberOfGuesses, randomNumber);
            }else {
                int guesses = 10 - numberOfGuesses;
                System.out.printf("GOOD GUESS! %n Your number was %d%n Random number was %d%n", userGuess, randomNumber);
                System.out.println("You guessed " + guesses + " times!");
            }
        }
    }

    public static void main(String[] args){

        //Guessing Game
        int randomNumber = (int) (Math.random() * (100 - 1)) + 1;

        boolean keepPlaying = true;
        while(keepPlaying){
            guessingGame(10, randomNumber);
            System.out.println("Do you want to play again? Y/N");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("n")) {
                keepPlaying = false;
            }
        }


    }

}
