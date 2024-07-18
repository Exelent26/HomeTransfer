package lvl6;

import java.util.Scanner;

public class MaxChislo {
    public static int[] array;
    int max = 0;
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max=0;
        array= new int[n];
        for(int i = 0; i<array.length;i++){
            array[i]=s.nextInt();}
        for(int i = 0; i<array.length;i++){
            if(max<array[i]){
            max = array[i];}}
        System.out.println(max);




}}


