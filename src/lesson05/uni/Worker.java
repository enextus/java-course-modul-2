package lesson05.uni;

public class Worker extends Person {
    private String position;
    private int workExperience;

    private String constructor;

    private static Worker[] workers;

    //  Worker 1.4.1
    public Worker(String firstName, String secondName, int age, String uniID, String occupation, String position, int workExperience) {
        super(firstName, secondName, age, uniID, occupation);
        this.position = position;
        this.workExperience = workExperience;
        this.constructor = "Worker 1.4.1";
    }

    @Override
    public String toString() {
        return "Worker{" +
                "position='" + position + '\'' +
                ", workExperience=" + workExperience +
                ", constructor='" + constructor + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", uniID='" + uniID + '\'' +
                ", occupation='" + occupation + '\'' +
                ", parentConstructor='" + parentConstructor + '\'' +
                '}';
    }

    public void receivingWages() {

        System.out.println("Получение зарплаты. Receiving wages.");
    }

    @Override
    public void walks() {
        super.walks();
        System.out.println("Ходит в качестве рабочего.");
    }

    public void works() {

        System.out.println("Работать!");
    }
}
