package day4;

import java.util.Random;
//*Создать новый массив размера 100 и заполнить его случайными числами из
//диапазона от 0 до 10000.
//Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
//максимальной суммой выведите значение суммы и индекс первого элемента тройки.
public class Zadanie4 {
    public static void main(String[] args) {
        int[] massiv = new int[100];
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10000);
            //System.out.println(massiv[i]);
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < massiv.length - 2; i++) {
            int summ = 0;
            for (int j = i; j < i + 3; j++) {
                summ += massiv[j];
            }
            if (summ > maxSum) {
                maxSum = summ;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSumIndex);
        System.out.println(maxSum);

    }
}


