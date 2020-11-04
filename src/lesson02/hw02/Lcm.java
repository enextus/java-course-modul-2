package lesson02.hw02;

public class Lcm {

    /**
     * LCM
     */

    public static void main(String[] args) {

        int a = 20;
        int b = 100;

        System.out.println(getLcm(a, b));
    }

    public static int getLcm(int a, int b) {

        return -1;
    }

    public static int getGcd(int a, int b) {

        return b == 0 ? a : getGcd(b, a % b);
    }
}
