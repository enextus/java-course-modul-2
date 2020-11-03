package lesson02;

public class PersonArray {

    /**
     * Person Array
     */

    public static void main(String[] args) {
        Person p1 = new Person("Anton", 23, 190);
        Person p2 = new Person("Caligula", 25, 170);
        Person p3 = new Person("Macron", 42, 180);
        Person p4 = new Person("Trump", 72, 150);
        Person p5 = new Person("Biden", 76, 130);
        Person p6 = new Person("Ivan", 18, 170);
        Person p7 = new Person("Vova", 44, 156);
        Person p8 = new Person("Merkel", 70, 199);

        Person[] arrP = new Person[]{p1, p2, p3, p4, p5, p6, p7, p8};

        // printArr( sort(arrP) );

        sort(arrP);

        System.out.println(arrP[0].name);
        System.out.println(p1.name);
        System.out.println(arrP[7].name);
    }

    public static Person[] sort(Person[] arrP) {

        Person k;
        for (int i = 0; i < arrP.length - 1; i++) {

            System.out.println(arrP[i].weight);
            System.out.println(arrP[i + 1].weight);

            if (arrP[i].weight < arrP[i + 1].weight) continue;

            k = arrP[i];

            arrP[i].weight = arrP[i + 1].weight;
            arrP[i + 1].weight = k.weight;

            sort(arrP);
        }

        return arrP;
    }

    public static void printArr(int[] arr) {

        for (int element : arr) System.out.println(element + " ");
    }
}

