package lesson08.hw08;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * A calculator that takes a date from the user and returns a Unix time.
 */
public class DateToEpochConverter {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Now is: " + time);

        ZoneId zoneId = ZoneId.systemDefault(); // or: ZoneId.of("Europe/Berlin");
        long epoch = time.atZone(zoneId).toEpochSecond();
        System.out.println("Epoch is: " + epoch);
    }
}
