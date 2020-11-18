package lesson10;

/**
 * enum DayOfWeek
 */
public enum DayOfWeek {
    MONDAY("mon"),
    TUESDAY("tue"),
    WEDNESDAY("wed"),
    THURSDAY("thu"),
    FRIDAY("fri"),
    SATURDAY("sat"),
    SUNDAY("sun");

    private final String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void sayHello() {
        System.out.println("Hello from enum DayOfWeek!");
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "name='" + name() + '\'' +
                ", " +
                "title='" + getTitle() + '\'' +
                ", " +
                "ordinal='" + ordinal() + '\'' +
                '}';
    }
}