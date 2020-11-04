package lesson02.hw02;

public class Gcd {

    /**
     * greatest common divisor - some possible solution
     */

    public static void main(String[] args) {

        int a = 1;
        int b = 100;

        System.out.println(getGcd(a, b));
    }

    public static int getGcd(int a, int b) {

        return b == 0 ? a : getGcd(b, a % b);
    }
}
