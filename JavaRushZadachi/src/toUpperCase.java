import java.util.Scanner;

public class toUpperCase {

    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String kod = s.nextLine();

        if(kod.equalsIgnoreCase(secret)) {
            System.out.println("доступ разрешен");
        }
        else{
        System.out.println("доступ запрещен");}
    }
}

