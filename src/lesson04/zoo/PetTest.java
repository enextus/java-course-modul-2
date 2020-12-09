package lesson04.zoo;

/**
 * class PetTest
 */
public class PetTest {
    public static void main(String[] args) {

        Cat c1 = new Cat("Sema", 23,"cats");
        Cat c2 = new Cat("Tema", 22,"cats");
        Cat c3 = new Cat("Vema", 42,"cats");
        Cat c4 = new Cat("Vema", 42,"cats");

        System.out.println(c1);
        System.out.println();
        System.out.println(c1.getTimestampTwo());
        System.out.println(c1.instanceNumber);

        System.out.println(c2);
        System.out.println();
        System.out.println(c2.getTimestampTwo());
        System.out.println(c2.instanceNumber);
    }
}
