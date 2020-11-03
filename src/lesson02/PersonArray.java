package lesson02;

public class PersonArray {

    /**
     * Person Array
     */

    public static void main(String[] args) {
        Person p1 = new Person("Anton", 90, 190);
        Person p2 = new Person("Caligula", 90, 170);
        Person p3 = new Person("Macron", 90, 180);
        Person p4 = new Person("Trump", 90, 150);
        Person p5 = new Person("Biden", 90, 130);
        Person p6 = new Person("Ivan", 90, 170);
        Person p7 = new Person("Vova", 90, 156);
        Person p8 = new Person("Merkel", 90, 199);

        Person[] arrP = new Person[]{p1, p2, p3, p4, p5, p6, p7, p8};

        int[] intArr = {16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19};

        printArr(sort(intArr));

        System.out.println(arrP[0].name);
        System.out.println(p1.name);
        System.out.println(arrP[7].name);
    }

    public static int[] sort(int[] intArr) {

        int k;
        for (int i = 0; i < intArr.length - 1; i++) {

            if (intArr[i] < intArr[i + 1]) continue;

            k = intArr[i];

            intArr[i] = intArr[i + 1];
            intArr[i + 1] = k;

            sort(intArr);
        }

        return intArr;
    }

/*    public static void main(String[] args) {
        Bubblesort bs = new Bubblesort();
        int[] arr = bs.sort();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }*/

    public static void printArr(int[] arr) {

        for (int element : arr) System.out.println(element + " ");
    }
}

