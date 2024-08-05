package Papkadlyatestovihprogramm;
import java.util.Scanner;
public class MaxMinSredGpt {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число:");
            int num1 = scanner.nextInt();

            System.out.println("Введите второе число:");
            int num2 = scanner.nextInt();

            System.out.println("Введите третье число:");
            int num3 = scanner.nextInt();

            int max, mid, min;

            // Определяем наибольшее число
            if (num1 >= num2 && num1 >= num3) {
                max = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                max = num2;
            } else {
                max = num3;
            }

            // Определяем наименьшее число
            if (num1 <= num2 && num1 <= num3) {
                min = num1;
            } else if (num2 <= num1 && num2 <= num3) {
                min = num2;
            } else {
                min = num3;
            }

            // Определяем среднее число
            if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
                mid = num1;
            } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
                mid = num2;
            } else {
                mid = num3;
            }

            System.out.println("Наибольшее число: " + max);
            System.out.println("Среднее число: " + mid);
            System.out.println("Наименьшее число: " + min);
        }
    }

