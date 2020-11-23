package lesson12.hw12;

/**
 * class Euclidean algorithm for greatest common divisor (GCD)
 */
public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a = 1071;
        int b = 462;
        int gcd = 0;

        System.out.println("_ gcd _ : " + euclidean(a, b, gcd));
        System.out.println();
    }

    private static int euclidean(int a, int b, int gcd) {
        if (a < b) gcd = b;
        else gcd = a;

        while (true) {
            gcd--;
            if (a % gcd == 0 && b % gcd == 0) break;
        }
        return gcd;
    }
}
