package lesson09.hw09;

import java.util.Arrays;
import java.util.Objects;

/**
 * class Cocktail
 * The class written about a cocktail.
 */
public class Cocktail {
    private final String name;
    private final Ingredient[] ingredients;
    private int liquid;
    private int perCent;

    public static int getPerCent(Ingredient[] ingredients) {
        int sum = 0;
        for (Ingredient ing : ingredients) sum += ing.getPerCent();
        return sum;
    }

    public int getLiquid() {
        int sum = 0;
        for (Ingredient ing : getIngredients()) sum += ing.getLiquid();
        return sum;
    }

    public String getName() {
        return this.name;
    }

    public Ingredient[] getIngredients() {
        return this.ingredients;
    }

    public Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
        this.perCent = getPerCent(this.ingredients);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cocktail)) return false;
        Cocktail cocktail = (Cocktail) o;
        return getLiquid() == cocktail.getLiquid() &&
                getName().equals(cocktail.getName()) &&
                Arrays.equals(getIngredients(), cocktail.getIngredients());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getLiquid());
        result = 31 * result + Arrays.hashCode(getIngredients());
        return result;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "name='" + name + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", liquid=" + liquid +
                '}';
    }
}
