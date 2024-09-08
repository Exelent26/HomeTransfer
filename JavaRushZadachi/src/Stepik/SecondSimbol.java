package Stepik;

import java.util.Scanner;

public class SecondSimbol {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        int y = scanner.nextInt();


        if (x.length() != 3) {
            System.out.println("error");
        } else if ((Math.abs(x.charAt(1))) == y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
