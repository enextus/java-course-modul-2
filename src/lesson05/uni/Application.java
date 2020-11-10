package lesson05.uni;

/**
 * class Application
 */
public class Application {

    public static Student[] students = new Student[3];
    public static Lecturer[] lecturers = new Lecturer[3];
    public static Worker[] workers = new Worker[3];
    public static int studentsLength;

    public static void main(String[] args) {

        Student s1 = new Student("Anton", "Barret", 39, "M3459876", "Student", 6, "Mathe");
        Student s2 = new Student("Boris", "Mao", 18, "M3459845", "Student", 6, "Mathe");
        Student s3 = new Student("Teo", "Stain", 27, "M3459889", "Student", 6, "Mathe");

        Lecturer l1 = new Lecturer("Mike", "Bullet", 45, "D3453466", "Lecturer", "professor", "PHD");
        Lecturer l2 = new Lecturer("Paul", "Rider", 55, "D3453434", "Lecturer", "lecturer", "PHD");
        Lecturer l3 = new Lecturer("Gregor", "Swing", 49, "D3453462", "Lecturer", "lecturer", "PHD");

        Worker w1 = new Worker("Arnold", "Schwarz", 37, "W3456435629", "facility manager", "foreman", 8);
        Worker w2 = new Worker("Simon", "Gloss", 34, "W3456435649", "facility manager", "foreman", 5);
        Worker w3 = new Worker("Bill", "Trend", 47, "W3456435632", "facility manager", "foreman", 20);

        students = new Student[]{s1, s2, s3};
        lecturers = new Lecturer[]{l1, l2, l3};
        workers = new Worker[]{w1, w2, w3};

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

        System.out.println();

        // Lecturers __________________________________________________
        System.out.println(l1);
        System.out.println(l1.firstName);
        System.out.println(l1.secondName);
        System.out.println(l1.age);
        System.out.println(l1.uniID);
        System.out.println(l1.getRank());
        System.out.println(l1.getDegree());
        System.out.println(l1.getConstructor());

        s1.displayEats();
        s1.displayWalks();

        s1.displayStudy();
        s1.displayFees();

        System.out.println(s1.hashCode());

        System.out.println();


        System.out.println();

        System.out.println(w1);
        System.out.println(w1.firstName);
        System.out.println(w1.secondName);
        System.out.println(w1.age);
        System.out.println(w1.uniID);

        System.out.println();



        studentsLength = students.length;
        System.out.println("studentsLength: " + studentsLength);
        printArr(students);
        insertionSortStudentsByAge(studentsLength);
        printArr(students);

        /*
        Object ob = new Lecturer("Завуч");
        Lecturer newLecturer = (Lecturer) ob;*/
    }

    public static int insertionSortStudentsByAge(int indexOfElementToInsert) {

        if (indexOfElementToInsert <= 1) return indexOfElementToInsert;

        System.out.println(" indexOfElementToInsert: " + indexOfElementToInsert);

        indexOfElementToInsert = insertionSortStudentsByAge(indexOfElementToInsert - 1); // recursive call

        Student elementToInsertForSorting = students[indexOfElementToInsert];

        int i = indexOfElementToInsert - 1;
        while ((i >= 0) && (students[i].age > ((Student) elementToInsertForSorting).age)) {
            students[i + 1] = students[i]; // overwrite element[i + 1]  with element[i]
            i--;
        }

        students[i + 1] = elementToInsertForSorting;

        return indexOfElementToInsert + 1;
    }

    public static void printArr(Student[] arr) {
        System.out.println();
        for (Student element : arr) System.out.println("Name: " + element.firstName + ", Weight: " + element.age + ".");
    }
}
