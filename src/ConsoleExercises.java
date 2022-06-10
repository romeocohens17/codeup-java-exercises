import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        String name = "Romeo";
        System.out.println("Hi, I'm " + name + "!\n");
        System.out.println("I like oysters! \n");

        System.out.printf("Hi, I'm %s! I'm %d  years old!%n", name, 24);
        System.out.printf("Hi, I'm %s! I'm %.1f  years old!%n", name, 24.5);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hey, tell me about the  NBA Finals:");
//        String userInput = scanner.nextLine();
//        String anotherOne = scanner.next();

//        System.out.println("You said: " + userInput);
//        System.out.println(anotherOne);

//        System.out.println("Hey, whats your favorite number?");
//        int yourFavoriteNumber = scanner.nextInt();
//        scanner.nextLine();
//        System.err.println(yourFavoriteNumber);
//        System.out.println("Hey, whats your favorite color?");
//        String yourFavoriteColor = scanner.nextLine();
//        System.out.println(yourFavoriteColor);

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately%.2f%n", pi);

//        System.out.println("Hey, whats your favorite number?");
//        int yourFavoriteNumber = scanner.nextInt();
//        scanner.nextLine();

//        System.out.println("GIVE ME THREE WORDS!");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("The Three Words Are: %n %s %n %s %n %s %n", firstWord, secondWord, thirdWord);

//        System.out.println("Enter a sentence but make it short.");
//        String aSentence = scanner.nextLine();
//        System.out.printf("The sentence you entered is: %s%n", aSentence);

        System.out.println("What is the length and width and height of the classroom?");
        int lengthOf = Integer.parseInt(scanner.nextLine());
        int widthOf = Integer.parseInt(scanner.nextLine());
        int heightOf = Integer.parseInt(scanner.nextLine());
//        String length = scanner.nextLine();
//        String width = scanner.nextLine();
//        String height = scanner.nextLine();
//        System.out.printf("You think the length is: %s%n", length);
//        System.out.printf("You think the width is: %s%n", width);
//        System.out.printf("You think the height is: %s%n", height);
//
//        int lengthNum = Integer.parseInt(length);
//        int widthNum = Integer.parseInt(width);
//        int heightNum = Integer.parseInt(height);
//        System.out.printf("Length: %d%n", lengthNum);
//        System.out.printf("Width: %d%n", widthNum);
//        System.out.printf("Height: %d%n", heightNum);

        int perimeter = (lengthOf * 2) + (widthOf * 2);
        int area = lengthOf * widthOf;
        int volume = lengthOf * widthOf * heightOf;

        System.out.printf("The perimeter of the room in feet is: %s%n", perimeter);
        System.out.printf("The area of the room in feet is: %s%n", area);
        System.out.printf("The volume of the room in cubic feet is: %s%n", volume);
        System.out.printf("The room has a length of %d feet %n and a width of %d feet %n and a height of %d feet %n meaning the perimeter is %d feet %n and the area of the room is %d feet %n and the volume of the room is %d cubic feet.", lengthOf, widthOf, heightOf, perimeter, area, volume);


    }
}
