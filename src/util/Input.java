package util;

import org.w3c.dom.ls.LSOutput;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
//        System.out.println(("What is your name?\n"));
        String string = scanner.nextLine();
        return string;
    }

    public boolean yesNo() {
        System.out.println("Enter Yes or No: (Y/N)");
        String resp = scanner.nextLine();
        boolean decision = false;
        if (resp.equalsIgnoreCase("y")) {
            decision = true;
        }
        return decision;
    }


    public Integer getInt(int min, int max) {
        System.out.printf("Give me a number between %d and %d.%n", min, max);
        Integer input;
        try {
            input = Integer.valueOf(getString());
            if (input <= min || input >= max) {
                System.out.println("Sorry, wrong answer");
                return getInt(min, max);
            } else if (input >= min && input <= max) {
                System.out.println("Your number was: ");
            }
            return input;
        } catch (NumberFormatException e) {
            System.out.println("That's not right!");
            return getInt(min, max);
        }
    }

        public Integer getInt () {
            System.out.println("What is your favorite number?");
            int favorite;
            try {
                favorite = Integer.valueOf(getString());
                System.out.println("Your favorite number is: ");
                return favorite;
            } catch (NumberFormatException e) {
                return getInt();
            }
        }

        public Double getDouble ( double min, double max){
            System.out.printf("Give me a number between %.0f and %.0f.%n", min, max);
            double input;
            try {
                input = Double.valueOf(getString());
                if (input < min || input > max) {
                    System.out.println("Sorry, wrong answer");
                    return getDouble(min, max);
                } else if (input >= min && input <= max) {
                    System.out.println("Your number was: ");
                }
                return input;
            } catch (NumberFormatException e) {
                return getDouble();
            }
        }

        public Double getDouble () {
            System.out.println("What is your favorite number?\n");
            double favorite;
            try {
                favorite = Double.valueOf(getString());
                System.out.println("Your favorite number is: ");
                return favorite;
            } catch (NumberFormatException e) {
                return getDouble();
            }
        }

    public int getIntSec(int min, int max) {
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + (max - 1) + ".");
            input = this.scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

    public void clear() {
    }


//        public static void main (String[]args){
////        Input name = new Input();
////        System.out.println(name.getString());
////
////        Input call = new Input();
////        System.out.println(call.yesNo());
//
//            Input minMax = new Input();
//            System.out.println(minMax.getInt(1,10));
//
//            Input favoriteNumber = new Input();
//            System.out.println(favoriteNumber.getInt());
//
//            Input doubleMinMax = new Input();
//            System.out.println(doubleMinMax.getDouble(1, 100));
//
//            Input favoriteDouble = new Input();
//            System.out.println(favoriteDouble.getDouble());
//
//        }
    }
