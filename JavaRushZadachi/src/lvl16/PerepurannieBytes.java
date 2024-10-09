package lvl16;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class PerepurannieBytes {
    public static void main(String[] args) throws Exception{
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()));
            /* var inputStream = Files.newInputStream(Paths.get("C:\\Learn\\input.txt"));
             var outputStream = Files.newOutputStream(Paths.get("C:\\Learn\\output.txt"));*/
        ) {
            byte[] buffer = new byte[2];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer))!=-1){
                if(bytesRead == 2){
                    byte temp = buffer[0];
                    buffer[0] = buffer[1];
                    buffer[1] = temp;
                }

                outputStream.write(buffer,0,bytesRead);
            }
        }
        }


    }


