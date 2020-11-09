package lesson02;

/**
 * Test Class Person
 */
public class PersonTest {
    public static void main(String[] args) {
        Person user = new Person("Edward", 94, 182);

        user.findBMI();
        user.displayInfo();
    }
}