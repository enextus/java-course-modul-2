package lesson07.hw07;

/**
 * Return an array that contains exactly the same numbers as the given array,
 * but rearranged so that every 3 is immediately followed by a 4.
 * <p>
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
 */
public class Fix34 {
    public static void main(String[] args) {
        printArr(fix34(1, 3, 1, 4));
        printArr(fix34(1, 3, 1, 4, 4, 3, 1));
        printArr(fix34(3, 2, 2, 4));
    }

    private static int[] fix34(int... givenArr) {
        int arrLength = givenArr.length;
        int[] productArr = givenArr;
        int startIndex = 0;
        int target = 4;

        for (int i = 0; i < arrLength; i++) {
            int donorIndex, recipientIndex;

            if (productArr[i] == 3) {
                donorIndex = i + 1;
                recipientIndex = findTargetInArray(productArr, target, startIndex);
                startIndex = recipientIndex + 1;

                int temp = productArr[recipientIndex];
                productArr[recipientIndex] = productArr[donorIndex];
                productArr[donorIndex] = temp;
            }
        }
        return productArr;
    }

    public static int findTargetInArray(int[] a, int target, int startIndex) {
        for (int i = startIndex; i < a.length; i++) if (target == a[i]) return i;
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
