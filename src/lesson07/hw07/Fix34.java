package lesson07.hw07;

/**
 * Return an array that contains exactly the same numbers as the given array,
 * but rearranged so that every 3 is immediately followed by a 4.
 * Do not move the 3's, but every other number may move.
 * The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3,
 * and a 3 appears in the array before any 4.
 * *
 * Expectation:
 * fix34([1, 3, 1, 4])          → [1, 3, 4, 1]
 * fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
 * fix34([3, 2, 2, 4])          → [3, 4, 2, 2]
 * *
 * Test:
 * [1, 3, 4, 1]
 * [1, 3, 4, 1, 1, 3, 4]
 * [3, 4, 2, 2]
 * [1, 3, 4, 1, 1, 3, 4, 3, 4, 2, 1, 2, 2, 1, 3, 4, 1, 2]
 * [1, 3, 4, 2, 1, 3, 4, 3, 4, 3, 4, 2, 2, 1, 3, 4, 1, 2, 3, 4, 1]
 */
public class Fix34 {
    public static void main(String[] args) {
        printArr(fix34(1, 3, 1, 4));
        printArr(fix34(1, 3, 1, 4, 4, 3, 1));
        printArr(fix34(3, 2, 2, 4));
        printArr(fix34(1, 3, 1, 4, 4, 3, 1, 3, 1, 2, 4, 2, 2, 1, 3, 2, 1, 4));
        printArr(fix34(1, 3, 2, 4, 4, 3, 1, 3, 1, 3, 4, 2, 2, 1, 3, 2, 4, 4, 3, 1, 4));
    }

    private static int[] fix34(int... arr) {
        int target = 4;
        int indexOfTarget;
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                indexOfTarget = findIndexOfTarget(arr, target, startIndex);

                int temp = arr[indexOfTarget];
                arr[indexOfTarget] = arr[i + 1];
                arr[i + 1] = temp;

                startIndex = i + 2;
            }
        }
        return arr;
    }

    public static int findIndexOfTarget(int[] arr, int target, int startIndex) {
        for (int i = startIndex; i < arr.length; i++) if (target == arr[i]) return i;
        return -1;
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
