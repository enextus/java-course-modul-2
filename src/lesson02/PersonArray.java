package lesson02;

public class PersonArray {

    /**
     * Person Array
     */

    public static void main(String[] args) {

        Person p1 = new Person("Anton", 90, 190);
        Person p2 = new Person("Caligula", 25, 170);
        Person p3 = new Person("Macron", 42, 180);
        Person p4 = new Person("Trump", 72, 150);
        Person p5 = new Person("Biden", 176, 130);
        Person p6 = new Person("Ivan", 18, 170);
        Person p7 = new Person("Uladzimir", 44, 156);
        Person p8 = new Person("Merkel", 41, 199);

        Person[] arrP = new Person[]{p1, p2, p3, p4, p5, p6, p7, p8};

        printArr(sort(arrP));
    }

    public static Person[] sort(Person[] arrP) {

        Person obj;
        for (int i = 0; i < arrP.length - 1; i++) {

            if (arrP[i].weight < arrP[i + 1].weight) continue;

            obj = arrP[i];

            arrP[i] = arrP[i + 1];
            arrP[i + 1] = obj;

            sort(arrP);
        }

        return arrP;
    }

    public static void printArr(Person[] arr) {

        for (Person element : arr) System.out.println(element.weight + " ");
    }
}
