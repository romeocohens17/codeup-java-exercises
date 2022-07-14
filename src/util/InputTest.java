package util;

public class InputTest {

    public static void main (String[]args){
//        Input name = new Input();
//        System.out.println(name.getString());
//
//        Input call = new Input();
//        System.out.println(call.yesNo());

        Input minMax = new Input();
        System.out.println(minMax.getInt(1,10));

        Input favoriteNumber = new Input();
        System.out.println(favoriteNumber.getInt());

        Input doubleMinMax = new Input();
        System.out.println(doubleMinMax.getDouble(1, 100));

        Input favoriteDouble = new Input();
        System.out.println(favoriteDouble.getDouble());

    }
}
