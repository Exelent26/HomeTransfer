package Stepik;


import java.util.Scanner;

class maxcifra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int max = 0 ;

        for(int i = 0; i<x.length();i++){
            if(max<Character.getNumericValue(x.charAt(i))){
                max = Character.getNumericValue(x.charAt(i));
            }

            }
        System.out.println(max);
        }
    }