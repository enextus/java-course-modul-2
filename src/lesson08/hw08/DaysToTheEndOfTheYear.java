package lesson08.hw08;

import java.util.Scanner;

/**
 * Program for determining the day number between the date and end of the year.
 * 1804 1904 2004
 * 1808 1908 2008
 * 1812 1912 2012
 */
public class DaysToTheEndOfTheYear {

    public static Scanner sc = new Scanner(System.in);
    public static int leapDay;
    public static int[] numberOfMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        System.out.println("Please enter the year: ");
        int year = sc.nextInt();

        System.out.println("Please enter the month: ");
        int month = sc.nextInt();

        System.out.println("Please enter the day: ");
        int day = sc.nextInt();

        System.out.print("Entered date is: " + month + "." + day + "." + year + "\n");
        System.out.println("There are " + getNumberOfDays(year, month, day) + " days left until the end of this year!");
    }

    private static int getNumberOfDays(int year, int month, int day) {
        leapDay = 0;
        if (checkLeapYear(year)) leapDay = 1;
        return numberOfMonth[month - 1] + leapDay + day;
    }

    private static boolean checkLeapYear(int a) {
        return ((a % 4) == 0 && a % 100 != 0) || (a % 400) == 0;
    }
}