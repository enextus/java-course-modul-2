package lesson10;

import java.util.Arrays;

/**
 * class Main
 */
public class Main {
    public static void main(String[] args) {
        WeekDay firstDay = WeekDay.MONDAY;
        WeekDay foursDay = WeekDay.THURSDAY;

        DayOfWeek monday = DayOfWeek.MONDAY;

        /*System.out.println(DayOfWeek.FRIDAY.ordinal());
        System.out.println(DayOfWeek.MONDAY.ordinal());
        System.out.println(Arrays.toString(DayOfWeek.values()));
        System.out.println(DayOfWeek.TUESDAY.getTitle());
        DayOfWeek.SUNDAY.sayHello();
        DayOfWeek.SUNDAY.
        System.out.println(Gender.MALE);
        System.out.println(Gender.MALE.getGender());*/

/*        Schedule schedule = new Schedule();
        schedule.wakeUp(DayOfWeek.TUESDAY);
        schedule.wakeUp(DayOfWeek.SATURDAY);
        schedule.getMenuCantine(DayOfWeek.MONDAY);
        schedule.displayWeekMenu();
        System.out.println("___________________");
        System.out.println(DayOfWeek.valueOf("MONDAY"));
        System.out.println(Arrays.toString(DayOfWeek.values()));
        monday.sayHello();
        System.out.println(firstDay.getClass());
        System.out.println();
        DayOfWeek[] dow1 = DayOfWeek.values();*/

        int a = 10;
        System.out.println(a);
        Integer b = 10;
        System.out.println(b);
        System.out.println(b.compareTo(a));
        System.out.println(b.getClass());
        Float c = 1.1f;
        System.out.println(c);
        System.out.println(Integer.valueOf(1));
        System.out.println(Integer.parseInt("10000"));
    }
}
