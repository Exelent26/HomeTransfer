package Stepik;

import java.util.Arrays;
import java.util.Scanner;

public class MassiviStrokBezPrepinaniya {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String  x = scanner.nextLine();
        int kolichestvoStrok = Integer.parseInt(x);


        String[][] array = new String[kolichestvoStrok][];
        for (int i = 0; i < kolichestvoStrok; i++) {
            array[i] = scanner.nextLine().split(" ");
            System.out.println(Arrays.toString(array[i]));
        }


    }
}
