package lesson09.hw09;

import java.util.Arrays;
import java.util.Objects;

/**
 * class Cocktail
 * The class written about an cocktail.
 */
public class Cocktail {
    private final String name;
    private final Ingredient[] ingredients;
    private final int liquid;
    private final double perCent;

    private static int calcFullLiquid(Ingredient[] ingredients) {
        int sum = 0;
        for (Ingredient ing : ingredients) sum += ing.getLiquid();
        return sum;
    }

    private static double calcFullPerCent(Ingredient[] ingredients) {
        double sum = 0;
        for (Ingredient ing : ingredients) sum += ing.getLiquid() * ing.getPerCent() / 100.0;
        return sum;
    }

    public Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
        this.liquid = calcFullLiquid(getIngredients());
        this.perCent = calcFullPerCent(getIngredients());
    }

    public String getName() {
        return name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public int calcFullLiquid() {
        return liquid;
    }

    public double calcFullPerCent() {
        return perCent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cocktail)) return false;
        Cocktail cocktail = (Cocktail) o;
        return calcFullLiquid() == cocktail.calcFullLiquid() &&
                Double.compare(cocktail.calcFullPerCent(), calcFullPerCent()) == 0 &&
                Objects.equals(getName(), cocktail.getName()) &&
                Arrays.equals(getIngredients(), cocktail.getIngredients());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), calcFullLiquid(), calcFullPerCent());
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
