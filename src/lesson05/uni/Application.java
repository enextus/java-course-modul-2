package lesson05.uni;

/**
 * class Application
 */
public class Application {

    public static Student[] students = new Student[3];
    public static Lecturer[] lecturers = new Lecturer[3];
    public static Worker[] workers = new Worker[3];
    public static int studentsLength;
    public static int lecturersLength;
    public static int workersLength;

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

        // Object ob = new Lecturer("Meyer");
        // Lecturer newLecturer = (Lecturer) ob;
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
        for (Person element : arr) System.out.println("" + element.age +  ", Name: " + element.firstName + ", Weight: " + element.uniID + ".");
    }
}
