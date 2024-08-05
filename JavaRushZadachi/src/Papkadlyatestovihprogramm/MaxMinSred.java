package Papkadlyatestovihprogramm;

import java.util.Scanner;

public class MaxMinSred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("наибольшее " + a);
                System.out.println("среднее " + b);
                System.out.println("наименьшее " + c);
            } else if (c > b) {
                System.out.println("наибольшее " + a);
                System.out.println("среднее " + c);
                System.out.println("наименьшее " + b);

            }else if(b==c){
                System.out.println("max "+a);
                System.out.println("b и c одинаковые " + b);
            }
        } else if (c > b && c > a) {
            if (a > b) {
                System.out.println("наибольшее " + c);
                System.out.println("среднее " + a);
                System.out.println("наименьшее " + b);
            } else if (a < b) {
                System.out.println("наибольшее " + c);
                System.out.println("среднее " + b);
                System.out.println("наименьшее " + a);
            }else if(b==a){
                System.out.println("max "+c);
                System.out.println("b и a одинаковые " + a);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("наибольшее " + b);
                System.out.println("среднее " + a);
                System.out.println("наименьшее " + c);
            } else if (a < c) {
                System.out.println("наибольшее " + b);
                System.out.println("среднее " + c);
                System.out.println("наименьшее " + a);
            }else if(a==c){
                System.out.println("max "+a);
                System.out.println("a и c одинаковые " + a);
            }
        }else if(a==b && a==c){
            System.out.println("все числа одинаковые");

        }
    }
}
