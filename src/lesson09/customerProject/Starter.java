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
        Cocktail disco3 = new Cocktail("Диско", cola, energiser);
        System.out.println(disco1);

        System.out.println(disco1.equals(disco1));
        System.out.println(disco1.equals(disco2));
        System.out.println(disco2.equals(disco3));

        Cocktail disco11 = new Cocktail("Диско11", cola, energiser);
        Cocktail disco22 = new Cocktail("Диско", cola, energiser);
        Cocktail disco33 = new Cocktail("Диско33", cola, energiser);

        System.out.println(disco11.equals(disco11));
        System.out.println(disco1.equals(disco22));
        System.out.println(disco22.equals(disco33));
    }
}
