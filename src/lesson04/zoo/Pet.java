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

    // constructor
    public Pet() {
    }

    // constructor 0.0.2
    public Pet(String name, int age, String breed) {

        this.name = name;
        this.age = age;
        this.breed = breed;
        this.constructorName = "0.0.2 of Class Pet";
        this.timeStamp = this.getTimestamp();
    }

    void move() {

        System.out.println("Я двигаюсь в SuperClass.");
    }

    public String getTimestampTwo() {

        String cN = this.constructorName;
        String nN = this.name;
        String n2N = this.nameTwo;

        return "| public String TSTwo | " + cN + " | " + nN + " | " + n2N + " | " + new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
    }

    protected static String getTimestamp() {

        return "| protected static String getTimestamp | " + new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
    }
}
