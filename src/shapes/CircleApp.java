package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean circleCreator = true;
        while (circleCreator) {
            Input in = new Input();
            System.out.println("Let's make a circle!");
            Circle circle = new Circle(in.getDouble());
            System.out.println("Let's math.");
            System.out.printf("Circumference of circle is: %f?%n", circle.getCircumference());
            System.out.printf("Area of circle is: %f?%n", circle.getArea());
            System.out.println("That was fun!");
            System.out.println("Let's make another?");
            in.clear();
            circleCreator = in.yesNo();
            if (circleCreator) {
                System.out.println("Let's GOOO!");
            } else {
                System.out.println("FINEEEE");
            }
        }
        System.out.println("BYE");
    }
}
