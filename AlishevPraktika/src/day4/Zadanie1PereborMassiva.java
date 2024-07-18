package day4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1PereborMassiva {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество цифр в массиве");
        int a = s.nextInt();
        int[] massiv = new int[a];
        Random random= new Random();
        int counter = 0;
        int counter1= 0;
        int counter2 = 0;
        int counter3 = 0;
        int massivsumm = 0;
        for(int i=0;i< massiv.length;i++){
            massiv[i] = random.nextInt(100);


            if(massiv[i]>8){
                counter++;
            }

            if(massiv[i]==1){
                counter1++;
            }

            if(massiv[i]%2==0){
                counter2++;
            }

            if(massiv[i]%2==1){
                counter3++;
            }
            massivsumm = massivsumm +massiv[i]; // сумма массива
        }

        System.out.println(Arrays.toString(massiv));
        System.out.println("Длина массива: "+massiv.length);
        System.out.println("Количество чисел больше 8: "+counter);
        System.out.println("Количество чисел равных 1: "+counter1);
        System.out.println("Количество четных чисел: "+counter2);
        System.out.println("Количество нечетных чисел: "+counter3);
        System.out.println("Сумма массива: "+massivsumm);




    }
}
