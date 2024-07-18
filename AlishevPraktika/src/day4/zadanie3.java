package day4;

import java.util.Random;

/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.

 */
public class zadanie3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] matrice = new int[m][n];

        Random random = new Random();

        for(int i = 0;i<m; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = random.nextInt(51);
                System.out.print(matrice[i][j]+" "); //
            }
            System.out.println();
        }
        int summstroki = 0;
        int indexSumm = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrice[i][j];
            }
            if (sum >= summstroki) {
                summstroki = sum;
                indexSumm = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой: " +indexSumm +" " +summstroki);

    }
}
