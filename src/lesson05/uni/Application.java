package lesson05.uni;

/**
 * class Application
 */
public class Application {
    public static void main(String[] args) {

        Student s1 = new Student("Anton", "Baranov", 20, "M3459876", "Student",  6 , "Mathe");
        // Teacher t1 = new Teacher("Mike");
        // Worker w1 = new Worker("Глаша");


/*

        Object ob = new Teacher("Завуч");
        Teacher newteacher = (Teacher) ob;*/

/*       UniUser[] newArray = new UniUser[10];
         Student[] newcollegs = new Student[20];*/

        // System.out.println(w1);

        System.out.println(s1);
        System.out.println(s1.firstName);
        System.out.println(s1.secondName);
        System.out.println(s1.age);
        System.out.println(s1.uniID);
    }
}
