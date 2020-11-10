package lesson05.uni;

public class Worker extends Person {
    private String position;


    public Worker(String firstName, String secondName, int age, String uniID, String occupation, String constructor, String position) {
        super(firstName, secondName, age, uniID, occupation, constructor);
        this.position = position;
    }

    public void works() {

        System.out.println("Работать!");
    }


}
