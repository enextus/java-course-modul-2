package lesson07.hw07;

/**
 * Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, .. 1, 2, 3 .. n}
 * (spaces added to show the grouping).
 * Note that the length of the array will be 1 + 2 + 3 .. + n, which is known to sum to exactly n*(n + 1)/2.
 * *
 * Expectation:
 * seriesUp(3) → [1, 1, 2, 1, 2, 3]
 * seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 * seriesUp(2) → [1, 1, 2]
 * *
 * Test:
 * []
 * [1]
 * [1, 1, 2]
 * [1, 1, 2, 1, 2, 3]
 * [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 * [1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5]
 */
public class SeriesUp {
    public static void main(String[] args) {
        printArr(seriesUp(0));
        printArr(seriesUp(1));
        printArr(seriesUp(2));
        printArr(seriesUp(3));
        printArr(seriesUp(4));
        printArr(seriesUp(5));
    }

    private static int[] seriesUp(int i) {
        int arrLength = i * (i + 1) / 2;
        int[] arr = new int[arrLength];

        int index = 0;
        for (int j = 1; j <= i; j++) {
            generatePattern(index, j, arr);
        }
        return arr;
    }

    private static void generatePattern(int index, int j, int[] arr) {
        for (int k = 1; k <= j; k++) {
            arr[index] = k;
            index++;
        }
    }

    private static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
