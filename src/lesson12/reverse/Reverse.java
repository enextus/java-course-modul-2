package lesson12.reverse;

/**
 * class Reverse
 */
public class Reverse {
    public String reverseNaive(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public String reverseOptimized(String str) {
        int length = str.length();
        char[] arr = new char[length];

        for (int i = length - 1; i >= 0; i--) {
            arr[i] = str.charAt(length - i - 1);
        }
        return String.valueOf(arr);
    }
}
