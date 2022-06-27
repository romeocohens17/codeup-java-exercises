public class ExceptionAndError {

    static void isEven(int num) throws Exception {
        if (num % 2 == 0) {
            System.out.println("Number is even!");
        } else {
            throw new Exception("Number was odd!");
        }
    }

    public static void main(String[] args){

        try{
            isEven(9);
            isEven(8);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
