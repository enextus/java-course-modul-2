public class CrudArray {

    /**
     * Polymorphism
     */

    public static void main(String[] args) {

        int[] arr1 = new int[]{5, 3, 1, 9, 7};

        printArr(arr1);

        double[] arr2 = new double[]{3.14, 5.34, 10.4, 15.8, 19.6};

        printArrDouble(arr2);
    }

    private static void printArr(int[] arr) {
        for (int digit : arr) {
            System.out.print(digit + " ");
        }

        System.out.println();
    }


    private static void printArrDouble(double[] arr) {
        for (double digit : arr) {
            System.out.print(digit + " ");
        }

        System.out.println();
    }
}
