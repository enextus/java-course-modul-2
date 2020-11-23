package lesson12.reverse;

import java.util.Arrays;

/**
 * class Reverse
 */
public class Reverse {
    String str;

    @Override
    public String toString() {
        return "Reverse{" +
                "str='" + str + '\'' +
                '}';
    }

    public Reverse() {
    }

    public String reverseNaive(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public String reverseOptimized(String str) {
        String result = "";
        System.out.println("str.length(): " + str.length());

        char[] arr = new char[str.length()];
        System.out.println(Arrays.toString(arr));

        int length = str.length();
        System.out.println("length: " + length);

        for (int i = length - 1; i >= 0; i--) {

            arr[i] = str.charAt(length - i - 1);
        }

        System.out.println(Arrays.toString(arr));

        return "";
    }
}
