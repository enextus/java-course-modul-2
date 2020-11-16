package lesson09.customerProject;

import java.util.Arrays;
import java.util.Objects;

/**
 * class Cocktail
 */
public class Cocktail {
    private final String name;
    private final Ingredient[] ingredients;
    private int liquid;

    public Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cocktail)) return false;
        Cocktail cocktail = (Cocktail) o;
        return liquid == cocktail.liquid &&
                Objects.equals(name, cocktail.name) &&
                Arrays.equals(ingredients, cocktail.ingredients);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, liquid);
        result = 31 * result + Arrays.hashCode(ingredients);
        return result;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "name='" + name + '\'' +
                ", liquid=" + liquid + ", " +
                "ingredient=" + Arrays.toString(ingredients) +
                '}';
    }
}
