package Stepik;

import java.util.Arrays;
import java.util.Scanner;

public class StepikMassivSmenaelementov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split(" ");
        int[] numbers = new int[split.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }
        for (int g = 0; g < numbers.length - 2; g = g + 2) {
            int temp = numbers[g+1];
            int temp2last = numbers[numbers.length-1];
            int temp3last = numbers[numbers.length-2];

            numbers[g+1] = numbers[g + 2];
            numbers[g + 2] = temp;
            if(numbers.length%2!=0) {
                numbers[numbers.length - 1] = temp2last;
                numbers[numbers.length - 2] = temp3last;

            }
        }
        for (int j = 0; j<numbers.length; j++){
            System.out.print(numbers[j] + " ");
        }
    }
}

