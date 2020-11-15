package lesson08.hash;

/**
 * class BlackBox
 */
public class BlackBox {
    private static int tsStatic;
    private static int alterStatic;

    private int ts;
    private int alter;

    public BlackBox(int alter) {
        this.ts = 100;
        System.out.println("Obj from class Main was created!");
        this.alter = alter;
    }

    public int getTs() {
        return this.ts;
    }

    public int getAlter() {
        return this.alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Main{" +
                "alter='" + this.alter + '\'' +
                "ts='" + this.ts + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Object object = new Object();
        Main testObjMain = new Main(12);

        BlackBox.alterStatic = 10000;
        BlackBox.tsStatic = 222;

        System.out.println();
        System.out.println("testObjMain.hashCode(): " + testObjMain.hashCode());
        System.out.println("testObjMain.getClass(): " + testObjMain.getClass());
        System.out.println();
        System.out.println(testObjMain);
        System.out.println();
        System.out.println(testObjMain.getTs());
        System.out.println(testObjMain.getAlter());
        System.out.println();
        System.out.println(BlackBox.alterStatic);
        System.out.println(BlackBox.tsStatic);
    }
}
