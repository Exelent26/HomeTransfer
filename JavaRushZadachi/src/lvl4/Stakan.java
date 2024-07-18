package lvl4;

import java.util.Scanner;

public class Stakan {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner s = new Scanner(System.in);

        boolean b = s.nextBoolean();

        if(b == true)

            System.out.println((int)Math.ceil(glass));
        else
            System.out.println((int)Math.floor(glass));
    }
}
