package Stepik;

import java.util.Arrays;
import java.util.Scanner;

public class Massiviimetodi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int k = scanner.nextInt();
        if (k < 0 || k > array.length) {
            System.out.println("Ошибка ввода");
        } else {
            System.out.println(array[k-1]);

        }
    }
}
