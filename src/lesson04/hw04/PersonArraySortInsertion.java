package lesson04.hw04;

import lesson02.Person;

/**
 * Person Array sort via recursive insertion sort
 * *
 * Test:
 * Name: Anton, Weight: 90.0
 * Name: Caligula, Weight: 25.0
 * Name: Macron, Weight: 42.0
 * Name: Trump, Weight: 72.0
 * Name: Biden, Weight: 76.0
 * Name: Ivan, Weight: 18.0
 * Name: Uladzimir, Weight: 44.0
 * Name: Merkel, Weight: 41.0
 * Name: Erdogan, Weight: 55.0
 * *
 * Name: Ivan, Weight: 18.0
 * Name: Caligula, Weight: 25.0
 * Name: Merkel, Weight: 41.0
 * Name: Macron, Weight: 42.0
 * Name: Uladzimir, Weight: 44.0
 * Name: Erdogan, Weight: 55.0
 * Name: Trump, Weight: 72.0
 * Name: Biden, Weight: 76.0
 * Name: Anton, Weight: 90.0
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

        // print unsorted array
        printArr(arr);

        // The elements of the array are sorted by weight.
        insertionSort(indexOfElementToSort);

        // print sorted array
        printArr(arr);
    }

    public static int insertionSort(int indexOfElementToSort) {

        if (indexOfElementToSort <= 1) return indexOfElementToSort;

        indexOfElementToSort = insertionSort(indexOfElementToSort - 1);

        Person personToInsert = arr[indexOfElementToSort];
        int i = indexOfElementToSort - 1;

        while ((i >= 0) && (arr[i].weight > personToInsert.weight)) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = personToInsert;

        return indexOfElementToSort + 1;
    }

    public static void printArr(Person[] arr) {
        System.out.println();
        for (Person element : arr) System.out.println("Name: " + element.name + ", Weight: " + element.weight);
    }
}
