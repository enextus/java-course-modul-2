package lesson05.uni;

/**
 * class Application
 */
public class Application {
    public static void main(String[] args) {

        Student s1 = new Student("Anton", "Barret", 20, "M3459876", "Student", 6, "Mathe");
        Lecturer l1 = new Lecturer("Mike", "Follow", 45, "D3453466", "Lecturer", "professor", "PHD");
        Worker w1 = new Worker("Arnold", "Schwarz", 37, "W3456435676", "facility manager", "foreman", 8);

/*
        Object ob = new Teacher("Завуч");
        Teacher newteacher = (Teacher) ob;*/

/*       UniUser[] newArray = new UniUser[10];
         Student[] newcollegs = new Student[20];*/

        System.out.println(s1);
        System.out.println(s1.firstName);
        System.out.println(s1.secondName);
        System.out.println(s1.age);
        System.out.println(s1.uniID);

        System.out.println();

        System.out.println(l1);
        System.out.println(l1.firstName);
        System.out.println(l1.secondName);
        System.out.println(l1.age);
        System.out.println(l1.uniID);

        System.out.println();

        System.out.println(w1);
        System.out.println(w1.firstName);
        System.out.println(w1.secondName);
        System.out.println(w1.age);
        System.out.println(w1.uniID);
    }
}
