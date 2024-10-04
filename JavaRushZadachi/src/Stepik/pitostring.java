package Stepik;

import java.util.Scanner;

public class pitostring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();




        if(n>=0 && n<=10){

            System.out.printf("%." + n + "f", Math.PI);
        }

    }
}
