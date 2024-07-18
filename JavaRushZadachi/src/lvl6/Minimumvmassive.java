package lvl6;

import java.util.Scanner;

public class Minimumvmassive {
    public static int[] array;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(s.nextLine());
        }

        int min = array[0];
        for(int i=1; i<array.length;i++){
            if (array[i]<min) {
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
