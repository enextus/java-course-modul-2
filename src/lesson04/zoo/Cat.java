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
        this.constructorName = "this.constructorName  0.1.2 of Class Cat";
    }

    void meow() {
        String t = "1. meow...";
        System.out.printf("%s", t);
        System.out.print("\n\n");

        System.out.println("getTimestamp() " + this.getTimestamp());
        System.out.println();
        System.out.println("getTimestampTwo() " + this.getTimestampTwo());
    }

    void move() {
        System.out.println("1. старт move");
        System.out.println("this.toString(): " + this.toString());
        System.out.println("Я двигаюсь в SubClass: " + this.name);
        System.out.print("\n");

        System.out.println("2. старт супер.move");
        super.move();

        System.out.print("\n");

        System.out.println("super.toString(): " + super.toString());
        System.out.println("super.constructorName: " + super.constructorName);
        System.out.println("super.testName: " + super.testName);
    }


    public static void main(String[] args) {

        // CatOne
        Cat catOne = new Cat("CatOne", "Barsik", 4, "Siam");
        Cat cat2 = new Cat("cat2", "Kuzja", 24, "Si2am2");

        String testStringOne = new String("testStringOne variable");
        String testString2 = new String("testString2 variable");

        displayData(catOne);
        animateMethods(catOne);

        System.out.print("\n");

        displayData(cat2);
        animateMethods(cat2);
    }

    private static void displayData(Cat obj) {
        System.out.println("------------------------------------------------------");
        System.out.println("constructorName: " + obj.constructorName);
        System.out.println("______________________________________________________");
        System.out.println("name: " + obj.name);
        System.out.println("nameTwo: " + obj.nameTwo);
        System.out.println("age: " + obj.age);
        System.out.println("breed: " + obj.breed);
        System.out.println("______________________________________________________");
        System.out.print("\n");
    }

    private static void animateMethods(Cat obj){
        obj.meow();
        obj.move();
    }
}