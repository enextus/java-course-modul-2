package lesson12.reverse;

public class Reverse {
    String str;

    Reverse(String str) {
        this.str = str;
    }

    public String reverseNaive(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
