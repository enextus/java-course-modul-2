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
    private final int liquid;
    private final double perCent;

    private static double getPerCent(Ingredient[] ingredients) {
        int sum = 0;
        for (Ingredient ing : ingredients) sum += ing.getPerCent();
        return sum;
    }

    private static int getLiquid(Ingredient[] ingredients) {
        int sum = 0;
        for (Ingredient ing : ingredients) sum += ing.getLiquid();
        return sum;
    }

    public Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
        this.liquid = getLiquid(this.ingredients);
        this.perCent = getPerCent(this.ingredients);
    }

    public String getName() {
        return name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
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
        if (!(o instanceof Cocktail)) return false;
        Cocktail cocktail = (Cocktail) o;
        return getLiquid() == cocktail.getLiquid() &&
                Double.compare(cocktail.getPerCent(), getPerCent()) == 0 &&
                Objects.equals(getName(), cocktail.getName()) &&
                Arrays.equals(getIngredients(), cocktail.getIngredients());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getLiquid(), getPerCent());
        result = 31 * result + Arrays.hashCode(getIngredients());
        return result;
    }

    @Override
    public String toString() {
        return "Cocktail {" +
                "name='" + name + '\'' +
                ", perCent=" + perCent + '}' +
                ", liquid=" + liquid + '}' +
                ", ingredients=" + Arrays.toString(ingredients)
                /* + "\n" */
                ;
    }
}
