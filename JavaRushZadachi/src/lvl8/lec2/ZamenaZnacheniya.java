package lvl8.lec2;

import java.util.Arrays;

public class ZamenaZnacheniya {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        for (int i = 0; i < array.length; i++) {
            if (i >= begin && i < end) {
                array[i] = value;
            Arrays.fill(array,begin,end,value);

            }
        }
    }}



