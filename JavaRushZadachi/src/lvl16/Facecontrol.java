package lvl16;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Facecontrol {
    public static void main(String[] args) throws Exception {
        char probel = ' ';
        char zapyataya = ',';
        char tochka = '.';

        try (Scanner scanner = new Scanner(System.in);
             /*FileReader  fr = new FileReader(scanner.nextLine());
             FileWriter fw = new FileWriter(scanner.nextLine());*/
             FileReader fr = new FileReader("C:\\Learn\\input.txt");) {


            int c = fr.read();
            while (c != -1) {
                if ((char) c != probel && (char) c != zapyataya &&(char) c != tochka) {

                    System.out.print(c);
                }
                    c = fr.read();


            }
        }
    }
}
