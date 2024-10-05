package Stepik;

import java.util.Scanner;

public class MaxPara2chisla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split(" ");
        int[] numbers = new int[split.length];
        int tempsumm = 0;
        int minsumm = Integer.MAX_VALUE;
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = Integer.parseInt(split[j]);
        }

        for (int i = 0; i < numbers.length-2; i++) {
            tempsumm = numbers[i]+numbers[i+2];
            if (tempsumm<minsumm){
                minsumm=tempsumm;
            }else {
                minsumm = 0;
            }

        }
        System.out.println(minsumm);
    }
}
