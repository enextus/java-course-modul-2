package lesson10.bak;

import java.time.LocalDate;

import static lesson10.bak.Gender.MALE;

/**
 * class Starter / App
 */
public class Starter {
    public static void main(String[] args) {
        Gender in1 = MALE;
        Gender in2 = Gender.FEMALE;
        Gender in3 = Gender.DIVERSE;

        System.out.println(in1);
        System.out.println(in1.name());
        System.out.println("Gender.valueOf(\"MALE\"): " + Gender.valueOf("MALE"));
        System.out.println(in1.getGender());
        System.out.println(in1.ordinal());
        System.out.println();
/*        System.out.println(in2);
        System.out.println(in2.name());
        System.out.println("Gender.valueOf(\"FEMALE\"): " + Gender.valueOf("FEMALE"));
        System.out.println(in2.getGender());
        System.out.println(in2.ordinal());
        System.out.println();
        System.out.println(in3);
        System.out.println(in3.name());
        System.out.println("Gender.valueOf(\"DIVERSE\"): " + Gender.valueOf("DIVERSE"));
        System.out.println(in3.getGender());
        System.out.println(in3.ordinal());
        System.out.println();*/

        Alcohol drink;
        drink = new Alcohol("\"соточка\"", 40.0, 100);
        System.out.println(drink);

        Person person1;
        person1 = new Person("Adam", 95.0, 190.0, MALE, LocalDate.of(1970,12,01));
        System.out.println(person1);


    }
}
