package lvl16;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class poehali {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                outputStream.write(buffer, size, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

