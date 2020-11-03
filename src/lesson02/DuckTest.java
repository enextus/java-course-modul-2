package lesson02;

public class DuckTest {

    /**
     * Duck Test
     */

    public static void main(String[] args) {

        int a = 5;
        int[] arr = new int[10];

        Duck donaldDuck = new Duck();  // 1. Instance of Class Duck
        Duck daisyDuck = new Duck(); // 2. Instance of Class Duck

        donaldDuck.name = "Donald";
        donaldDuck.age = 25;
        donaldDuck.color = "yellow";
        donaldDuck.breed = "Disney";

        donaldDuck.files();
        donaldDuck.displayInfo();

        // String magicTest = new String("magic");
        // System.out.println(magicTest);

        daisyDuck.name = "Daisy";
        daisyDuck.age = 24;
        daisyDuck.color = "pink";
        daisyDuck.breed = "Disney";

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();

        daisyDuck.displayInfo();

    }
}
