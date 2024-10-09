package lvl16;

import java.nio.file.Path;
import java.util.Scanner;

public class ToabsoluteIfunotAbsolute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Path path = Path.of(str);
        if(path.isAbsolute()){
            System.out.println(path);
        }else {
            System.out.println(path.toAbsolutePath());
        }

    }
}
