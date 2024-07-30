package lvl10.RabotaSoStrokami;

import java.util.Scanner;

public class testtocampare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        int index = path.indexOf("//");
        System.out.println(index);
        int index2 = path.indexOf("/", index + 2);
        System.out.println(index2);
        String first = path.substring(0, index + 2);
        System.out.println(first);
        String last = path.substring(index2);
        System.out.println(last);

        String result = first + "javarush.com" + last;
        System.out.println(result);
    }
}