package Lvl7.lectciya3ResultatFunkcii;

import java.util.Arrays;

public class signIn {

    public static void fill (int[] data, int from, int to, int value)
    {


        if (from < 0 || to > data.length){
            return;}

        for (int i = from; i < to; i++) {
            data[i] = value;
        }
    }

    public static void main (String[]args)
    {
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        fill(months, 2, 10, 8);
        // Выводим значения массива с помощью deepToString()
        System.out.println(Arrays.deepToString(new int[][]{months}));
    }
}
