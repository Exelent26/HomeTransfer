package lvl16;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
public class Facecomtrol2 {
    public static void main(String[] args) throws IOException {
        char probel = ' ';
        char zapyataya = ',';
        char tochka = '.';
        Scanner scanner = new Scanner(System.in);
        List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
        for (int i = 0; i < list.size(); i++) {
            String e = list.get(i);
            StringBuilder sb = new StringBuilder(e);
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == probel || sb.charAt(j) == zapyataya || sb.charAt(j) == tochka) {
                    sb.deleteCharAt(j);
                    j--;
                }
            }
            System.out.print(sb);
            System.out.println();
        }
    }
}