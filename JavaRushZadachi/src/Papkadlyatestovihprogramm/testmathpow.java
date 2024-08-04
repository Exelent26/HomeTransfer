package Papkadlyatestovihprogramm;
import java.util.Scanner;

public class testmathpow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        float y = 5*((int)Math.pow(x,2)) + (2 * x) + 11;
        System.out.println(y);
    }
}
