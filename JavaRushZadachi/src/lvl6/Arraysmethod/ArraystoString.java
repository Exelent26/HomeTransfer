package lvl6.Arraysmethod;

import java.util.Arrays;

public class ArraystoString {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String str = Arrays.toString(strings);
        String inter = Arrays.toString(ints);
        System.out.println(str);
        System.out.println(inter);

    }
}
