package lvl16;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.util.Arrays;

public class getAPI {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        URLConnection connection = url.openConnection();
        try (InputStream input = url.openStream()){
            byte[] buffer = input.readAllBytes();
            String str = new String(buffer, "UTF-8");
            System.out.println(str);


        }
    }
}