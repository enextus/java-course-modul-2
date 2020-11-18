package lesson11;

import java.util.Arrays;

public class Fix45 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix45(5, 4, 9, 4, 9, 5)));//  → [9, 4, 5, 4, 5, 9]
        System.out.println(Arrays.toString(fix45(1, 4, 1, 5)));// → [1, 4, 5, 1]
        System.out.println(Arrays.toString(fix45(1, 4, 1, 5, 5, 4, 1)));// → [1, 4, 5, 1, 1, 4, 5]
    }

    private static int[] fix45(int... args) {
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 4) {
                for (int j = index; j < args.length; j++) {
                    if (args[j] == 5) {
                        int temp = args[i + 1];
                        args[i + 1] = args[j];
                        args[j] = temp;
                        // index = (i + 1 > j ? i + 2 : j);
                        if (i + 1 > j) {
                            index = i + 2;
                        } else index = j;
                        break;
                    }
                }
            }
        }
        return args;
    }
}
