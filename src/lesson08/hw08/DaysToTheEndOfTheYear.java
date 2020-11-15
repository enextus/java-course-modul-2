package lesson08.hw08;

import java.util.Scanner;

/**
 * Program for determining the day number from the beginning of the year.
 */
public class DaysToTheEndOfTheYear {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the year for the leap year test: ");
        int year = sc.nextInt();

        System.out.print("Year " + year);






        System.out.print("Year " + year);

        if (checkLeapYear(year) && checkMultiplicityOfFour(year)) System.out.println(" satisfies the condition of the specification.");
        else System.out.println(" not satisfies the condition of the specification.");
    }

    private static boolean checkLeapYear(int a) {
        return ((a % 4) == 0 && a % 100 != 0) || (a % 400) == 0;
    }

    private static boolean checkMultiplicityOfFour(int a) {
        return (a % 4) == 0;
    }
}
