package lesson10.bak;

import java.time.LocalDate;

import static lesson10.bak.Gender.MALE;

/**
 * class Starter / App
 */
public class Starter {
    public static Gender male;
    public static Gender female;
    public static Gender diverse;
    public static Alcohol drink;
    public static Person person1;


    public static void main(String[] args) {
        male = Gender.MALE;
        female = Gender.FEMALE;
        diverse = Gender.DIVERSE;

        drink = new Alcohol("\"соточка\"", 40.0, 100);
        System.out.println(drink);

        person1 = new Person("Adam", 95.0, 190.0, male, LocalDate.of(1970, 12, 01));
        System.out.println(person1);

/*        System.out.println(male);
        System.out.println(male.name());
        System.out.println("Gender.valueOf(\"MALE\"): " + Gender.valueOf("MALE"));
        System.out.println(male.getGender());
        System.out.println(male.ordinal());
        System.out.println();
        System.out.println(female);
        System.out.println(female.name());
        System.out.println("Gender.valueOf(\"FEMALE\"): " + Gender.valueOf("FEMALE"));
        System.out.println(female.getGender());
        System.out.println(female.ordinal());
        System.out.println();
        System.out.println(diverse);
        System.out.println(diverse.name());
        System.out.println("Gender.valueOf(\"DIVERSE\"): " + Gender.valueOf("DIVERSE"));
        System.out.println(diverse.getGender());
        System.out.println(diverse.ordinal());
        System.out.println();*/
    }
}
