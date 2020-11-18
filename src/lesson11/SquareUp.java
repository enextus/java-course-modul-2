package lesson11;

import java.util.Arrays;

/**
 * class SquareUp
 * Expectation:
 * [0, 0, 1, 0, 2, 1, 3, 2, 1]
 * [0, 1, 2, 1]
 * [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 * Test:
 * [0, 0, 1, 0, 2, 1, 3, 2, 1]
 * [0, 1, 2, 1]
 * [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */
public class SquareUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(3)));
        System.out.println(Arrays.toString(squareUp(2)));
        System.out.println(Arrays.toString(squareUp(4)));
    }

    private static int[] squareUp(int n) {
        int[] arr = new int[n * n];
        if (n == 0) return arr;
        for (int i = n - 1; i < arr.length; i += n)
            for (int j = i; j >= i - (i / n); j--) arr[j] = i - j + 1;
        return arr;
    }
}
