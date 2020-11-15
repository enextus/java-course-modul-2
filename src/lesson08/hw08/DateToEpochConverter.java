package lesson08.hw08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

/**
 * A calculator that takes a date from the user and returns a Unix time.
 */
public class DateToEpochConverter {
    public static void main(String[] args) {
        System.out.print("Please enter date in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        LocalDate date =  LocalDate.parse(input);

        LocalDateTime time =  date.atStartOfDay();
        System.out.println("Now is: " + time);

        ZoneId zoneId = ZoneId.systemDefault(); // or: ZoneId.of("Europe/Berlin");
        long epoch = time.atZone(zoneId).toEpochSecond();
        System.out.println("Epoch is: " + epoch);
    }
}
