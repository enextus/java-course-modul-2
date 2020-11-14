package lesson08.hw08;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner,
 * return true if all of the numbers in inner appear in outer.
 * The best solution makes only a single "linear" pass of both arrays,
 * taking advantage of the fact that both arrays are already in sorted order.
 *
 * Expectation:
 * linearIn([1, 2, 4, 6], [2, 4]) → true
 * linearIn([1, 2, 4, 6], [2, 3, 4]) → false
 * linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 *
 * Test:
 *
 */
public class LinearIn {
    public static int [] arrOuter;
    public static int [] arrInner;

    public static void main(String[] args) {
        linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4});
        // linearIn([1, 2, 4, 6], [2, 3, 4]);
        // linearIn([1, 2, 4, 4, 6], [2, 4]);
    }

    public static void linearIn(int[] arrOuter, int[] arrInner){
        printArr(arrOuter);
        printArr(arrInner);
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
