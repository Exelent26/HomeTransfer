import java.util.Scanner;

public class Sravnenie3hchisel {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        boolean a1 = a == b && a == c && c == b;
        boolean a2 = a == c && a != b && b != c;
        boolean a3 = a == b && a != c && c != b;
        boolean a4 = c == b && a != c && a != b;
        if (a1)
            System.out.print(a + " " + b + " " + c);
        else if (a2)
            System.out.print(a + " " + c);
        else if (a3)
            System.out.print(a + " " + b);
        else if(a4)
            System.out.print(b + " " + c);
        else {

        }
    }
}



