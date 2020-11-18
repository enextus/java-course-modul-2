package lesson10.bak;

public class Starter {
    public static void main(String[] args) {
        Gender in = Gender.DIVERSE;

        System.out.println(in);
        System.out.println(in.name());
        System.out.println("Gender.valueOf(\"DIVERSE\"): " + Gender.valueOf("DIVERSE"));
        System.out.println(in.getGender());
        System.out.println(in.ordinal());
    }
}
