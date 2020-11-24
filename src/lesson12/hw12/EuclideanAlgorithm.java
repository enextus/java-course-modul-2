package lesson12.hw12;

/**
 * class Euclidean algorithm for greatest common divisor (GCD)
 * Expectation:
 * 21
 * Test:
 * 21
 */
public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a = 1071;
        int b = 462;

        System.out.println("GCD = " + euclidean(a, b));
        System.out.println();
    }

    private static int euclidean(int a, int b) {
        int gcd;
        gcd = a < b ? b : a;

        while (true) {
            gcd--;
            if (a % gcd == 0 && b % gcd == 0) break;
        }
        return gcd;
    }
}
