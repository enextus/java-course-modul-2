package lesson08.hw08;

/**
 * Given a non-empty array, return true if there is a place to split the array
 * so that the sum of the numbers on one side is equal
 * to the sum of the numbers on the other side.
 * Expectation:
 * canBalance([1, 1, 1, 2, 1]) → true
 * canBalance([2, 1, 1, 2, 1]) → false
 * canBalance([10, 10])        → true
 * Test:
 */
public class CompareSums {
    public static int[] arr;

    public static void main(String[] args) {
        canBalance(1, 1, 1, 2, 1);
/*        canBalance(2, 1, 1, 2, 1);
        canBalance(10, 10);*/
    }

    private static boolean canBalance(int... args) {
        arr = args;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("sumFromBegin: " + sumFromBegin(i));
            System.out.println("sumToEnd: " + sumToEnd(i));

        }

        return false;
    }

    private static int sumFromBegin(int i) {
        int sum = 0;

        for (int j = 0; j <= i; j++) {
            sum += arr[j];
        }
        return sum;
    }

    private static int sumToEnd(int i) {
        int sum = 0;

        for (int j = i+1; j <= arr.length-1; j++) {
            sum += arr[j];
        }
        return sum;
    }

}
