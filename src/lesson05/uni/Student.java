package lesson05.uni;

import java.util.Objects;

/**
 * class Student
 */
public final class Student extends Person {
    private int semester;
    private String faculty;

    private String constructor;

    private static Student[] students;

    /*    public static int insertionSortByWeight(int indexOfElementToInsert) {

        if (indexOfElementToInsert <= 1) return indexOfElementToInsert;

        indexOfElementToInsert = insertionSortByWeight(indexOfElementToInsert - 1);

        Person elementToInsertForSorting = arr[indexOfElementToInsert];
        int i = indexOfElementToInsert - 1;

        while ((i >= 0) && (arr[i].age > elementToInsertForSorting.age)) {

            // swap 2 elements
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = elementToInsertForSorting;

        return indexOfElementToInsert + 1;
    }*/

    // constructor Student 1.2.1
    public Student(String firstName, String secondName, int age, String uniID, String occupation, int semester, String faculty) {
        super(firstName, secondName, age, uniID, occupation);
        this.semester = semester;
        this.faculty = faculty;
        this.constructor = "Student 1.2.1";
    }

    public void study() {

        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }

    public void payingSemesterFees() {

        System.out.println("Оплата семестровых сборов. Paying semester fees.");
    }

    @Override
    public void eats() {
        System.out.println("В столовой все цены со скидкой! ");
    }

    @Override
    public void walks() {
        super.walks();
        System.out.println("Ходит в роли студента.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "semester=" + semester +
                ", faculty='" + faculty + '\'' +
                ", constructor='" + constructor + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", uniID='" + uniID + '\'' +
                ", occupation='" + occupation + '\'' +
                ", parentConstructor='" + parentConstructor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        // Если имя и АйДи у объектов равны, то это два экземпляра одной СУЩНОСТИ
        return
                this.firstName.equals(student.firstName)
                        && this.uniID.equals(student.uniID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }

    /*
        public boolean myEquals(Student st) {
            return this.firstName.equals(st.firstName);

           if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(subject, student.subject);
        }
    */
}
