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


    public static void main(String[] args) {
        Input name = new Input();
        System.out.println(name.getString());

        Input call = new Input();
        System.out.println(call.yesNo());

    }
}
