package lesson09.hw09;

/**
 * class Starter / Main / Application / Run
 * The class written about a cocktail bar & Co.
 */
public class Starter {
    private static Cocktail[] bar;

    private static int numberOfIng(Cocktail cocktail) {
        int numberOfIng = cocktail.getIngredients().length;
        return numberOfIng;
    }

    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Водка", 50, 40);
        Ingredient rom = new Ingredient("Ром", 75, 80);
        Ingredient martini = new Ingredient("Мартини", 75, 14.4);
        Ingredient cola = new Ingredient("Кола", 100);
        Ingredient energiser = new Ingredient("RedBull", 100);
        Ingredient milk = new Ingredient("Milk", 250);

        Cocktail cocktail1 = new Cocktail("Disco", cola, energiser);
        Cocktail cocktail2 = new Cocktail("Start", vodka, energiser);
        Cocktail cocktail3 = new Cocktail("007", vodka, martini);
        Cocktail cocktail4 = new Cocktail("RoMa", rom, martini);
        Cocktail cocktail5 = new Cocktail("VoCo", vodka, cola);
        Cocktail cocktail6 = new Cocktail("RedMilk", milk, energiser);

        bar = new Cocktail[]{cocktail1, cocktail2, cocktail3, cocktail4, cocktail5, cocktail6};
        System.out.println("Quantity of cocktails in the bar: " + bar.length + "\n");

        System.out.println("The cocktail \"" + cocktail1.getName() + "\" has " + numberOfIng(cocktail1) + " ingredients.\n");

        System.out.println("The proof of cocktail \"" + cocktail1.getName() + "\" is " + cocktail1.getPerCent() + "%.");
        System.out.println("The proof of cocktail \"" + cocktail2.getName() + "\" is " + cocktail2.getPerCent() + "%.");
        System.out.println("The proof of cocktail \"" + cocktail3.getName() + "\" is " + cocktail3.getPerCent() + "%.");
        System.out.println("The proof of cocktail \"" + cocktail4.getName() + "\" is " + cocktail4.getPerCent() + "%.");
        System.out.println("The proof of cocktail \"" + cocktail5.getName() + "\" is " + cocktail5.getPerCent() + "%.");
        System.out.println("The proof of cocktail \"" + cocktail6.getName() + "\" is " + cocktail6.getPerCent() + "%.");
        System.out.println();
        System.out.println("The proof of cocktail \"" + cocktail1.getName() + "\" is " + cocktail1.getLiquid() + "ml.");
        System.out.println("The proof of cocktail \"" + cocktail2.getName() + "\" is " + cocktail2.getLiquid() + "ml.");
        System.out.println("The proof of cocktail \"" + cocktail3.getName() + "\" is " + cocktail3.getLiquid() + "ml.");
        System.out.println("The proof of cocktail \"" + cocktail4.getName() + "\" is " + cocktail4.getLiquid() + "ml.");
        System.out.println("The proof of cocktail \"" + cocktail5.getName() + "\" is " + cocktail5.getLiquid() + "ml.");
        System.out.println("The proof of cocktail \"" + cocktail6.getName() + "\" is " + cocktail6.getLiquid() + "ml.");

        System.out.println();

        for (Cocktail cocktail : bar) System.out.println(cocktail.toString());
    }
}
