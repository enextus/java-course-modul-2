package lesson05.uni;


public class Lecturer extends Person {
    private String rank;
    private String degree;

    private String constructor;

    // Lecturer 1.3.1
    public Lecturer(String firstName, String secondName, int age, String uniID, String occupation, String rank, String degree) {
        super(firstName, secondName, age, uniID, occupation);
        this.rank = rank;
        this.degree = degree;
        this.constructor = "Lecturer 1.3.1";
    }

    public void teach() {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }

    @Override
    public void walks() {
        super.walks();
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
