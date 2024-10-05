package Stepik;

import java.util.Scanner;

public class tablicaumnojeniya {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (i + 1) * (j + 1);
                if (j < m - 1) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(array[i][j]);

                }

            }
            System.out.println();
        }
    }
}

