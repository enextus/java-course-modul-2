package lesson02.hw02;

/**
 * greatest common divisor - some possible solution
 * *
 * The greatest common divisor (GCD), also called the greatest common factor,
 * of two numbers is the largest number that divides them both. For instance,
 * the greatest common factor of 20 and 15 is 5, since 5 divides both 20 and 15 and no larger number has this property.
 * The concept is easily extended to sets of more than two numbers: the GCD of a set of numbers is the largest number
 * dividing each of them.
 * *
 * Expectation:
 * 5
 * *
 * Test:
 * 5
 */
public class Gcd {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        System.out.println(getGcd(a, b));
    }

    public static int getGcd(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
        System.out.println();
        return b == 0 ? a : getGcd(b, a % b);
    }
}
