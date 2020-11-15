package lesson08.hash;

public class Main extends Object {

    public static int ts;
    public static int alter;

    public Main(int alter) {
        ts = 100;
        System.out.println("Obj Main was created!");
    }

    @Override
    public String toString() {
        return "Main{" +
                "alter='" + alter + '\'' +
                "ts='" + ts + '\'' +
        '}';
    }

    public static void main(String[] args) {
        Object object = new Object();

        Main testObjMain = new Main(12);

        int hCode;


        System.out.println(testObjMain.hashCode());
        System.out.println(testObjMain.getClass());
        System.out.println(testObjMain.toString());
    }
}
