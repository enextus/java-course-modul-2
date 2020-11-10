package lesson05.uni;

/**
 * class Application
 */
public class Application {
    public static void main(String[] args) {

        Student s1 = new Student("Anton", "Barret", 20, "M3459876", "Student", 6, "Mathe");
        Student s2 = new Student("Boris", "Mao", 23, "M3459845", "Student", 6, "Mathe");
        Student s3 = new Student("Teo", "Stain", 31, "M3459889", "Student", 6, "Mathe");

        Lecturer l1 = new Lecturer("Mike", "Bullet", 45, "D3453466", "Lecturer", "professor", "PHD");
        Lecturer l2 = new Lecturer("Paul", "Rider", 55, "D3453434", "Lecturer", "lecturer", "PHD");
        Lecturer l3= new Lecturer("Gregor", "Swing", 49, "D3453462", "Lecturer", "lecturer", "PHD");

        Worker w1 = new Worker("Arnold", "Schwarz", 37, "W3456435629", "facility manager", "foreman", 8);
        Worker w2 = new Worker("Simon", "Gloss", 34, "W3456435649", "facility manager", "foreman", 5);
        Worker w3 = new Worker("Bill", "Trend", 47, "W3456435632", "facility manager", "foreman", 20);

/*
        Object ob = new Lecturer("Завуч");
        Lecturer newLecturer = (Lecturer) ob;*/


         Student[] students = new Student[3];
         Lecturer[] lecturers = new Lecturer[3];
         Worker[] workers = new Worker[3];

        students = new Student[]{s1, s2, s3};
        lecturers = new Lecturer[]{l1, l2, l3};
        workers = new Worker[]{w1, w2, w3};



/*
        System.out.println(s1);
        System.out.println(s1.firstName);
        System.out.println(s1.secondName);
        System.out.println(s1.age);
        System.out.println(s1.uniID);

        System.out.println();

        s1.walks();
        l1.walks();
        w1.walks();

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
        System.out.println(w1.uniID);*/
    }
}
