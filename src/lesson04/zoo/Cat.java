package lesson04.zoo;

public class Cat extends Pet {

    public String nameTwo;
    public String message = "child class Cat";


    // constructor 0.1.0
    public Cat() {
    }

    // constructor 0.1.2
    public Cat(String name, int age, String breed) {
        super();
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.timeStamp = this.getTimestamp();
        this.nameTwo = " here is " + "nameTwo";
        this.constructorName = "this.constructorName  0.1.2 of Class Cat";

        someCounter++;
    }

    void meow() {
        String t = "1. meow...";
        System.out.printf("%s", t);
        System.out.print("\n\n");
    }
    public void getParentMessage() {
        System.out.println(super.message);
    }
    void move() {
        System.out.println("1. move");
        System.out.println("this.toString(): " + this.toString());
        System.out.println("Я двигаюсь в SubClass: " + this.name);
        System.out.print("\n");

        System.out.println("2. старт супер.move");
        super.move();

        System.out.print("\n");

        System.out.println("7. super.toString(): " + super.toString());
        System.out.println("7. super.constructorName: " + super.constructorName);
        System.out.print("7. "); this.getParentMessage();
        System.out.print("7. " + someCounter);
    }



    public static void main(String[] args) {

        // CatOne
        Cat catOne = new Cat("Barsik", 4, "Siam");
        Cat cat2 = new Cat("Kuzja", 24, "Si2am2");

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
        System.out.println("8.1. classVariable01: " + obj.classVariable01);
        System.out.println("8.2. classVariable01: " + Pet.classVariable01);
        System.out.println("8.3. classVariable01: " + classVariable01);

        System.out.println("______________________________________________________");
        System.out.print("\n");
    }

    private static void animateMethods(Cat obj) {
        obj.meow();
        obj.move();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Name: " + name + ", " +
                "someCounter: " + someCounter + ", " +
                "age: " + age + ", " +
                "breed: " + breed + ", " +
                "constructorName: " + constructorName + ", " +
                "NameTwo: " + nameTwo + ", " +
                "Message: " + message + "}";
    }
}