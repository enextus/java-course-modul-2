package lesson08.hw08;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * class Human with the data of birth and calculating of full age.
 */
public class Human {
    private String name;
    private LocalDate dateOfBirth;
    private int fullAge;

    public static String dataInput(){
        System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public Human(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.fullAge = getFullAge();
    }

    private int getFullAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public static void main(String[] args) {
        Human humanOne = new Human("Adam", LocalDate.parse(Human.dataInput()));
        System.out.println("" + humanOne.name + "'s age is: " + humanOne.getFullAge() + " years.");
    }
}
