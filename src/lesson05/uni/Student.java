package lesson05.uni;

import java.util.Objects;

/**
 * class Student
 */
public final class Student extends Person {
    public int semester;
    public String faculty;

    public Student(String firstName, String secondName, int age, String uniID, String occupation, int semester, String faculty) {
        super(firstName, secondName, age, uniID, occupation);
        this.semester = semester;
        this.faculty = faculty;
    }

    public void study() {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "semester=" + semester +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public void eats() {
        System.out.println("В столовой все цены со скидкой! ");
    }


    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        // Если имя и АйДи у объектов равны, то это два экземпляра одной СУЩНОСТИ
        return
                this.firstName.equals(student.firstName)
                        && this.uniID.equals(student.uniID);
    }

    public boolean myEquals(Student st) {
        return this.firstName.equals(st.firstName);

/*        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(subject, student.subject);*/
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }
}
