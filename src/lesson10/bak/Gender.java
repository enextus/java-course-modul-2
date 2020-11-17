package lesson10.bak;

public enum Gender {
    MALE("1",1),
    FEMALE("2",2),
    DIVERSE("3",3);
    // look at file WeekDay.java, how it was done
    private String gender;
    private int code;

    @Override
    public String toString() {
        return "Gender{" +
                "gender=" + gender +
                ", code=" + code +
                '}';
    }

    private Gender(String gender, int code) {
        this.gender = gender;
        this.code = code;
    }

    public String getGender() {
        return gender;
    }
}
