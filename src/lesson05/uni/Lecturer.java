package lesson05.uni;

/**
 * class Person
 */
public class Lecturer extends Person {
    private String rank;
    private String degree;
    private String constructor;
    private static Lecturer[] lecturers;

    // Lecturer 1.3.1
    public Lecturer(String firstName, String secondName, int age, String uniID, String occupation, String rank, String degree) {
        super(firstName, secondName, age, uniID, occupation);
        this.rank = rank;
        this.degree = degree;
        this.constructor = "Lecturer 1.3.1";
    }

    public String getConstructor() {
        return constructor;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void displayTeach() {
        System.out.println("Должен учить!");
    }

    public void displayReceivingWages() {
        System.out.println("Получение зарплаты. Receiving wages.");
    }

    @Override
    public void displayEats() {
        super.displayEats();
        System.out.println("Скидка на еду для преподавателей.");
    }

    @Override
    public void displayWalks() {
        super.displayWalks();
        System.out.println("Ходит в качестве преподавателя.");
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "rank='" + rank + '\'' +
                ", degree='" + degree + '\'' +
                ", constructor='" + constructor + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", uniID='" + uniID + '\'' +
                ", occupation='" + occupation + '\'' +
                ", parentConstructor='" + parentConstructor + '\'' +
                '}';
    }
}
