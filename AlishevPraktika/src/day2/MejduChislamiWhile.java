package day2;

import java.util.Scanner;

public class MejduChislamiWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Vvedite a");
        int a = s.nextInt();
        System.out.println("Vvedite b");
        int b = s.nextInt();

        int i = a + 1;
        while (i < b) {
            i++;
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }

        }
    }}
