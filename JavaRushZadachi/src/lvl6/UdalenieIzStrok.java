package lvl6;

import java.util.Objects;
import java.util.Scanner;

public class UdalenieIzStrok {


    public static String[] strings;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        strings = new String[6];
        strings[0] = s.nextLine();
        strings[1] = s.nextLine();
        strings[2] = s.nextLine();
        strings[3] = s.nextLine();
        strings[4] = s.nextLine();
        strings[5] = s.nextLine();

        for (int i = 0; i < strings.length - 1; i++) {
            int m = 0;
            for (int j = i + 1; j < strings.length; j++) {
                if (Objects.equals(strings[j], strings[i]) && strings[j] != null) {
                    strings[j] = null;
                    m = 1;

                }
            }
            if (m == 1) {
                strings[i] = null;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

