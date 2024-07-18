package lvl4;

import java.util.Scanner;

public class Doube {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        double pi = 3.14;
        int radius = s.nextInt();

        int S = (int) (pi * radius * radius);
        System.out.println(S);
    }
}
