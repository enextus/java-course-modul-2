package lesson05.uni;

import lesson02.Person;

/**
 * class Application
 */
public class Application {

    public static Student[] arrStudents = new Student[3];
    public static Lecturer[] arrLecturers = new Lecturer[3];
    public static Worker[] arrWorkers = new Worker[3];

    public static int insertionSortByAge(int indexOfElementToInsert, Object[] arr){

        arr = arr;

        if (indexOfElementToInsert <= 1) return indexOfElementToInsert;

        indexOfElementToInsert = insertionSortByAge(indexOfElementToInsert - 1);

        Person elementToInsertForSorting = arr[indexOfElementToInsert];
        int i = indexOfElementToInsert - 1;

        while ((i >= 0) && (arr[i].age > elementToInsertForSorting.age)) {

            // swap 2 elements
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = elementToInsertForSorting;

        return indexOfElementToInsert + 1;
    }

    public static void printArr(Object[] arr) {
        System.out.println();
        for (Object element : arr) System.out.println("Name: " + element.name + ", Weight: " + element.age + ".");
    }

    public static void main(String[] args) {

        Student s1 = new Student("Anton", "Barret", 20, "M3459876", "Student", 6, "Mathe");
        Student s2 = new Student("Boris", "Mao", 23, "M3459845", "Student", 6, "Mathe");
        Student s3 = new Student("Teo", "Stain", 31, "M3459889", "Student", 6, "Mathe");

        Lecturer l1 = new Lecturer("Mike", "Bullet", 45, "D3453466", "Lecturer", "professor", "PHD");
        Lecturer l2 = new Lecturer("Paul", "Rider", 55, "D3453434", "Lecturer", "lecturer", "PHD");
        Lecturer l3 = new Lecturer("Gregor", "Swing", 49, "D3453462", "Lecturer", "lecturer", "PHD");

        Worker w1 = new Worker("Arnold", "Schwarz", 37, "W3456435629", "facility manager", "foreman", 8);
        Worker w2 = new Worker("Simon", "Gloss", 34, "W3456435649", "facility manager", "foreman", 5);
        Worker w3 = new Worker("Bill", "Trend", 47, "W3456435632", "facility manager", "foreman", 20);

        arrStudents = new Student[]{s1, s2, s3};
        arrLecturers = new Lecturer[]{l1, l2, l3};
        arrWorkers = new Worker[]{w1, w2, w3};

        // print unsorted array
        printArr(arrStudents);

        // The elements of the array are sorted by weight.
        insertionSortByWeight(arrStudents.length);

        // print sorted array
        printArr(arrStudents);

    }
}
