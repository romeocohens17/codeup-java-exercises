import java.util.Arrays;

public class ArraysExercises {
    public static PersonLecture[] addPerson(PersonLecture[] array, PersonLecture newPerson) {
        PersonLecture[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson; // Also works: people[people.length - 1]
        return people;
    }

    public static void main(String[] args) {

//Two Dimensional Arrays Example from Code up Curriculum
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for (int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        PersonLecture[] people = new PersonLecture[3];
        people[0] = new PersonLecture("Romeo");
        people[1] = new PersonLecture("Sammy");
        people[2] = new PersonLecture("Ellie");
        for (PersonLecture person : people) {
            System.out.println(person.getName());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");
        PersonLecture sophia = new PersonLecture("Skie");
        people = addPerson(people, sophia);
        for (PersonLecture person : people) {
            System.out.println(person.getName());
        }
    }
}
