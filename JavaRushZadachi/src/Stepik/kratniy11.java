package Stepik;

import java.util.Scanner;

public class kratniy11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int count = 0;
        int summ = 0;

        while ((n = scanner.nextInt()) % 11 == 0) {
            if (n % 11 == 0) {

                count++;
                System.out.println(count);
            if (n % 3 == 0) {
                summ += n;
                System.out.println(summ);
            }
            }else if (n % 11 != 0) {
                break;
            }

            }
        System.out.println(summ);
        System.out.println(count);
        }
    }
