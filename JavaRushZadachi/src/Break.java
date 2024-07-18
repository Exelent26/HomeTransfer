import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            String a = s.nextLine();
            if (a.equals("enough")) {
                break;
            }
            System.out.println(a);
        }
    }
}
