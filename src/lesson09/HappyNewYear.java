package lesson09;

import java.time.LocalDate;

public class HappyNewYear {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today is: " + today);
        System.out.println(today);
        System.out.println(today.toString());
        System.out.println(today.atStartOfDay());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getEra());

        System.out.println();
        LocalDate lastDayOfTheYear = LocalDate.of(today.getYear(), 12, 31);

        int day2 = lastDayOfTheYear.getDayOfYear() - today.getDayOfYear();

        System.out.println(day2);
        System.out.println(lastDayOfTheYear.getDayOfYear());
    }
}
