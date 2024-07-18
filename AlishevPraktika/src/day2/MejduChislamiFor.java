package day2;

import java.util.Scanner;

public class MejduChislamiFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите первое число");
        int a = s.nextInt();
        System.out.println("ведите второе число");
        int b = s.nextInt();
        for(int i=a+1 ;i<b;i++){
                if(i%5==0 && i%10!=0){
                System.out.println(i);
            }
            }
        }

    }

