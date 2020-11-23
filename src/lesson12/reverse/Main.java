package lesson12.reverse;

/**
 * class Main
 */
public class Main {
    public static void main(String[] args) {

        Reverse resultStr = new Reverse();
        System.out.println(resultStr.reverseNaive("Hello"));
        System.out.println(resultStr.reverseOptimized("Hello"));
    }
}
