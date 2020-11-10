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

    public String getParentConstructor() {
        return parentConstructor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniID() {
        return uniID;
    }

    public void setUniID(String uniID) {
        this.uniID = uniID;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void displayEats() {
        System.out.println("В столовой имеется скидка.");
    }

    public void displayWalks() {
        System.out.println("Ходит по кампусу.");
    }
}
