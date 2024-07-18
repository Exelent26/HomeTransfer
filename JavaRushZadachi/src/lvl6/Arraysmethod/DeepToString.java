package lvl6.Arraysmethod;

import java.util.Arrays;

public class DeepToString {
    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        String a = Arrays.deepToString(strings);
        String b = Arrays.deepToString(ints);
        System.out.println(a);
        System.out.println(b);
    }
}

