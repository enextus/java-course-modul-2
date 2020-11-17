package lesson09.hw09;

import java.util.Objects;

/**
 * class Ingredient
 * The class written about a ingredient.
 */
public class Ingredient {
    private final String name;
    private boolean alcohol;
    private final int liquid;
    private int perCent;

    public Ingredient(String name, int liquid) {
        this.name = name;
        this.liquid = liquid;
    }

    public Ingredient(String name, int liquid, int perCent) {
        this.name = name;
        this.liquid = liquid;
        this.perCent = perCent;
        this.alcohol = isAlcohol();
    }

    private boolean isAlcohol() {
        if (this.perCent > 0) return true;
        return false;
    }

    private String getName() {
        return this.name;
    }

    public int getLiquid() {
        return this.liquid;
    }

    public int getPerCent() {
        return this.perCent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;
        Ingredient that = (Ingredient) o;
        return isAlcohol() == that.isAlcohol() &&
                getLiquid() == that.getLiquid() &&
                getPerCent() == that.getPerCent() &&
                getName().equals(that.getName());
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
