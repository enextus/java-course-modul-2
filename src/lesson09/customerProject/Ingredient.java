package lesson09.customerProject;

import java.util.Objects;

/**
 * class Ingredient
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;
        Ingredient that = (Ingredient) o;
        return alcohol == that.alcohol &&
                liquid == that.liquid &&
                perCent == that.perCent &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, alcohol, liquid, perCent);
    }

    @Override
    public String toString() {
        return "\nIngredient{" +
                "name='" + name + '\'' +
                ", alcohol=" + alcohol +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                '}';
    }
}
