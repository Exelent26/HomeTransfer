package day3;

import java.util.Scanner;

public class DelimoeDelitel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true){

            double delimoe = s.nextDouble(), delitel= s.nextDouble();

            if(delitel == 0)
                break;

                //double c = delimoe / delitel;
            System.out.println(delimoe / delitel);

            }
        }
    }
