package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println(("What is your name?\n"));
        String name = scanner.nextLine();
        return name;
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
        System.out.printf("Give me a number between %d and %d.", min, max);
        int input = scanner.nextInt();
        if (input <= min || input >= max) {
            System.out.println("Sorry, wrong answer");
            getInt(min, max);
        }else if(input >= min && input <= max){
            System.out.println("Your number was: ");
        }
        return input;
    }

    public Integer getInt() {
        System.out.println("What is your favorite number?");
        int favorite = scanner.nextInt();
        return favorite;
    }

    public Double getDouble(double min, double max) {
        System.out.printf("Give me a number between %.0f and %.0f.", min, max);
        double input = scanner.nextDouble();
        if (input <= min || input >= max) {
            System.out.println("Sorry, wrong answer");
            getDouble(min, max);
        }else if(input >= min && input <= max){
            System.out.println("Your number was: ");
        }
        return input;
    }

    public Double getDouble() {
        System.out.println("What is your favorite number?");
        double favorite = scanner.nextDouble();
        return favorite;
    }


    public static void main(String[] args) {
        Input name = new Input();
        System.out.println(name.getString());

        Input call = new Input();
        System.out.println(call.yesNo());

        Input minMax = new Input();
        System.out.println(minMax.getInt(1, 100));

        Input favoriteNumber = new Input();
        System.out.println(favoriteNumber.getInt());

        Input doubleMinMax = new Input();
        System.out.println(doubleMinMax.getDouble(1, 100));

        Input doubling = new Input();
        System.out.println(doubling.getDouble());

    }
}
