package Stepik;

import java.util.Scanner;

public class vremya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chislo = scanner.nextInt();
        int days = chislo%86400;
        int chasi = days/3600;
        int minuts = (days%3600)/60;
        int seconds = ((days%3600)%60);


        System.out.format("%02d"+":"+"%02d"+":"+"%02d",chasi,minuts,seconds);
    }
}
