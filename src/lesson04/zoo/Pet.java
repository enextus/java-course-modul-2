package lesson04.zoo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pet {

    public String name;
    public int age;
    public String breed;
    public String constructorName = "ZORRO";
    public String timeStamp;
    private String nameTwo;
    public String testName;

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
        System.out.println(this.age+this.name);
        System.out.println("2. Я двигаюсь в SuperClass.");
    }

    public String getTimestampTwo() {

        String cN = this.constructorName;
        String nN = this.name;
        String n2N = this.nameTwo;

        return "| instance Method | " + cN + " | " + nN + " | " + n2N;
    }

    protected static String getTimestamp() {

        return "protected static Pet | " + new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
    }
}
