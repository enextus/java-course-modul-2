package lesson07.hw07;

import lesson05.uni.Student;

/**
 * Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, .. 1, 2, 3 .. n} (spaces added to show the grouping).
 * Note that the length of the array will be 1 + 2 + 3 .. + n, which is known to sum to exactly n*(n + 1)/2.
 * <p>
 * Expectation:
 * seriesUp(3) → [1, 1, 2, 1, 2, 3]
 * seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 * seriesUp(2) → [1, 1, 2]
 * Test:
 * 1 1 2
 * 1 1 2 1 2 3
 * 1 1 2 1 2 3 1 2 3 4
 */
public class SeriesUp {
    public static void main(String[] args) {

        printArr(seriesUp(2));
        System.out.println();

        printArr(seriesUp(3));
        System.out.println();

        printArr(seriesUp(4));
        System.out.println();
    }

    private static int[] seriesUp(int i) {

        int arrayLength = i * (i + 1) / 2;

        //System.out.println(arrayLength);

        int[] students = new int[arrayLength];

        int counter = 0;
        for (int j = 1; j <= i; j++) {  // kol-wo serij

            for (int k = 1; k <= j; k++) { // sama serija

                //System.out.print(k  + "(" + (counter)  + ")" + " ");
                students[counter] = k;

                counter++;
            }
            //System.out.print(" ");
        }

        return students;
    }

    private static void printArr(int[] arr) {
        for (int element : arr) System.out.print(element + " ");
    }
}
