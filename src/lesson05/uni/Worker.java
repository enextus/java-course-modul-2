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

    public String getConstructor() {
        return constructor;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public void displayWorks() {
        System.out.println("Выполнение работы.");
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

    public void displayReceivingWages() {
        System.out.println("Получение зарплаты. Receiving wages.");
    }

    @Override
    public void displayEats() {
        super.displayEats();
        System.out.println("Еда со скидкой для Workers.");
    }

    @Override
    public void displayWalks() {
        super.displayWalks();
        System.out.println("Ходит в качестве рабочего.");
    }

    public void works() {
        System.out.println("Работать!");
    }
}
