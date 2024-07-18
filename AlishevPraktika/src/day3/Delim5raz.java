package day3;

import java.util.Scanner;

public class Delim5raz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count= 0;
        while(count<5){
            double delimoe = s.nextDouble(), delitel= s.nextDouble();
            count++;
            if(delitel == 0){
                System.out.println("Деление на 0");
                continue;}

            System.out.println(delimoe / delitel);




            }
            }
        }


