package Stepik;

import java.util.Scanner;

public class PovorotMatriceno90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int StolbCount = 0;
        String line = "";
        while(scanner.hasNextLine()){
            String line1 = scanner.nextLine();
            line = line + line1 + " ";
            counter++;
        }
        String array[] = line.split(" ");

        String[][] matrice = new String[counter][array.length/counter];
        int k = 0;
        for(int i = 0; i< counter;i++){
            for (int j=0 ; j<(array.length/counter); j++){
                matrice[i][j] = array[k];
                k++;
            }
        }

        String[][] matrice2 = new String[array.length/counter][counter];
        for (int x=0; x<matrice.length ;x++) {
            for (int y = (array.length/counter)-1; y>=0 ;y--) {
                matrice2[y][x] = array[k-1];
                k--;
            }
        }
        for (int m = 0; m<(array.length/counter); m++) {
            for (int n = 0; n<counter; n++) {
                if (n==(counter-1)) System.out.print(matrice2[m][n]);
                else System.out.print(matrice2[m][n] + " ");
            }
            System.out.println();
        }

    }
}
