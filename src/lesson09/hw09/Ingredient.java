package lesson09.hw09;

import java.util.Objects;

/**
 * class Ingredient
 * The class written about an ingredient.
 */
public class Ingredient {
    private final String name;
    private final boolean alcohol;
    private final int liquid;
    private final double perCent;

    public Ingredient(String name, int liquid) {
        this.name = name;
        this.liquid = liquid;
        this.perCent = 0.0;
        this.alcohol = false;
    }

    public Ingredient(String name, int liquid, double perCent) {
        this.name = name;
        this.liquid = liquid;
        this.perCent = perCent;
        this.alcohol = isAlcohol();
    }

    private boolean isAlcohol() {
        return perCent > 0;
    }

    private String getName() {
        return name;
    }

    public int getLiquid() {
        return liquid;
    }

    public double getPerCent() {
        return perCent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;
        Ingredient that = (Ingredient) o;
        return isAlcohol() == that.isAlcohol() &&
                getLiquid() == that.getLiquid() &&
                Double.compare(that.getPerCent(), getPerCent()) == 0 &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), isAlcohol(), getLiquid(), getPerCent());
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", alcohol=" + alcohol +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                '}';
    }
}
