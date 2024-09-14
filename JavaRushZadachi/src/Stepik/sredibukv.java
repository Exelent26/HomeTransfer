package Stepik;

import java.util.Scanner;

public class sredibukv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int anumber = a.charAt(0);
        int bnumber = b.charAt(0);
        while (scanner.hasNext()) {
            String n = scanner.next();
            if (n.charAt(0) >= anumber && n.charAt(0) <= bnumber){
                System.out.print(n + " ");
            }
        }

    }
}
