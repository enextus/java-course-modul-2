package lesson04.zoo;

public class Cat extends Pet {

    public String nameTwo;

    // constructor 0.1.0
    public Cat() {
    }

    // constructor 0.1.2
    public Cat(String nameTwo, String name, int age, String breed) {

        super();

        this.name = name;
        this.age = age;
        this.breed = breed;
        this.timeStamp = this.getTimestamp();
        this.nameTwo = nameTwo;
        this.constructorName = "0.1.2 of Class Cat";
    }

    void meow() {
        String t = " meow...";
        System.out.printf("%s", t);
        System.out.println();

        System.out.println("getTimestamp() " + this.getTimestamp());
        System.out.println();
        System.out.println("getTimestampTwo() " + this.getTimestampTwo());
    }

    void move() {

        System.out.println("Я двигаюсь в SubClass.");
        super.move();
        System.out.println("super.toString(): " + super.toString());

    }



















    public static void main(String[] args) {

        // CatOne
        Cat catOne = new Cat("CatOne", "Barsik",4, "Siam");

        String testStringOne = new String("testStringOne variable");

        System.out.println("catOne.name: " + catOne.name);
        System.out.println("catOne.nameTwo: " + catOne.nameTwo);
        System.out.println("catOne.age: " + catOne.age);
        System.out.print("\n");

        catOne.meow();
        catOne.move();

        System.out.print("\n");

        System.out.println("catOne.breed: " + catOne.breed);
        System.out.print("\n");

        System.out.println("catOne.constructorName: " + catOne.constructorName);
        System.out.print("\n");
        System.out.print("\n");

        System.out.println("testStringOne: " + testStringOne);

        System.out.print("\n");
        System.out.println("______________________________________________________");
        System.out.print("\n");
        // cat2
        Cat cat2 = new Cat("cat2", "Ba2rs2ik2",24, "Si2am2");

        String testString2 = new String("testString2 variable");

        System.out.println("cat2.name: " + cat2.name);
        System.out.println("cat2.nameTwo: " + cat2.nameTwo);
        System.out.println("cat2.age: " + cat2.age);
        System.out.print("\n");

        catOne.meow();
        catOne.move();

        System.out.print("\n");

        System.out.println("catOne.breed: " + cat2.breed);
        System.out.print("\n");

        System.out.println("catOne.constructorName: " + cat2.constructorName);
        System.out.print("\n");
        System.out.print("\n");

        System.out.println("testStringOne: " + testString2);
    }
}
