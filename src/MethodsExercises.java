import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MethodsExercises {

    static Scanner scan = new Scanner(System.in);

//    //Visibility Identifier(public), static keyword (method belongs class), returnType, nameOfMethod, parameters;
//    //Return String concat
//    public static String kudos(String name) {
//        return "Great Job " + name + "!";
//    }
//
//    //Return addition
//    public static Integer addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    //Return subtraction
//    public static Integer subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    //Return Multiplication
//    public static Integer multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    //Return Division
//    public static Integer division(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    //Returns Modulus
//    public static Integer modulus(int num1, int num2) {
//        return num1 % num2;
//    }
//
//    //Returns Recursion Multiplication
//    public static Integer recursion(int num1, int num2) {
//        if (num1 == 0 || num2 == 0) {
//            return 0;
//        } else if (num2 < 0) {
//            return -num1 + recursion(num1, num2 + 1);
//        } else {
//            return num1 + recursion(num1, num2 - 1);
//        }
//    }

//    Return User Input in certain range
    public static int range(int min, int max) {
        System.out.printf("Give me a number between %d and %d", min, max);
        int userInput = scan.nextInt();
        if (userInput < min || userInput > max) {
            range(min, max);
        }
        return userInput;
    }

//    Return Factorial
    public static void factorial() {
        System.out.println("Give me a number between 1 and 10");
        int userInput = scan.nextInt();
        int factor = 1;
        if (userInput < 1 || userInput > 10) {
            factorial();
        } else if (userInput >= 1 && userInput <= 10) {
            for (int i = 1; i <= userInput; i++) {
                int sum = factor *= i;
                String out = "";
                for (int j = 1; j <= i; j++) {
                    out += " x " + j;
                }
                System.out.println(i + "! = " + out + " = " + sum);
            }
            System.out.println("Do you want to continue? (Y/N)");
            String userChoice = scan.next();
            if (userChoice.equalsIgnoreCase("y")) {
                factorial();
            }
        }
    }

    public static void diceRoll() {
        System.out.println("How many sides on your die?");
        int sideCount = scan.nextInt();
        int die1 = (int) (Math.random() * sideCount) + 1;
        int die2 = (int) (Math.random() * sideCount) + 1;
        System.out.printf("First Die: %d%nSecond Die: %d%n", die1, die2);
        System.out.println("Do you want to roll again?");
        String choice = scan.next();
        if (choice.equalsIgnoreCase("y")) {
            diceRoll();
        }
    }


    public static void main(String[] args) {

//        //String concat
//        System.out.println(kudos("Romeo"));
//
//        //Addition
//        System.out.println(addition(10, 7));
//
//        //Subtraction
//        System.out.println(subtraction(30, 13));
//
//        //Multiplication
//        System.out.println(multiplication(9, 9));
//
//        //Division
//        System.out.println(division(32, 4));
//
//        //Modulus
//        System.out.println(modulus(100, 2));
//
//        //Recursion to Multiply
//        System.out.println(recursion(10, 10));
//
//        //Get integer in this range
        System.out.println(range(30, 47));

        //Get Factorial
        factorial();

        //Dice Roll
        diceRoll();


    }
}
