package lesson05.uni;

import java.util.Arrays;

/**
 * class Application
 * <p>
 * Test:
 * class lesson05.uni.Application
 * 1670782018
 * <p>
 * null
 * null
 * null
 * <p>
 * Student{semester=8, faculty='Theo', constructor='Student 1.2.1', firstName='Anton', secondName='Barret', age=39, uniID='M3459876', occupation='Student', parentConstructor='Person 1.1.1'}
 * Student{semester=2, faculty='Chemistry', constructor='Student 1.2.1', firstName='Boris', secondName='Mao', age=18, uniID='M3459845', occupation='Student', parentConstructor='Person 1.1.1'}
 * Student{semester=5, faculty='Mathe', constructor='Student 1.2.1', firstName='Teo', secondName='Stain', age=27, uniID='M3459889', occupation='Student', parentConstructor='Person 1.1.1'}
 * <p>
 * Student{semester=8, faculty='Theo', constructor='Student 1.2.1', firstName='Anton', secondName='Barret', age=39, uniID='M3459876', occupation='Student', parentConstructor='Person 1.1.1'}
 * Anton
 * 39
 * M3459876
 * 8
 * Theo
 * Student 1.2.1
 * В столовой все цены со скидкой!
 * Ходит по кампусу.
 * Ходит в роли студента.
 * Должен учиться, учиться и ещё раз учиться!
 * Оплата семестровых сборов. Paying semester fees.
 * 63420933
 * __________________________________________________
 * Lecturer{rank='professor', degree='PHD', constructor='Lecturer 1.3.1', firstName='Mike', secondName='Bullet', age=45, uniID='D3453466', occupation='Lecturer', parentConstructor='Person 1.1.1'}
 * Mike
 * Bullet
 * 45
 * D3453466
 * professor
 * PHD
 * Lecturer 1.3.1
 * В столовой имеется скидка.
 * Скидка на еду для преподавателей.
 * Ходит по кампусу.
 * Ходит в качестве преподавателя.
 * Должен учить!
 * Получение зарплаты. Receiving wages.
 * 63420933
 * __________________________________________________
 * Worker{position='foreman', workExperience=8, constructor='Worker 1.4.1', firstName='Arnold', secondName='Schwarz', age=37, uniID='W3456435629', occupation='facility manager', parentConstructor='Person 1.1.1'}
 * Arnold
 * Schwarz
 * 37
 * W3456435629
 * foreman
 * 8
 * Worker 1.4.1
 * Ходит по кампусу.
 * Ходит в качестве рабочего.
 * Получение зарплаты. Receiving wages.
 * В столовой имеется скидка.
 * Еда со скидкой для Workers.
 * Выполнение работы.
 * __________________________________________________
 * <p>
 * 39, Name: Anton, uniID: M3459876.
 * 18, Name: Boris, uniID: M3459845.
 * 27, Name: Teo, uniID: M3459889.
 * <p>
 * 18, Name: Boris, uniID: M3459845.
 * 27, Name: Teo, uniID: M3459889.
 * 39, Name: Anton, uniID: M3459876.
 * <p>
 * 45, Name: Mike, uniID: D3453466.
 * 55, Name: Paul, uniID: D3453434.
 * 49, Name: Gregor, uniID: D3453462.
 * <p>
 * 45, Name: Mike, uniID: D3453466.
 * 55, Name: Paul, uniID: D3453434.
 * 49, Name: Gregor, uniID: D3453462.
 * <p>
 * Unsorted list.
 * <p>
 * 37, Name: Arnold, uniID: W3456435629.
 * 24, Name: Simon, uniID: W3456435649.
 * 47, Name: Bill, uniID: W3456435632.
 * <p>
 * Sorted list.
 * <p>
 * 24, Name: Simon, uniID: W3456435649.
 * 37, Name: Arnold, uniID: W3456435629.
 * 47, Name: Bill, uniID: W3456435632.
 * <p>
 * Process finished with exit code 0
 */
public class Application {

    public static Student[] students = new Student[3];
    public static Lecturer[] lecturers = new Lecturer[3];
    public static Worker[] workers = new Worker[3];
    public static int studentsLength;
    public static int lecturersLength;
    public static int workersLength;

    @Override
    public String toString() {
        return "Application{ "
                + students.length + " | " +
                +lecturers.length + " | " +
                +workers.length +
                " }";
    }

    public static void main(String[] args) {

        // App________________________________________________________
        Application appOne = new Application();

        System.out.println(appOne.getClass());
        System.out.println(appOne.hashCode());

        System.out.println();

        System.out.println(appOne.students[0]);
        System.out.println(appOne.students[1]);
        System.out.println(appOne.students[2]);

        System.out.println();

        Student s1 = new Student("Anton", "Barret", 39, "M3459876", "Student", 8, "Theo");
        Student s2 = new Student("Boris", "Mao", 18, "M3459845", "Student", 2, "Chemistry");
        Student s3 = new Student("Teo", "Stain", 27, "M3459889", "Student", 5, "Mathe");

        Lecturer l1 = new Lecturer("Mike", "Bullet", 45, "D3453466", "Lecturer", "professor", "PHD");
        Lecturer l2 = new Lecturer("Paul", "Rider", 55, "D3453434", "Lecturer", "lecturer", "PHD");
        Lecturer l3 = new Lecturer("Gregor", "Swing", 49, "D3453462", "Lecturer", "lecturer", "PHD");

        Worker w1 = new Worker("Arnold", "Schwarz", 37, "W3456435629", "facility manager", "foreman", 8);
        Worker w2 = new Worker("Simon", "Gloss", 24, "W3456435649", "facility manager", "foreman", 5);
        Worker w3 = new Worker("Bill", "Trend", 47, "W3456435632", "facility manager", "foreman", 20);

        students = new Student[]{s1, s2, s3};
        lecturers = new Lecturer[]{l1, l2, l3};
        workers = new Worker[]{w1, w2, w3};

        System.out.println(appOne.students[0]);
        System.out.println(appOne.students[1]);
        System.out.println(appOne.students[2]);

        System.out.println();

        // Students __________________________________________________
        System.out.println(s1);
        System.out.println(s1.firstName);
        System.out.println(s1.age);
        System.out.println(s1.uniID);
        System.out.println(s1.getSemester());
        System.out.println(s1.getFaculty());
        System.out.println(s1.getConstructor());

        s1.displayEats();
        s1.displayWalks();
        s1.displayStudy();
        s1.displayFees();

        System.out.println(s1.hashCode());

        System.out.println("__________________________________________________");

        // Lecturers __________________________________________________
        System.out.println(l1);
        System.out.println(l1.firstName);
        System.out.println(l1.secondName);
        System.out.println(l1.age);
        System.out.println(l1.uniID);
        System.out.println(l1.getRank());
        System.out.println(l1.getDegree());
        System.out.println(l1.getConstructor());

        l1.displayEats();
        l1.displayWalks();
        l1.displayTeach();
        l1.displayReceivingWages();

        System.out.println(s1.hashCode());

        System.out.println("__________________________________________________");

        // Workers __________________________________________________
        System.out.println(w1);
        System.out.println(w1.firstName);
        System.out.println(w1.secondName);
        System.out.println(w1.age);
        System.out.println(w1.uniID);
        System.out.println(w1.getPosition());
        System.out.println(w1.getWorkExperience());
        System.out.println(w1.getConstructor());

        w1.displayWalks();
        w1.displayReceivingWages();
        w1.displayEats();
        w1.displayWorks();

        System.out.println("__________________________________________________");

        // Sort students__________________________________________________
        studentsLength = students.length;
        printArr(students);
        studentsSortByAge(studentsLength);
        printArr(students);

        // Sort lecturers__________________________________________________
        lecturersLength = lecturers.length;
        printArr(lecturers);
        studentsSortByAge(lecturersLength);
        printArr(lecturers);

        // Sort workers__________________________________________________
        workersLength = workers.length;
        System.out.println();
        System.out.println("Unsorted list.");
        printArr(workers);
        workersSortByAge(workersLength);
        System.out.println();
        System.out.println("Sorted list.");
        printArr(workers);
        // Object ob = new Lecturer("Meyer");
        // Lecturer newLecturer = (Lecturer) ob;

        // AddElement to students________________________________________________
        System.out.println(students.length);
        Student s4 = new Student("Humphrey", "Bogart", 27, "M34598463", "Actor", 10, "Theater");
        students = (Student[]) addElementInToArray(students, s4);
        System.out.println(students.length);
        printArr(students);
        System.out.println(students[3]);

        // AddElement to lecturers________________________________________________
        System.out.println(lecturers.length);
        Lecturer l4 = new Lecturer("Swing", "Gregor", 39, "D3453905", "Lecturer", "lecturer", "PHD");
        lecturers = (Lecturer[]) addElementInToArray(lecturers, l4);
        System.out.println(lecturers.length);
        printArr(lecturers);
        System.out.println(lecturers[3]);

        // AddElement to workers________________________________________________
        System.out.println(workers.length);
        Worker w4 = new Worker("Gloss", "Simon", 32, "W3456430427", "facility manager", "worker", 4);
        workers = (Worker[]) addElementInToArray(workers, w4);
        System.out.println(workers.length);
        printArr(workers);
        System.out.println(workers[3]);

        // delElement
        System.out.println();
        printArr(workers);
        System.out.println(delElementFromArray(workers, w4));
        printArr(workers);
    }

    public static Person[] addElementInToArray(Person[] srcArray, Person elementToAdd) {

        if (srcArray == null) return null;

        Person[] destArray = Arrays.copyOf(srcArray, srcArray.length + 1);
        destArray[destArray.length - 1] = elementToAdd;
        return destArray;
    }

    public static int delElementFromArray(Person[] srcArray, Person elementToDel) {

        if (srcArray == null) return -1;

        int indexOfElement = 0;

        for (int i = 0; i < srcArray.length; i++) {

            if (srcArray[i].equals(elementToDel)) {
                indexOfElement = i;
            } else {
                return -1;
            }
        }

        Person[] destArray = Arrays.copyOf(srcArray, srcArray.length - 1);

        System.out.println(destArray);

        for (int i = 0, j = 0; i < srcArray.length; i++) {
            if (i != indexOfElement) {
                destArray[j++] = srcArray[i];
            }
        }

        return indexOfElement;
    }

    public static int studentsSortByAge(int indexOfElementToInsert) {

        if (indexOfElementToInsert <= 1) return indexOfElementToInsert;

        indexOfElementToInsert = studentsSortByAge(indexOfElementToInsert - 1); // recursive call
        Student elementToInsert = students[indexOfElementToInsert]; // temporary hold the value of element to insert

        int i = indexOfElementToInsert - 1;
        while ((i >= 0) && (students[i].age > (elementToInsert).age)) {
            students[i + 1] = students[i]; // overwrite the element[i + 1] with the element[i]
            i--;
        }

        students[i + 1] = elementToInsert;
        return indexOfElementToInsert + 1;
    }

    public int studentsSortByAgeInstance(int indexOfElementToInsert) {

        if (indexOfElementToInsert <= 1) return indexOfElementToInsert;

        indexOfElementToInsert = studentsSortByAgeInstance(indexOfElementToInsert - 1); // recursive call
        Student elementToInsert = students[indexOfElementToInsert]; // temporary hold the value of element to insert

        int i = indexOfElementToInsert - 1;
        while ((i >= 0) && (students[i].age > (elementToInsert).age)) {
            students[i + 1] = students[i]; // overwrite the element[i + 1] with the element[i]
            i--;
        }

        students[i + 1] = elementToInsert;
        return indexOfElementToInsert + 1;
    }

    public static int lecturersSortByAge(int indexOfElementToInsert) {

        if (indexOfElementToInsert <= 1) return indexOfElementToInsert;

        indexOfElementToInsert = studentsSortByAge(indexOfElementToInsert - 1); // recursive call
        Lecturer elementToInsert = lecturers[indexOfElementToInsert]; // temporary hold the value of element to insert

        int i = indexOfElementToInsert - 1; // counter for while loop
        while ((i >= 0) && (lecturers[i].age > (elementToInsert).age)) {
            lecturers[i + 1] = lecturers[i]; // overwrite the element[i + 1] with the element[i]
            i--;
        }

        lecturers[i + 1] = elementToInsert;
        return indexOfElementToInsert + 1;
    }

    public static void printArr(Person[] arr) {
        System.out.println();
        for (Person element : arr)
            System.out.println("" + element.age + ", Name: " + element.firstName + ", uniID: " + element.uniID + ".");
    }

    public static int workersSortByAge(int indexOfElementToInsert) {

        if (indexOfElementToInsert <= 1) return indexOfElementToInsert;

        indexOfElementToInsert = workersSortByAge(indexOfElementToInsert - 1); // recursive call
        Worker elementToInsert = workers[indexOfElementToInsert]; // temporary hold the value of element to insert

        int i = indexOfElementToInsert - 1; // counter for while loop
        while ((i >= 0) && (workers[i].age > (elementToInsert).age)) {
            workers[i + 1] = workers[i]; // overwrite the element[i + 1] with the element[i]
            i--;
        }

        workers[i + 1] = elementToInsert;
        return indexOfElementToInsert + 1;
    }
}
