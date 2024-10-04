package Stepik;

import java.util.Scanner;

public class ChetniyMassiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int n = 11;
        int summ = 0;
        int[] e = new int[n];
        for (int i = 2; i <= n; i=i+2) {
            if(i%2==0){
                e[i-2] = i;
                summ += e[i-2];
                if(i==n){
                    System.out.print(e[i-2]);
                }else if(i != n){
                    System.out.print(e[i-2] + " ");
                }

            }

        }
        System.out.println();
        System.out.println(summ);

    }
}


