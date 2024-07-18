package Lvl7;



import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] data = {1, 4, 5, 6, 7, 8, 11};
        int[] array = Arrays.copyOf(data, 4);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
        System.out.println();
        String noviymassiv = Arrays.toString(array);
        System.out.println(noviymassiv);

    }
}