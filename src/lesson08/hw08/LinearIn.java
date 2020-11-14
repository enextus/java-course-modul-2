package lesson08.hw08;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner,
 * return true if all of the numbers in inner appear in outer.
 * Note:
 * The best solution makes only a single "linear" pass of both arrays,
 * taking advantage of the fact that both arrays are already in sorted order.
 * *
 * Expectation:
 * linearIn([1, 2, 4, 6], [2, 4]) → true
 * linearIn([1, 2, 4, 6], [2, 3, 4]) → false
 * linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 * *
 * Test:
 */
public class LinearIn {
    public static int[] arrOuter;
    public static int[] arrInner;

    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }

    public static boolean linearIn(int[] arrOuter, int[] arrInner) {
        int result = 0;

        for (int i = 0; i < arrInner.length; i++) {
            result = recursiveBinarySearch(arrOuter, arrOuter[0], arrOuter[arrInner.length - 1], arrInner[i]);
            if (result == -1) return false;
        }
        return true;
    }

    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (arr[mid] == elementToSearch) return mid;
            if (arr[mid] > elementToSearch) return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }
        return -1;
    }
}
