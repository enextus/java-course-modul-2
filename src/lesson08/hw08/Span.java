package lesson08.hw08;

/**
 * Consider the leftmost and rightmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two inclusive.
 * A single value has a span of 1. Returns the largest span found in the given array.
 * (Efficiency is not a priority.)
 * <p>
 * Expectation:
 * maxSpan([1, 2, 1, 1, 3])         → 4
 * maxSpan([1, 4, 2, 1, 4, 1, 4])   → 6
 * maxSpan([1, 4, 2, 1, 4, 4, 4])   → 6
 * Test:
 * 4
 * 6
 * 6
 */
public class Span {
    public static int[] arr;

    public static void main(String[] args) {
        System.out.println(maxSpan(1, 2, 1, 1, 3));
        System.out.println(maxSpan(1, 4, 2, 1, 4, 1, 4));
        System.out.println(maxSpan(1, 4, 2, 1, 4, 4, 4));
    }

    private static int maxSpan(int... args) {
        arr = args;
        int span;
        int spanResult = 0;

        for (int i = 0; i < arr.length; i++) {

            span = findIndexOfTarget(arr[i]);

            if (spanResult < span) spanResult = span;
        }
        return spanResult;
    }

    public static int findIndexOfTarget(int target) {
        for (int i = arr.length - 1; i > 0; i--) if (target == arr[i]) return i;
        return -1;
    }
}
