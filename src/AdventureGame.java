import java.util.Scanner;

public class AdventureGame {

    static Scanner scan = new Scanner(System.in);

//    public static void adventureGameTitle(user) {
//        System.out.println("Welcome to the QB DRIVE");
//        System.out.println("What is your name?");
//        String userName = scan.nextLine();
//    }

        public static void mainAdventureGame (int health){
            int yardsToGo = 80;
            System.out.println("QB DRIVE:\n(1): Play\n(2): Instructions");
            int playOrInstructions = scan.nextInt();
            if (playOrInstructions == 2) {
                System.out.println("INSTRUCTIONS:\nThis game is based on American Football and you will be playing the Quarterback position. In this game you will \nbe given Defensive coverages and your job is to enter when and where to run or pass the ball in order to beat \nthe coverage.You will be given 3 chances to drive the ball down the field and score a TOUCHDOWN, Good luck! ");
                mainAdventureGame(health);
            } else if (playOrInstructions == 1) {
                System.out.println("Alright, TIME TO SCORE!\n**The ball is on your 20 yard line.**\n**You're in a 5 Wide Spread Offense.**\n**The Defense is in Cover 2 man.**\nWHAT IS THE PLAY CALL (PASS OR RUN)?");
                scan.nextLine();
                String playCall = scan.nextLine();
                if (playCall.equalsIgnoreCase("run")) {
                    System.out.println("GOOD CALL, WHERE ARE WE RUNNING (LEFT, MIDDLE, RIGHT)?");
                    String run = scan.nextLine();
                    if (run.equalsIgnoreCase("left")) {
                        System.out.printf("NICE PLAY CALL, YOU GAINED 10 YARDS!\nYOU HAVE %d YARDS TO GO!", yardsToGo - 10);
                    } else if (run.equalsIgnoreCase("middle")) {
                        System.out.printf("NICE PLAY CALL, YOU GAINED 5 YARDS!\nYOU HAVE %d YARDS TO GO!", yardsToGo - 5);
                    } else if (run.equalsIgnoreCase("right")) {
                        System.out.printf("NICE PLAY CALL, YOU GAINED 5 YARDS!\nYOU HAVE %d YARDS TO GO!", yardsToGo - 10);
                    }
                }else if(playCall.equalsIgnoreCase("pass")){
                    System.out.println("WOAH, BE CAREFUL PAL! THE DEFENSE IS PLAYING THE PASS, HOW FAR DO YOU WANT TO THROW THE BALL (SHORT, MID, DEEP)?");
                    String passRange = scan.nextLine();
                    if (passRange.equalsIgnoreCase("short")) {
                        System.out.println("MAKE SURE YOU KNOW WHAT YOU'RE DOING! WHERE DO YOU WANT TO THROW THE BALL (OUT-LEFT, MIDDLE, OUT-RIGHT?");
                        String passDirection = scan.nextLine();
                        if (passDirection.equalsIgnoreCase("out-left")) {
                            System.out.printf("\"CMON! THE DEFENSE WAS READY FOR THAT, YOU GAINED 0 YARDS!\nYOU HAVE %d YARDS TO GO!", yardsToGo);
                        }
                    }else if(passRange.equalsIgnoreCase("mid")) {
                        System.out.println("MAKE SURE YOU KNOW WHAT YOU'RE DOING! WHERE DO YOU WANT TO THROW THE BALL (OUT-LEFT, MIDDLE, OUT-RIGHT?");
                        String passDirection = scan.nextLine();
                        if (passDirection.equalsIgnoreCase("out-left")) {
                            System.out.println("CMON! THE DEFENSE JUST INTERCEPTED THAT PASS, I THOUGHT YOU WERE A QB!?");
                        }
                    }
                }
        }
    }


    public static void main(String[] args) {

        //Adventure Game
        mainAdventureGame(100);
//        boolean startGame = true;
//        while (startGame) {
//            adventureGame(100);
//            System.out.println("START GAME: YES/NO)");
//            String choice = scan.next();
//            if (choice.equalsIgnoreCase("no")) {
//                startGame = false;
//            }
//        }


    }
}

