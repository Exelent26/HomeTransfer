package lvl6.Arraysmethod;

import java.util.Arrays;

public class BinarniyPoisk {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] x = Arrays.copyOf(array,array.length);
        Arrays.sort(x);
        int i = Arrays.binarySearch(x,element);
        if(i<0){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
        }
}

