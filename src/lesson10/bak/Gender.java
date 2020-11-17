package lesson10.bak;

public enum Gender {
    MALE("Gender MALE", 100),
    FEMALE("Gender FEMALE", 200),
    DIVERSE("Gender diversity is equitable or fair representation of people of different genders.", 300);
    private final String gender;
    private final int genID;

    @Override
    public String toString() {
        return "Gender{" +
                "gender=" + gender +
                ", genderID=" + genID +
                '}';
    }

    Gender(String gender, int genID) {
        this.gender = gender;
        this.genID = genID;
    }

    public String getGender() {
        return gender;
    }
}