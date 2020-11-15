package lesson08.hw08;

/**
 * class maxMirror
 * We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
 * the same group appears in reverse order.
 * For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
 * Return the size of the largest mirror section found in the given array.
 * *
 * Expectation:
 * maxMirror({1, 2, 3, 8, 9, 3, 2, 1}) → 3
 * maxMirror({1, 2, 1, 4}) → 3
 * maxMirror({7, 1, 2, 9, 7, 2, 1}) → 2
 * *
 * Test:
 * 3
 * 0
 * 2
 * *
 * Collision:
 * maxMirror({1, 2, 1, 4}) → 3    -      Test: 0 !!!
 */
public class MaxMirror {
    public static int[] arr;

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        //System.out.println(maxMirror(new int[]{1, 2, 1, 4}));
        //System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }

    private static int maxMirror(int[] arr) {
        final int arrLen = arr.length;
        int maxElem = 0;
        if (arrLen == 0) return maxElem;

        for (int i = 0; i < arrLen; i++) {
            int shiftIndex = 0;

            for (int j = (arrLen - 1); j > i; j--) {
                System.out.print("i = " + i + ", counter = " + shiftIndex + ", arr[i + counter] = " + arr[i + shiftIndex]);
                //if (arr[i + shiftIndex] != arr[j]) break;
                if (arr[j] != arr[i + shiftIndex]) break;

                shiftIndex++;

                System.out.println(" -> counter wird um 1 bis zum " + shiftIndex + " erhöht.");
            }

            maxElem = Math.max(maxElem, shiftIndex);

            System.out.println();
        }

        if (maxElem == 1) maxElem = 0;
        return maxElem;
    }
}
