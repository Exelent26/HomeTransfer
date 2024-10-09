package lvl16;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FaceComtroll2noll {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
        for (int i = 0; i < list.size(); i+=2) {
            System.out.println(list.get(i));
            }


        }
    }
