package lesson12;

public class lesson12 {

    /**
     * class reverse
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
            result += str.charAt(i);
        }
        return result;
    }
}
