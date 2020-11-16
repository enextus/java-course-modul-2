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

        Cocktail disco1 = new Cocktail("Диско", cola, energiser);
        Cocktail disco2 = new Cocktail("Диско", cola, energiser);
        System.out.println(disco1);
        System.out.println();

/*        System.out.println(disco1.equals(disco1));
        System.out.println(disco1.equals(disco2));
        */

        Cocktail cocktail11 = new Cocktail("Диско", cola, energiser);
        Cocktail disco22 = new Cocktail("Диско", cola, energiser);

        System.out.println(cocktail11.hashCode());
        System.out.println(cocktail11.getName());
        cocktail11.setName("New name");
        System.out.println(cocktail11.hashCode());
        System.out.println(cocktail11.getName());
        System.out.println();
    }
}
