package lesson04.zoo;

import java.util.Arrays;

public class Cat extends Pet {

    public String nameTwo;

    Cat(String name, int age, String breed, String nameTwo) {
        super();

        this.nameTwo = nameTwo;
    }

    void meow() {
        int t = 23;
        System.out.printf("%s", t);
        System.out.println();
    }

    public static void main(String[] args) {
        Cat catOne = new Cat("Barsik", 5, "Siam", "Augustus");

        String testStringOne = new String("main runtime Variable");

        System.out.println(catOne.name);
        System.out.println("nameTwo: " + catOne.nameTwo);
        System.out.println("age: " + catOne.age);
        catOne.meow();
        System.out.println("breed: " + catOne.breed);
        System.out.print("\n");
        System.out.println(testStringOne);
        System.out.println(catOne.nameZero);



        Cat catTwo = new Cat("Barsik", 5, "Siam", "Augustus");

        System.out.println(catTwo.name);
        System.out.println("nameTwo: " + catTwo.nameTwo);
        System.out.println("age: " + catTwo.age);
        catOne.meow();
        System.out.println("breed: " + catTwo.breed);
        System.out.print("\n");
        System.out.println(testStringOne);
        System.out.println(catTwo.nameZero);
        System.out.println(catOne.nameZero);
    }
}
