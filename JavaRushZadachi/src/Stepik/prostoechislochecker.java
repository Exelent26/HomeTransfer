package Stepik;

import java.util.Scanner;

public class prostoechislochecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i<= n; i++ ){
            if(n%i==0){
                counter++;
            }
        }
        if(counter>2){
            System.out.println(false);
        } else if (counter==2) {
            System.out.println(true);

        }else {
            System.out.println(false);
    }
}}
