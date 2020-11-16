package lesson08.hw08;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * class Human with the data of birth and calculating of full age.
 */
public class Human {
    private final String name;
    private final LocalDate dateOfBirth;

    private static String dataInput(){
        System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public Human(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
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
