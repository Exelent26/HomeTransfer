package lvl16;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Что-то не копируется...
*/

public class FiximPath {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            /* var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()));*/
             var inputStream = Files.newInputStream(Paths.get("C:\\Learn\\input.txt"));
             var outputStream = Files.newOutputStream(Paths.get("C:\\Learn\\output.txt"));
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                int read = inputStream.read(buffer);
                outputStream.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

