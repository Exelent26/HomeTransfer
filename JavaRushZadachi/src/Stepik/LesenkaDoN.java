package Stepik;

import java.util.Scanner;

public class LesenkaDoN {
    public static void main(String[] args) {
        //put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) { // столбцы
            int count = 1;
            for (int j = 1; j <= i; j++) { // счистаем сколько будет внутри цифр
                for (int k = 1; k <= j; k++) { // сколько цифра будет повторяться
                    if (count<=i){
                        System.out.print("i: " + i + " j: " + j + " k: " +k );}
                    if(count< i){
                        System.out.print(" ");
                    }
                    count++;
                }
            }
            if(i<n){
                System.out.println();
            }
        }


    }
}

