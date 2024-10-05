package Stepik;

import java.util.Arrays;
import java.util.Scanner;

public class SchetMassiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int a=0;
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            a = arr.length;
            count++;

        }

        System.out.println("Строк: "+count);
        System.out.println("Столбцов: "+a);


    }
}