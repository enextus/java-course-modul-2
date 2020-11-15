package lesson08.hash;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * class BlackBox
 */
public class BlackBox {
    private SimpleDateFormat ts;
    private Date date;
    private String dateOfCreationOfObj;

    int varA;
    int varB;

    public BlackBox(int varA, int varB) {
//        this.ts = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
//        this.date = new Date();
//        this.dateOfCreationOfObj = this.ts.format(date);
//        System.out.println("Obj from " + this.getClass() + " was created at " + dateOfCreationOfObj + "; ");

        this.varA = varA;
        this.varB = varB;
    }

    public SimpleDateFormat getTs() {
        return this.ts;
    }

    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);

        for (int i = 0; i < 5; i++) {

            BlackBox testObj = new BlackBox(354, 267);

            System.out.println();
            System.out.println(testObj.hashCode());
        }
    }
}
