package lvl6;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();

        }
        if (n % 2 == 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else if (n % 2 != 0) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }


        }


    }
}


