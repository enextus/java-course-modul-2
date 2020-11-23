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
        char[] arr = new char[str.length()];
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            arr[i] = str.charAt(length - i - 1);
        }
        return String.valueOf(arr);
    }
}
