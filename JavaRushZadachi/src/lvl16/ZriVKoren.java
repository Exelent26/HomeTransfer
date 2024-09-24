package lvl16;

import java.nio.file.Path;
import java.util.Scanner;

public class ZriVKoren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишите тут ваш код
        Path path = Path.of(str).getRoot();
        System.out.println(path);
    }
}

