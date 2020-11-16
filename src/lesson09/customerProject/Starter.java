package lesson09.customerProject;

/**
 * class Starter / Main / Application /
 */
public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Водка", 100);
        Ingredient rom = new Ingredient("Ром", 100);
        Ingredient martini = new Ingredient("Мартини", 100);
        Ingredient cola = new Ingredient("Кола", 100);
        Ingredient energiser = new Ingredient("RedBull", 100);

        Cocktail cocktail1 = new Cocktail("Disco", cola, energiser);
        Cocktail cocktail2 = new Cocktail("Start", vodka, energiser);

        Cocktail cocktail3 = new Cocktail("007", vodka, martini);
        Cocktail cocktail4 = new Cocktail("RoMa", rom, martini);

        System.out.println(cocktail1);
        System.out.println();
        System.out.println(cocktail2);
        System.out.println();
        System.out.println(cocktail3);
        System.out.println();
        System.out.println(cocktail4);
        System.out.println();
    }
}
