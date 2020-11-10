package lesson05.uni;

public class Worker extends Person {
    private String position;
    private int workExperience;

    private String constructor;

    //  Worker 1.4.1
    public Worker(String firstName, String secondName, int age, String uniID, String occupation, String position, int workExperience, String constructor) {
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
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", uniID='" + uniID + '\'' +
                ", occupation='" + occupation + '\'' +
                ", parentConstructor='" + parentConstructor + '\'' +
                '}';
    }

    public void works() {

        System.out.println("Работать!");
    }
}
