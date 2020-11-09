package lesson05;

/**
 * class Person
 */
public class Person {
    String name;
    double salary;

    // class methods
    public static double calculateSalary(double hour, double minSalaryProHour) {
        return hour * minSalaryProHour;
    }

    public static void cry(String cryVois) {
        System.out.println(cryVois);
    }

    // constructor
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // instance methods
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void cry() {
        cry("hdfhfghgfh");
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
