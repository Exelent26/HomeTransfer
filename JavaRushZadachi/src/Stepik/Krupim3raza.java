package Stepik;

import java.util.Scanner;
import java.util.Arrays;

public class Krupim3raza {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        String str = "";
        while (sc.hasNextLine()) {
            String str1 = sc.nextLine();
            str = str + str1 + " ";
            counter++;

        }

        String[] arr = str.split(" ");
        String[][] matrix = new String[counter][arr.length / counter];
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < (arr.length / counter); j++) {
                matrix[i][j] = arr[k];
                k++;
            }
        }



        for (int m = 0; m < (arr.length / counter); m++) {
            for (int n = 0; n < counter; n++) {
                if (n == (counter - 1)) System.out.print(matrix2[m][n]);
                else System.out.print(matrix2[m][n] + " ");
            }
            System.out.println();
        }

        dlina=arr.length / counter;
    }
    public void povorot(int dlina,int counter,  ){
        int k = 0;
        String[][] matrix2 = new String[dlina][counter];
        for (int x = 0; x < counter; x++) {
            for (int y = (dlina) - 1; y >= 0; y--) {
                matrix2[y][x] = arr[k - 1];
                k--;
            }
        }
    }
}

