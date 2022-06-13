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

//        while (true) {
//            System.out.println("Can we get tickets to Mt.Splashmore?");
//            if(in.next().equalsIgnoreCase("yes")) {
//                System.out.println("It's about time!");
//                break;
//            }
//        }

//        System.out.println("Can we get tickets to Mt.Splashmore?");
//        while (!in.next().equalsIgnoreCase("yes")) {
//            System.out.println("Can we get tickets to Mt.Splashmore?");
//        }
//        System.out.println("It's about time!");

//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println("This will only appear 5x.");
//            }
//        }

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        int x = 0;
//        do {
//            System.out.println(x += 2);
//        } while (x < 200);

//        int x = 100;
//        do {
//            System.out.println(x -= 5);
//        } while (x > -10);

//        long x = 2;
//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x <= 1000000);

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 200; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

//        for(int i = 0; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                }else if (i % 3 == 0) {
//                        System.out.println("Fizz");
//                    }else {
//                  System.out.println(i);
//                }
//            }


//        System.out.println("Give me a number.");
//        double input = Integer.parseInt(in.nextLine());
//
//        String number = "number";
//        String squared = "squared";
//        String cubed = "cubed";
//
//        final int iMax = 3;
//
//        System.out.println();
//        for (int i = 1; i <= 1; i++) {
//            System.out.printf("%10s | %9s | %9s |", number, squared, cubed);
//        }
//
//        System.out.println();
//        for (int i = 1; i <= iMax; i++) {
//            System.out.printf("%10s |", "-------");
//        }
//        System.out.println();
//
//        for (double x = 1; x <= input; x++) {
//            for (int i = 1; i <= iMax; i++) {
//                System.out.printf("%-10.0f |", Math.pow(x, i));
//            }
//            System.out.println();
//        }


        //Grading Scale
        boolean decision = true;
        while (decision) {
            System.out.println("GIVE ME YOUR GRADE FROM 0 TO 100!");
            int grade = in.nextInt();
            if (grade <= 100 && grade >= 95) {
                System.out.println("A+");
            } else if (grade <= 94 && grade >= 88) {
                System.out.println("A");
            } else if (grade <= 87 && grade >= 85) {
                System.out.println("B+");
            } else if (grade <= 84 && grade >= 80) {
                System.out.println("B");
            } else if (grade <= 79 && grade >= 74) {
                System.out.println("C+");
            } else if (grade <= 73 && grade >= 67) {
                System.out.println("C");
            } else if (grade <= 66 && grade >= 64) {
                System.out.println("D+");
            } else if (grade <= 63 && grade >= 60) {
                System.out.println("D");
            } else if (grade <= 59 && grade >= 0) {
                System.out.println("F");
            }
            System.out.println("Do you want to enter another number? (Y/N)");
            String userChoice = in.next();
            if(userChoice.equalsIgnoreCase("n")){
                decision = false;
            }
        }
        System.out.println("Have a good day!");


    }
}
