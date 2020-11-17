package lesson09.customerProject;

/**
 * class Starter / Main / Application /
 */
public class Starter {
    public static Cocktail[] bar;

    public static int numberOfIng(Cocktail cocktail) {
        int numberOfIng = cocktail.getIngredients().length;
        return numberOfIng;
    }

    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Водка", 100, 40);
        Ingredient rom = new Ingredient("Ром", 100);
        Ingredient martini = new Ingredient("Мартини", 100);
        Ingredient cola = new Ingredient("Кола", 100);
        Ingredient energiser = new Ingredient("RedBull", 100);

        Cocktail cocktail1 = new Cocktail("Disco", cola, energiser);
        Cocktail cocktail2 = new Cocktail("Start", vodka, energiser);
        Cocktail cocktail3 = new Cocktail("007", vodka, martini);
        Cocktail cocktail4 = new Cocktail("RoMa", rom, martini);

        Cocktail cocktail5 = new Cocktail("VoCo", vodka, cola);

        System.out.println(cocktail1);
        System.out.println();

        bar = new Cocktail[]{cocktail1, cocktail2, cocktail3, cocktail4};

        System.out.println("Quantity of cocktails in the bar: " + bar.length + "\n");

        System.out.println("The cocktail \"" + cocktail1.getName() + "\" has " + numberOfIng(cocktail1) + " ingredients.\n");

        System.out.println("The proof of cocktail \"" + cocktail1.getName() + "\" is " + cocktail1.getPerCent() + "%.");
        System.out.println("The proof of cocktail \"" + cocktail2.getName() + "\" is " + cocktail2.getPerCent() + "%.");
        System.out.println("The proof of cocktail \"" + cocktail3.getName() + "\" is " + cocktail3.getPerCent() + "%.");
        System.out.println("The proof of cocktail \"" + cocktail4.getName() + "\" is " + cocktail4.getPerCent() + "%.");
        System.out.println("The proof of cocktail \"" + cocktail5.getName() + "\" is " + cocktail4.getPerCent() + "%.");


    }
}
