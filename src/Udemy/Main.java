package Udemy;

public class Main {

    public static void main(String[] args) {
        //Inheritance and Polymorphism
//       Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//       Dog dog = new Dog("Yorkie", 8,20, 2, 4, 1, 20, "Long Silky");
//       dog.eat();
//       dog.walk();
//       dog.run();

       //Collections
        Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, seat is taken!");
        }



    }
}
