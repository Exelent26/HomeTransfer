package day2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ReshenoeSlojniyPrimer {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Vvedite x");
        double x = s.nextDouble();
        double y = 0;

        if(x>=5){
            y=(pow(x,2)-10)/(x+7);
            System.out.println(y);
        }else if(-3<x && x<5) {
            y = (x + 3) * (pow(x, 2) - 2);
            System.out.println(y);
        }else{y=420;
            System.out.println(y);
        }

    }}