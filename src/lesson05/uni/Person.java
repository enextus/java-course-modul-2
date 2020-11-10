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

    // constructor Person 1.1.1
    public Person(String firstName, String secondName, int age, String uniID, String occupation) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.uniID = uniID;
        this.occupation = occupation;
        this.parentConstructor = "Person 1.1.1";
    }

    public void eats() {
        System.out.println("В столовой все цены со скидкой. Скидка = ");
    }

    public void walks() {
        System.out.println("Ходит по кампусу");
    }
}
