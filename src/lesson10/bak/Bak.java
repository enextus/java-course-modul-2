package lesson10.bak;

import java.util.Arrays;
import java.util.Objects;

/**
 * class Bak
 */
public class Bak {
    private Person person;
    private Alcohol[] alcoholDrinks;
    private double bloodAlcoholConcentration;

    public Bak(Person person, Alcohol... alcoholDrinks) {
        this.person = person;
        this.alcoholDrinks = alcoholDrinks;
    }

    @Override
    public String toString() {
        return "BAK{" +
                "person=" + person +
                ", alcoholDrinks=" + Arrays.toString(alcoholDrinks) +
                ", bloodAlcoholConcentration=" + bloodAlcoholConcentration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bak)) return false;
        Bak bak = (Bak) o;
        return Double.compare(bak.bloodAlcoholConcentration, bloodAlcoholConcentration) == 0 &&
                Objects.equals(person, bak.person) &&
                Arrays.equals(alcoholDrinks, bak.alcoholDrinks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(person, bloodAlcoholConcentration);
        result = 31 * result + Arrays.hashCode(alcoholDrinks);
        return result;
    }
}
