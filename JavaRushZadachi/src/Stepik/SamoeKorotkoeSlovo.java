package Stepik;

import java.util.Scanner;

public class SamoeKorotkoeSlovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String[] split = x.split(" ");
        int minslovo = Integer.MAX_VALUE;
        int minslovoindex = 0;
        int[] n = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            n[i]= split[i].length();
            if(n[i]<minslovo){
                minslovo = n[i];
                minslovoindex = i+1;
            }

        }
        System.out.println(minslovoindex);

    }
}

