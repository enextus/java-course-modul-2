package lesson02.hw02;

/**
 * In arithmetic and number theory, the least common multiple, lowest common multiple, or smallest common multiple
 * of two integers a and b, usually denoted by lcm(a, b), is the smallest positive integer that is divisible by both a and b.
 * Since division of integers by zero is undefined, this definition has meaning only if a and b are both different from zero.
 * However, some authors define lcm(a,0) as 0 for all a, which is the result of taking the lcm to be the least upper bound in the lattice of divisibility.
 * *
 * The lcm is the "lowest common denominator" (lcd) that can be used before fractions can be added, subtracted or compared.
 * The lcm of more than two integers is also well-defined: it is the smallest positive integer that is divisible by each of them.
 * *
 * Expectation:
 * 42
 * *
 * Test:
 * 42
 */
public class Lcm {
    public static void main(String[] args) {

        int a = 21;
        int b = 6;

        System.out.println(getLcm(a, b));
    }

    public static int getLcm(int a, int b) {

        return (a * b) / getGcd(b, a % b);
    }

    public static int getGcd(int a, int b) {

        return b == 0 ? a : getGcd(b, a % b);
    }
}
