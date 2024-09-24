package lvl16;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class urlcopy {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //напишите тут ваш код
        URL url = new URL(line);
        try(InputStream input = url.openStream();) {

            byte[] buffer = input.readAllBytes();
            int r = input.read(buffer);
            Files.createTempFile(null, null);

            while (r != -1) {
                r = input.read(buffer);
                Files.write((Files.createTempFile("example", ".txt")), buffer);
            }
        }
    }
}