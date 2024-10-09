package Stepik;

import java.util.Arrays;
import java.util.Scanner;

public class ZapolnenieMassivaIzStrokiAndVivod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split(" ");
        int[] numbers = new int[split.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
