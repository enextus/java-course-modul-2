package lesson04.hw04;

/**
 * One realisation of insertion sort with recursive sort
 * <p>
 * Test:
 * 23  34 -10   0  23   0  -4   1
 * <p>
 * 23  34 -10   0  23   0  -4   1
 * -10  23  34   0  23   0  -4   1
 * -10   0  23  34  23   0  -4   1
 * -10   0  23  23  34   0  -4   1
 * -10   0   0  23  23  34  -4   1
 * -10  -4   0   0  23  23  34   1
 * -10  -4   0   0   1  23  23  34
 * <p>
 * -10  -4   0   0   1  23  23  34
 */
public class RecursiveInsertionSort {

    // static int[] arr = {23, 34, -10, 0, 23, 0, -4, 1};
    static int[] arr = {23, -10, 0, 1};

    public static void main(String[] args) {

        print(arr);
        System.out.println();

        insertionSort(arr.length);
        System.out.println();

        print(arr);
        System.out.println();
    }

    /*
      The sorting function uses only index of array, instead of copying the array data in each recursive call.
    */
    private static int insertionSort(int maxIndex) {

        System.out.println("maxIndex: " + maxIndex);

        //      at this point maxIndex points to the second element in the array.
        if (maxIndex <= 1) return maxIndex;

        //      recursive call
        maxIndex = insertionSort(maxIndex - 1);

        //      save a copy of the value in variable 'key'.
        //      This value will be placed in the correct position
        //      after the "while loop below" ends.
        int key = arr[maxIndex];

        System.out.println("key: " + key);

        // maximal possible index value of the array
        int i = maxIndex - 1;

        // "while loop below"
        // compare value in 'key' with all the elements in array
        // that come before the element key.
        while ((i >= 0) && (arr[i] > key)) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = key;

        print(arr);

        return maxIndex + 1;
    }

    private static void print(int[] arr) {

        for (int i : arr) System.out.printf("%4d", i);System.out.println();
    }
}