package lesson02;

/**
 * Class Person
 */
public class Person {
    public String name;
    public double weight;
    public double height;
    public double bmi;

    // constructor 0.0.1
    public Person() {
    }

    // constructor 1.1.1
    public Person(String username, double userWeight, double userHeight) {
        name = username;
        weight = userWeight;
        height = userHeight;
    }

    public void findBMI() {
        bmi = weight / ((height) * (height) / 10000);
    }

    public void displayInfo() {
        System.out.println("The name is: " + name);
        System.out.println("The weight is: " + weight);
        System.out.println("The height is: " + height);
        System.out.println("The BMI is: " + bmi);
    }
}
