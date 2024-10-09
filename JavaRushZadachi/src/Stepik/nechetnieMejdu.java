package Stepik;

import java.util.Scanner;

public class nechetnieMejdu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nachalo = scanner.nextInt();
        int konec = scanner.nextInt();

        if (nachalo<konec){
            for (int i = nachalo; i <= konec;i++){
                if(i%2==1){
                    System.out.print(i+ " ");
                }
            }
        }else if (konec<nachalo){
            for (int i = konec; i <= nachalo;i++){
                if(i%2==1){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
