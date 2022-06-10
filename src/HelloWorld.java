public class HelloWorld {
    public static void main(String[] args) {

        System.out.format("Hello, %s!%n", "Romeo");

        byte tinyNum = 127;
        tinyNum++;
        System.out.println(tinyNum);

        int num = 235000;
        System.out.println(num);

        long id = 1L;
        System.out.println(id);

        float floater = (float) 8.27;
//        float floater = 8.27F;
        System.out.println(floater);

        float noDecimal = 9;
        System.out.println(noDecimal);

        char charmander = '8';
        System.out.println(charmander);

        String message = "\tI really really like marshmallows.";
        System.out.println(message);

        boolean doingJavaRightNow = true;
        if (doingJavaRightNow == true) {
            System.out.println("Wow, look at me!");
        }

        int makeItAInt = (int) floater;
        System.out.println(makeItAInt);

        int myFavoriteNumber = 17;
        System.out.println(myFavoriteNumber);
        System.out.printf("My Favorite Number Is: %s%n", myFavoriteNumber);

        String myFullName = "Romeo L Cohens";
        System.out.println(myFullName);
        System.out.printf("Full Name: %s%n", myFullName);

        long myNumber = 123;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int  three = (int) o;

//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//
        int bigNum = Integer.MAX_VALUE;
        System.out.println(++bigNum);


    }
}
