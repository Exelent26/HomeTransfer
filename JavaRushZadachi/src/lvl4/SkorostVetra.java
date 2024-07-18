package lvl4;

import java.util.Scanner;

public class SkorostVetra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sv = s.nextInt();
        double km = 3.6 * sv;
        System.out.println(Math.round(km));
    }
}
