package lesson05.uni;


public class Lecturer extends Person {
    private String rank;
    private String degree;

    public Lecturer(String firstName, String secondName, int age, String uniID, String occupation, String rank, String degree) {
        super(firstName, secondName, age, uniID, occupation);
        this.rank = rank;
        this.degree = degree;
    }

    public void teach() {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }

}
