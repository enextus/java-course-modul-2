package lesson02;

public class Person {

    /**
     * Class Person
     */

    String name;
    double weight;
    double height;
    double bmi;

    public Person(String username, double userWeight, double userHeight) {
        name = username;
        weight = userWeight;
        height = userHeight;
    }

    public void findBMI() {

        bmi = weight / (height * height);
    }

    public void displayInfo() {
        System.out.println("The name is: " + name);
        System.out.println("The name is: " + weight);
        System.out.println("The name is: " + height);
        System.out.println("The BMI is: " + bmi);
    }

}

class PersonTest {
    public static void main(String[] args) {
        Person user = new Person("Vasil", 94, 182);

        user.displayInfo();
    }
}
