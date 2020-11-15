package lesson08.hw08;

import java.util.Scanner;

/**
 * Program for determining the day number from the beginning of the year.
 */
public class DaysToTheEndOfTheYear {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int year = 2018; // start with not a leap year: Year 2018 not satisfies the condition of the specification.

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
