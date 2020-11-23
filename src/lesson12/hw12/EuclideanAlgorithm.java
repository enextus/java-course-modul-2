package lesson12.hw12;

/**
 * class Euclidean algorithm for greatest common divisor (GCD)
 */
public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a = 1071;
        int b = 462;
        int del = 0;

        if (a < b) del = b;
        else del = a;

        while (true) {
            del--;
            if (a % del == 0 && b % del == 0) {
                break;
            }
        }
        System.out.println(del);
    }
}
