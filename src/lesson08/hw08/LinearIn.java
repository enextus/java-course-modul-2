package lesson08.hw08;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner,
 * return true if all of the numbers in inner appear in outer.
 * Note:
 * The best solution makes only a single "linear" pass of both arrays,
 * taking advantage of the fact that both arrays are already in sorted order.
 * <p>
 * Expectation:
 * linearIn([1, 2, 4, 6], [2, 4]) → true
 * linearIn([1, 2, 4, 6], [2, 3, 4]) → false
 * linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 * <p>
 * Test:
 */
public class LinearIn {
    public static int[] arrOuter;
    public static int[] arrInner;

    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6, 8}, new int[]{2, 4, 8}));
        // linearIn([1, 2, 4, 6], [2, 3, 4]);
        // linearIn([1, 2, 4, 4, 6], [2, 4]);
    }

    public static boolean linearIn(int[] arrOuter, int[] arrInner) {
        printArr(arrOuter);
        printArr(arrInner);

        int result = 0;

        for (int i = 0; i < arrInner.length; i++) {

            result = recursiveBinarySearch(arrOuter, arrOuter[0], arrOuter[arrInner.length - 1], arrInner[i]);
            System.out.println(result);

            if (result == -1 ) return false;
        }
        return true;
    }

    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {
        if (lastElement >= firstElement) { // break
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (arr[mid] == elementToSearch) // если средний элемент - целевой элемент, вернуть его индекс
                return mid;

            if (arr[mid] > elementToSearch) // если средний элемент больше целевого - > вызываем метод рекурсивно по суженным данным
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch); // также, вызываем метод рекурсивно по суженным данным
        }
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
