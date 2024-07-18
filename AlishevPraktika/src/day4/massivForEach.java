package day4;

import java.util.Random;
/*Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0// TODO: нужно чтобы элемент делиллся без остатка на 10
- сумму элементов массива, оканчивающихся на 0
Использовать сортировку запрещено.
*/

public class massivForEach {
    public static void main(String[] args) {
        int[] massiv = new int[100];
        Random random= new Random();
        int summ10 = 0;
        int counter = 0;
        for(int i = 0; i < massiv.length; i++){
            massiv[i] = random.nextInt(10000); // заполняем массив случайными числами

            if(massiv[i]%10==0){
                summ10=summ10+massiv[i];
            }
            if(massiv[i]%10==0){
                counter++;
            }

        }

        int min = 0;
        int max = 0;

        for(int a:massiv){
            if(a<min){
                min=a;
            }
        }
        for(int b:massiv){
            if(b>max){
                max=b;
            }
        }
        System.out.println("Наименьший элемент массива: "+min);
        System.out.println("Наибольший элемент массива: "+max);
        System.out.println("Количество элементов массива, оканчивающиеся на 0 " +counter);
        System.out.println("сумма элментов массива, оканчивающихся на 0 "+summ10); // выводим каждый элемент массива

    }
}

