package lvl16;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class isFileOrisDerectory {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)) {
            for (Path check : files) {
                if (Files.isRegularFile(check)) {
                    System.out.println(check + THIS_IS_FILE);

                } else if (Files.isDirectory(check)) {
                    System.out.println(check + THIS_IS_DIR);
                }

            }

        }
    }
}
