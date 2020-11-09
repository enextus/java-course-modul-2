package lesson04.hw04;

/**
 * One realisation of insertion sort with recursive sort
 * *
 * Test:
 * 23  34 -10   0  23   0  -4   1
 * *
 * 23  34 -10   0  23   0  -4   1
 * -10  23  34   0  23   0  -4   1
 * -10   0  23  34  23   0  -4   1
 * -10   0  23  23  34   0  -4   1
 * -10   0   0  23  23  34  -4   1
 * -10  -4   0   0  23  23  34   1
 * -10  -4   0   0   1  23  23  34
 * *
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
    private static int insertionSort(int indexOfElementToSort) {

        //  at this point maxIndex points to the second element in the array.
        if (indexOfElementToSort <= 1) return indexOfElementToSort;

        //  recursive call
        indexOfElementToSort = insertionSort(indexOfElementToSort - 1);

        //  save a copy of the value in variable 'key'.
        //  This value will be placed in the correct position
        //  after the "while loop below" ends.

        System.out.println();
        System.out.println("5.5. indexOfElementToSort: " + indexOfElementToSort);
        System.out.println();
        System.out.println("5.6. arr[0]: " + arr[0]);
        System.out.println("5.7. arr[1]: " + arr[1]);
        System.out.println("5.8. arr[2]: " + arr[2]);
        System.out.println("5.9. arr[3]: " + arr[3]);
        System.out.println();

        // value of
        int key = arr[indexOfElementToSort];

        System.out.println("57. key: " + key);
        System.out.println("key: " + key);
        System.out.println();

        //  maximal possible index value of the array
        int i = indexOfElementToSort - 1;

        //  "while loop below"
        //  compare value in 'key' with all the elements in array
        //  that come before the element key.
        while ((i >= 0) && (arr[i] > key)) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = key;

        print(arr);

        return indexOfElementToSort + 1;
    }

    private static void print(int[] arr) {

        for (int i : arr) System.out.printf("%4d", i);
        System.out.println();
    }
}
