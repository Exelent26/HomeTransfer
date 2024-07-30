package lvl10;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        String[] array = path.split("/");


        String result = String.join("\\\\", array);


        System.out.println(result);
    }
}
