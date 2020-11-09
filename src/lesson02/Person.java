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
        this.name = username;
        this.weight = userWeight;
        this.height = userHeight;
    }

    public void findBMI() {
        this.bmi = this.weight / ((this.height) * (this.height) / 10000);
    }

    public void displayInfo() {
        System.out.println("The name is: " + this.name);
        System.out.println("The weight is: " + this.weight);
        System.out.println("The height is: " + this.height);
        System.out.println("The BMI is: " + this.bmi);
    }
}
