package lesson04.zoo;

public class Pet {
    public String name;
    public int age;
    public String breed;

    public String nameZero = "ZORRO";

    Pet() {

    }

    Pet(String name) {
        this.name = name;
        this.age = age;
        this.breed = breed;

    }

    void move() {
        System.out.println("Я двигаюсь!!!");
    }
}
