package Stepik;

import java.util.Scanner;

public class BetterThenGoogle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summa = scanner.nextInt();
        int kolichestvo = scanner.nextInt();
        System.out.print(summa/kolichestvo + " ");
        System.out.print(summa%kolichestvo);
    }
}
