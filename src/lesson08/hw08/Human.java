package lesson08.hw08;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * class Human
 */
public class Human {
    public String name;
    public LocalDate dateOfBirth;
    public int fullAge;

    public Human(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.fullAge = getFullAge();
    }

    private int getFullAge() {
        LocalDate curDate = LocalDate.now();
        return Period.between(dateOfBirth, curDate).getYears();
    }

    public static void main(String[] args) {
        System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        LocalDate dob = LocalDate.parse(input);

        Human humanOne = new Human("Adam", dob);

        System.out.println("Age is:" + humanOne.getFullAge());
    }
}
