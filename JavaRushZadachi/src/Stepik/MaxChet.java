package Stepik;
import java.util.Scanner;

public class MaxChet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

         if(x%2==0 && y%2 ==0 && z%2==0){
             System.out.println(Math.max(x,Math.max(y,z)));
         }else if(x%2==1 && y%2 ==1 && z%2==1){
             System.out.println("Чётных чисел нет");
         }else if(x%2==1 && y%2 ==0 && z%2==0){
             System.out.println(Math.max(y,z));
         }else if(x%2==0 && y%2 ==1 && z%2==0){
             System.out.println(Math.max(x,z));
         }else if(x%2==0 && y%2 ==0 && z%2==1){
             System.out.println(Math.max(x,y));
         }else if(x%2==1 && y%2 ==1 && z%2==0){
             System.out.println(z);
         }else if(x%2==0 && y%2 ==1 && z%2==1){
             System.out.println(x);
         }else if(x%2==1 && y%2 ==0 && z%2==1){
             System.out.println(y);
         }
    }

}
