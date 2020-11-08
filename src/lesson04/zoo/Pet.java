package lesson04.zoo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pet {

    public static int someCounter = 0;

    protected static String classVariable01 = "ZORRO";

    public String name;
    public int age;
    public String breed;

    public String constructorName = null;
    public String timeStamp;

    public String testName;

    public String message = "super class Pet with message";

    // constructor
    public Pet() {
    }

    // constructor 0.0.2
    public Pet(String name, int age, String breed) {

        this.name = name;
        this.age = age;
        this.breed = breed;
        this.constructorName = "0.0.2 of Class Pet";
        this.testName = "instance variable test of one instance of Class Pet";
        this.timeStamp = this.getTimestamp();
    }

    void move() {

        System.out.println("1. Я двигаюсь в SuperClass.");
        System.out.println(this.age + ", " + this.name + ", ");
        System.out.println("2. Я двигаюсь в SuperClass.");
    }

    public String getTimestampTwo() {
        System.out.print("\n");

        System.out.println(this.toString());
        System.out.println(this.name);
        System.out.print("\n");

        String cN = this.constructorName;
        String nN = this.name;

        return "| instance Method | " + cN + " | " + nN + " | ";
    }

    protected static String getTimestamp() {

        return "protected static Pet | " + new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
    }
}
