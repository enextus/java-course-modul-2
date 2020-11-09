package lesson02;

/**
 * Person Test Class
 */
public class PersonTest {
    public static void main(String[] args) {
        Person user = new Person("Edward", 94, 182);

        user.findBMI();
        user.displayInfo();
    }
}