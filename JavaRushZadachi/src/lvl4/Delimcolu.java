package lvl4;

import java.util.Scanner;

public class Delimcolu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int banka = s.nextInt();
        int proger = s.nextInt();
        double skolko = banka*1.0/proger;
        System.out.println(skolko);
    }
}
