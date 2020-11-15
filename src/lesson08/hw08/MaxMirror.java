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
 *
 * Das Leben schafft Ordnung, aber die Ordnung bringt kein Leben hervor.
 * Antoine de Saint-Exupéry.
 * *
 * Test:
 * 3
 * 0
 * 2
 * *
 * Collision:
 * maxMirror({1, 2, 1, 4}) → 3    -      Test: 0 !!!
 * *
 * Note:
 * i = 0, shiftIndex = 0, arr[j] = 1, arr[i + shiftIndex] = 1 -> counter wird um 1 bis zum 1 erhoeht.
 * i = 0, shiftIndex = 1, arr[j] = 2, arr[i + shiftIndex] = 2 -> counter wird um 1 bis zum 2 erhoeht.
 * i = 0, shiftIndex = 2, arr[j] = 3, arr[i + shiftIndex] = 3 -> counter wird um 1 bis zum 3 erhoeht.
 * i = 0, shiftIndex = 3, arr[j] = 9, arr[i + shiftIndex] = 8
 * i = 1, shiftIndex = 0, arr[j] = 1, arr[i + shiftIndex] = 2
 * i = 2, shiftIndex = 0, arr[j] = 1, arr[i + shiftIndex] = 3
 * i = 3, shiftIndex = 0, arr[j] = 1, arr[i + shiftIndex] = 8
 * i = 4, shiftIndex = 0, arr[j] = 1, arr[i + shiftIndex] = 9
 * i = 5, shiftIndex = 0, arr[j] = 1, arr[i + shiftIndex] = 3
 * i = 6, shiftIndex = 0, arr[j] = 1, arr[i + shiftIndex] = 2
 */
public class MaxMirror {
    public static int[] arr;

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }

    private static int maxMirror(int[] arr) {
        final int arrLen = arr.length;
        int maxElem = 0;
        if (arrLen == 0) return maxElem;

        for (int i = 0; i < arrLen; i++) {
            int shiftIndex = 0;
            for (int j = (arrLen - 1); j > i; j--) {
                // System.out.print("i = " + i  + ", arr[j] = " + arr[j] + ", shiftIndex = " + shiftIndex + ", arr[i + shiftIndex] = " + arr[i + shiftIndex]);
                if (arr[j] != arr[i + shiftIndex]) break;
                shiftIndex++;
                // System.out.println(" -> counter wird um 1 bis zum " + shiftIndex + " erhoeht.");
            }
            maxElem = Math.max(maxElem, shiftIndex);
            // System.out.println();
        }

        if (maxElem == 1) maxElem = 0;
        return maxElem;
    }
}
