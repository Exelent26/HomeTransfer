package lvl16;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class reverseprint {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        //напишите тут ваш код
        outputStream.reset();
        String reverse = new StringBuilder(result).reverse().toString();
        printSomething(reverse);
        //System.out.println(reverse);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}