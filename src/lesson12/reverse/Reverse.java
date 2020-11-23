package lesson12.reverse;

import lesson12.lesson12;

public class Reverse {
    String str;
    String result;

    Reverse(String str) {

        this.str = str;
    }

    public String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

