package lvl8.lec2;

import java.util.Arrays;

public class ZapolnenieMassiva {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value){
        for (int i = 0; i < array.length; i++) {
            array[i]=value;

        }
    }
}