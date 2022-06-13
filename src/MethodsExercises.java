public class MethodsExercises {

    //Visibility Identifier(public), static keyword (method belongs class), returnType, nameOfMethod, parameters;
    //Return String concat
    public static String kudos (String name) {
        return "Great Job " + name + "!";
    }
    //Return addition
    public static Integer addition(int num1, int num2){
        return num1 + num2;
    }
    //Return subtraction
    public static Integer subtraction(int num1, int num2){
        return num1 - num2;
    }
    //Return Multiplication
    public static Integer multiplication(int num1, int num2){
        return num1 * num2;
    }
    //Return Division
    public static Integer division(int num1, int num2){
        return num1 / num2;
    }
    //Returns Modulus
    public static Integer modulus(int num1, int num2){
        return num1 % num2;
    }
    //Returns Recursion Multiplication
    public static Integer recursion(int num1, int num2){
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        else if( num2 < 0 ) {
            return - num1 + recursion(num1, num2 + 1);
        }

        else {
            return num1 + recursion(num1, num2 - 1);
        }
    }

    public static void main(String[] args) {

        //String concat
        System.out.println(kudos("Romeo"));

        //Addition
        System.out.println(addition(10, 7));

        //Subtraction
        System.out.println(subtraction(30, 13));

        //Multiplication
        System.out.println(multiplication(9, 9));

        //Division
        System.out.println(division(32, 4));

        //Modulus
        System.out.println(modulus(100, 2));

        //Recursion to Multiply
        System.out.println(recursion(10, 2));


    }
}
