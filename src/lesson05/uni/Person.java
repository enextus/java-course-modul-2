package lesson05.uni;

/**
 * class Person
 */
public class Person {
    public String firstName;
    public String secondName;
    public int age;
    public String uniID;
    public String occupation;
    public String parentConstructor;
    private static Person[] persons;

    // constructor Person 1.1.1
    public Person(String firstName, String secondName, int age, String uniID, String occupation) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.uniID = uniID;
        this.occupation = occupation;
        this.parentConstructor = "Person 1.1.1";
    }

    public void displayEats() {
        System.out.println("В столовой все цены со скидкой. Скидка = ");
    }

    public void displayWalks() {
        System.out.println("Ходит по кампусу.");
    }
}
