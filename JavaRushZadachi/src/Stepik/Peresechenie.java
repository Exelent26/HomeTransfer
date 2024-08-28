package Stepik;

import java.util.Scanner;

public class Peresechenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        if((a2 - b1)*(b2- a1)<=0){
            if ((a2 - b1)*(b2- a1) ==0){
                if(a2==b1){
                    System.out.println(b1);
                }
                if(b2 == a1){
                    System.out.println(b2);
                }
            }
            if(a1>=a2 && b1<=b2){
                System.out.println(a1+" "+ b1);
            }
            if(a2>a1 && b2 <b1){
                System.out.println(a2+ " " + b2);
            }
            if(a1<a2 && a2<b1 && b1 < b2){
                System.out.println(a2 + " " + b1);
            }
            if(a2 < a1 && a1 < b2 && b2 < b1){
                System.out.println(a1 + " " + b2);
            }
        }else {
            System.out.println("Пересечений нет");
        }
    }
}
