import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean loveBob = true;
        while(loveBob) {
            String userResponse = scanner.nextLine();
            if (userResponse.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userResponse.equalsIgnoreCase("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            if (userResponse.equalsIgnoreCase("bye")) {
                loveBob = false;
            }
        }



    }
}
