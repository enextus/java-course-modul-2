package lesson08.hash;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * class BlackBox
 * *
 * static inline intptr_t get_next_hash(Thread * Self, oop obj) {
 * intptr_t value = 0 ;
 * if (hashCode == 0) {
 * // This form uses an unguarded global Park-Miller RNG,
 * // so it's possible for two threads to race and generate the same RNG.
 * // On MP system we'll have lots of RW access to a global, so the
 * // mechanism induces lots of coherency traffic.
 * value = os::random() ;
 * } else
 * if (hashCode == 1) {
 * // This variation has the property of being stable (idempotent)
 * // between STW operations.  This can be useful in some of the 1-0
 * // synchronization schemes.
 * intptr_t addrBits = intptr_t(obj) >> 3 ;
 * value = addrBits ^ (addrBits >> 5) ^ GVars.stwRandom ;
 * } else
 * if (hashCode == 2) {
 * value = 1 ;            // for sensitivity testing
 * } else
 * if (hashCode == 3) {
 * value = ++GVars.hcSequence ;
 * } else
 * if (hashCode == 4) {
 * value = intptr_t(obj) ;
 * } else {
 * // Marsaglia's xor-shift scheme with thread-specific state
 * // This is probably the best overall implementation -- we'll
 * // likely make this the default in future releases.
 * *
 * unsigned t = Self->_hashStateX ;
 * t ^= (t << 11) ;
 * Self->_hashStateX = Self->_hashStateY ;
 * Self->_hashStateY = Self->_hashStateZ ;
 * Self->_hashStateZ = Self->_hashStateW ;
 * unsigned v = Self->_hashStateW ;
 * v = (v ^ (v >> 19)) ^ (t ^ (t >> 8)) ;
 * Self->_hashStateW = v ;
 * value = v ;
 * }
 */
public class BlackBox {
    private SimpleDateFormat ts;
    private Date date;
    private String dateOfCreationOfObj;

    int varA;
    int varB;
    int varC;
    int varD;
    int varE;
    int varF;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BlackBox)) return false;
        BlackBox blackBox = (BlackBox) o;
        return varA == blackBox.varA && varB == blackBox.varB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(varA, varB, varC, varD, varE, varF);
    }

    public BlackBox(int varA, int varB) {
        this.ts = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.date = new Date();
        this.dateOfCreationOfObj = this.ts.format(date);
        // System.out.println("Obj from " + this.getClass() + " was created at " + dateOfCreationOfObj + "; ");

        this.varA = varA;
        this.varB = varB;
    }

    public BlackBox(int varA, int varB, int varC, int varD, int varE, int varF) {
        this.ts = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.date = new Date();
        this.dateOfCreationOfObj = this.ts.format(date);
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
        this.varD = varD;
        this.varE = varE;
        this.varF = varF;
    }

    public static void main(String[] args) throws InterruptedException {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);
        BlackBox object3 = new BlackBox(5, 10, 67, 34, 4, 44);

        for (int i = 0; i < 3; i++) {
            BlackBox testObj = new BlackBox(354, 267,33,2,99,66);

            // TimeUnit.SECONDS.sleep(1);

            System.out.println();
            System.out.println(testObj.hashCode());
            System.out.println();

            System.out.println(object1.equals(object2));

            System.out.println(System.identityHashCode(object2));
            System.out.println(System.identityHashCode(object1));
        }
    }
}
