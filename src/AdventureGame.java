import java.util.Scanner;

public class AdventureGame {

    static Scanner scan = new Scanner(System.in);

//    public static void adventureGameTitle(user) {
//        System.out.println("Welcome to the QB DRIVE");
//        System.out.println("What is your name?");
//        String userName = scan.nextLine();
//    }

        public static void mainAdventureGame (int health, int yardsToGo){
            System.out.println("QB DRIVE:\n(1): Play\n(2): Instructions");
            int playOrInstructions = scan.nextInt();
            if (playOrInstructions == 2) {
                System.out.println("INSTRUCTIONS:\nThis game is based on American Football and you will be playing the Quarterback position. In this game you will \nbe given Defensive coverages and your job is to enter when and where to run or pass the ball in order to beat \nthe coverage.You will be given 3 chances to drive the ball down the field and score a TOUCHDOWN, Good luck! ");
                mainAdventureGame(health, yardsToGo);
            } else if (playOrInstructions == 1) {
                System.out.println("Alright, TIME TO SCORE!\n**The ball is on your 20 yard line.**\n**You're in a 5 Wide Spread Offense.**\n**The Defense is in Cover 2 man.**\nWHAT IS THE PLAY CALL (PASS OR RUN)?");
                scan.nextLine();
                String playCall = scan.nextLine();
                //Run Option
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
                    //Pass Option
                }else if(playCall.equalsIgnoreCase("pass")){
                    System.out.println("WOAH, BE CAREFUL PAL! THE DEFENSE IS PLAYING THE PASS, HOW FAR DO YOU WANT TO THROW THE BALL (SHORT, MID, DEEP)?");
                    String passRange = scan.nextLine();
                    //Short Pass Options
                    if (passRange.equalsIgnoreCase("short")) {
                        System.out.println("MAKE SURE YOU KNOW WHAT YOU'RE DOING! WHERE DO YOU WANT TO THROW THE BALL (OUT-LEFT, MIDDLE, OUT-RIGHT?");
                        String passDirection = scan.nextLine();
                        if (passDirection.equalsIgnoreCase("out-left")) {
                            System.out.printf("CMON! THE DEFENSE WAS READY FOR THAT, YOU GAINED 0 YARDS!\nYOU HAVE %d YARDS TO GO!", yardsToGo);
                        }else if (passDirection.equalsIgnoreCase("middle")) {
                            System.out.printf("CLOSE CALL! SLANT WAS COMPLETED FOR 5 YARDS!\nYOU HAVE %d YARDS TO GO!", yardsToGo - 5);
                        }else if (passDirection.equalsIgnoreCase("out-right")) {
                            System.out.println("CMON! THE DEFENSE WAS READY FOR THAT, YOU GAINED 0 YARDS!\nYOU HAVE %d YARDS TO GO!");
                        }
                        //Mid-Range Pass Options
                    }else if(passRange.equalsIgnoreCase("mid")) {
                        System.out.println("MAKE SURE YOU KNOW WHAT YOU'RE DOING! WHERE DO YOU WANT TO THROW THE BALL (OUT-LEFT, MIDDLE, OUT-RIGHT?");
                        String passDirection = scan.nextLine();
                        if (passDirection.equalsIgnoreCase("out-left")) {
                            health--;
                            System.out.printf("CMON! THE DEFENSE JUST INTERCEPTED THAT PASS, I THOUGHT YOU WERE A QB!?\nYOU ONLY HAVE %d MORE ATTEMPTS!\nGET YOUR HEAD IN THE GAME QB!", health);
                        }else if(passDirection.equalsIgnoreCase("middle")) {
                            System.out.printf("GREAT CALL! YOU BEAT THE DEFENSE WITH THAT DIG ROUTE!\nYOU HAVE %d YARDS TO GO!", yardsToGo - 15);
                        }else if(passDirection.equalsIgnoreCase("out-right")) {
                            health--;
                            System.out.printf("CMON! THE DEFENSE JUST INTERCEPTED THAT PASS, I THOUGHT YOU WERE A QB!?\nYOU ONLY HAVE %d MORE ATTEMPTS!\nGET YOUR HEAD IN THE GAME QB!", health);
                        }
                        //Deep-Range Pass Options
                    }else if(passRange.equalsIgnoreCase("deep")) {
                        System.out.println("MAKE SURE YOU KNOW WHAT YOU'RE DOING! WHERE DO YOU WANT TO THROW THE BALL (OUT-LEFT, MIDDLE, OUT-RIGHT?");
                        String passDirection = scan.nextLine();
                        if (passDirection.equalsIgnoreCase("out-left")) {
                            health--;
                            System.out.printf("INTERCEPTION! YOU SHOULD KNOW NOT TO THROW UP THE SIDELINE AGAINST COVER 2!\nYOU ONLY HAVE %d MORE ATTEMPTS!\nGET YOUR HEAD IN THE GAME QB!", health);
                        }else if(passDirection.equalsIgnoreCase("middle")) {
                            System.out.printf("PERFECT CALL! THE WEAK SPOT TO A COVER 2 IS DEEP MIDDLE! YOU PICKED UP 25 YARDS WITH THAT POST ROUTE!\nYOU HAVE %d YARDS TO GO!", yardsToGo - 25);
                        }else if(passDirection.equalsIgnoreCase("out-right")) {
                            health--;
                            System.out.printf("INTERCEPTION! YOU SHOULD KNOW NOT TO THROW UP THE SIDELINE AGAINST COVER 2!\nYOU ONLY HAVE %d MORE ATTEMPTS!\nGET YOUR HEAD IN THE GAME QB!", health);
                        }
                    }
                }
        }
            System.out.printf("\nATTEMPTS: %d\nYARDS TO GO: %d\n**You're still in a 5 Wide Spread Offense.**\n**The Defense is now in a Cover 3 scheme.**\nWHAT IS THE PLAY CALL (PASS OR RUN)?",health, yardsToGo);
            scan.nextLine();
    }


    public static void main(String[] args) {

        //Adventure Game
        mainAdventureGame(3, 80);


    }
}

