import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] matrix = new int[m][n];
        Random rand = new Random();

        // Заполняем матрицу случайными числами и сразу выводим в консоль
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(51);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}