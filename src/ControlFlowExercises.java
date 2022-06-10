import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        double jeff = 9.7;
//        int geoff = 9;
//        String nine = "9";
//        boolean isIt = jeff == geoff;
//
//        boolean ruiner = false;
//        boolean isThatAndThisTrue = ruiner & (ruiner = true);
//        System.out.println(ruiner);

        String name = "Romeo";
        String myCat = "Sammy";
        myCat = "romeo";

        boolean areTheseTheSame = name.equalsIgnoreCase(myCat);
        System.out.println(areTheseTheSame);

        Scanner in = new Scanner(System.in);

//        System.out.println("Wait, Who's the G.O.A.T.?");
////        if(in.next().equalsIgnoreCase(myCat)) {
////            System.out.println("Yessir!");
////        } else {
////            System.out.println("You must not know my boy!");
////        }
//        switch (in.next()) {
//            case "Romeo":
//                System.out.println("Is my name, don' wear it out!");
//                break;
//            case "Jay":
//                System.out.println("Has a good playlist");
//                break;
//            case "Chino":
//                System.out.println("The old guy?");
//                break;
//            default:
//                System.out.println("or whatever...");
//                break;
//        }

        while (true) {
            System.out.println("Can we get tickets to Mt.Splashmore?");
            if(in.next().equalsIgnoreCase("yes")) {
                System.out.println("It's about time!");
                break;
            }
        }

//        System.out.println("Can we get tickets to Mt.Splashmore?");
//        while (!in.next().equalsIgnoreCase("yes")) {
//            System.out.println("Can we get tickets to Mt.Splashmore?");
//        }
//        System.out.println("It's about time!");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("This will only appear 5x.");
            }
        }

    }
}
