package lesson02.hw02;

public class Gcd {

    /**
     * greatest common divisor - some possible solution
     * <p>
     * The greatest common divisor (GCD), also called the greatest common factor,
     * of two numbers is the largest number that divides them both. For instance,
     * the greatest common factor of 20 and 15 is 5, since 5 divides both 20 and 15 and no larger number has this property.
     * The concept is easily extended to sets of more than two numbers: the GCD of a set of numbers is the largest number
     * dividing each of them.
     *
     * Expectation:
     *
     *
     * Test:
     * 5
     */

    public static void main(String[] args) {

        int a = 20;
        int b = 15;

        System.out.println(getGcd(a, b));
    }

    public static int getGcd(int a, int b) {

        return b == 0 ? a : getGcd(b, a % b);
    }
}
