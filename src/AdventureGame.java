import java.util.Scanner;

public class AdventureGame {

    static Scanner scan = new Scanner(System.in);


    public static void adventureGame(int health) {
        System.out.println("What is your name?");
        String userName = scan.nextLine();

    }


    public static void main(String[] args) {

        //Adventure Game
        boolean startGame = true;
        while (startGame) {
            adventureGame(100);
            System.out.println("START GAME: YES/NO)");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("no")) {
                startGame = false;
            }
        }


    }
}
