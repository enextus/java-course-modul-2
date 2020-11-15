package lesson08.hw08;

import java.util.Scanner;

/**
 * Program for determining the day number from the beginning of the year.
 * 1804 1904 2004
 * 1808 1908 2008
 * 1812 1912 2012
 */
public class DaysToTheEndOfTheYear {

    public static Scanner sc = new Scanner(System.in);
    public static int leapDay = 0;
    public static int[] numberOfMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int result;

    public static void main(String[] args) {

        System.out.println("Please enter the year: ");
        int year = sc.nextInt();

        System.out.println("Please enter the month: ");
        int month = sc.nextInt();

        System.out.println("Please enter the day: ");
        int day = sc.nextInt();

        System.out.print("Year " + year);
        System.out.print("Month " + year);
        System.out.print("Day " + year);


        if (checkLeapYear(year)) leapDay = 1;

        result = 0;

    }

    private static boolean checkLeapYear(int a) {
        return ((a % 4) == 0 && a % 100 != 0) || (a % 400) == 0;
    }

}
