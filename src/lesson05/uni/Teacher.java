package lesson05.uni;


public class Teacher extends Person {
    private String position;
    private String degree;

    public Teacher(String firstName, String secondName, int age, String uniID, String occupation, String constructor, String position, String degree) {
        super(firstName, secondName, age, uniID, occupation, constructor);
        this.position = position;
        this.degree = degree;
    }

    public void teach() {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }

}
