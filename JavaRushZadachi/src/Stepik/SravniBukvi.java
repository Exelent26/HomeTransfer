package Stepik;

import java.util.Scanner;

public class SravniBukvi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();
        String z = scanner.next();
        int e = x.charAt(0);
        int r = y.charAt(0);
        int t = z.charAt(0);

        if (e < r && e < t && r < t) {
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        } else if (r < e && r < t && t < e) {
            System.out.println(y);
            System.out.println(z);
            System.out.println(x);

        } else if (r < e && r < t && e < t) {
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);
        } else if (e < r && e < t && t < r) {
            System.out.println(x);
            System.out.println(z);
            System.out.println(y);

        } else if (t < r && t < e && e < r) {
            System.out.println(z);
            System.out.println(x);
            System.out.println(y);
        } else if (t < r && t < e && r < e) {
            System.out.println(z);
            System.out.println(y);
            System.out.println(x);
        }
    }
}