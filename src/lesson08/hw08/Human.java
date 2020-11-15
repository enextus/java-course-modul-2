package lesson08.hw08;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * class Human
 */
public class Human {
    public String name;
    public String dateOfBirth;
    public int fullAge;

    public Human(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.fullAge = getFullAge(LocalDate.now());
    }

    private int getFullAge(LocalDate now) {
        return 0;
    }
}


