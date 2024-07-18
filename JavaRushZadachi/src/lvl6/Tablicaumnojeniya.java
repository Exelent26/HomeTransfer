package lvl6;

public class Tablicaumnojeniya {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j <MULTIPLICATION_TABLE.length; j++) {
                if(i<=10) {
                    int a = (i+1) * (j+1);
                    MULTIPLICATION_TABLE[i][j] = a;
                    System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
                }
            }
            System.out.println();
            }

        }

    }











