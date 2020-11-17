package lesson10.bak;

public class Starter {
    public static void main(String[] args) {

        Gender in = Gender.DIVERSE;

        System.out.println("in: " + in.toString());
        System.out.println(in);
        System.out.println(in.name());
        System.out.println(in);
        System.out.println(in);
        System.out.println(in.getGender());
        System.out.println(in.compareTo(in));
        System.out.println(in.equals(in));
        System.out.println(in.hashCode());
    }
}
