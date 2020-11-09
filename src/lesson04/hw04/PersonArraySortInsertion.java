package lesson04.hw04;

import lesson02.Person;

/**
 * Person Array sort via recursive insertion sort
 */
public class PersonArraySortInsertion {

    public static int indexOfElementToSort;

    public static Person[] arr = new Person[9];


    public static void main(String[] args) {

        Person p1 = new Person("Anton", 90, 190);
        Person p2 = new Person("Caligula", 25, 170);
        Person p3 = new Person("Macron", 42, 180);
        Person p4 = new Person("Trump", 72, 150);
        Person p5 = new Person("Biden", 76, 130);
        Person p6 = new Person("Ivan", 18, 170);
        Person p7 = new Person("Uladzimir", 44, 156);
        Person p8 = new Person("Merkel", 41, 199);
        Person p9 = new Person("Erdogan", 55, 174);

        arr = new Person[]{p1, p2, p3, p4, p5, p6, p7, p8, p9};

        indexOfElementToSort = arr.length;

        printArr(arr);

        insertionSort(indexOfElementToSort);
    }


    public static int insertionSort(int indexOfElementToSort) {

        System.out.println("maxIndex: " + indexOfElementToSort);

        //      at this point maxIndex points to the second element in the array.
        if (indexOfElementToSort <= 1) return indexOfElementToSort;

        //      recursive call
        indexOfElementToSort = insertionSort(indexOfElementToSort - 1);

        //      save a copy of the value in variable 'key'.
        //      This value will be placed in the correct position
        //      after the "while loop below" ends.
        Person key = arr[indexOfElementToSort];

        System.out.println("Person key: " + key);

        // maximal possible index value of the array
        int i = indexOfElementToSort - 1;

        // "while loop below"
        // compare value in 'key' with all the elements in array
        // that come before the element key.
        while ((i >= 0) && (arr[i].weight > key.weight)) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = key;

        // print(arr);

        return indexOfElementToSort + 1;
    }

    private static void print(int[] arr) {

        for (int i : arr) System.out.printf("%4d", i);
        System.out.println();
    }

    public static void printArr(Person[] arr) {

        for (Person element : arr) System.out.println("Person name: " + element.name + ", weight: " + element.weight);
    }
}
