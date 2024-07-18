import java.util.Scanner;

public class Treugolnik {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        if (a<b+c && b<a+c && c<a+b){
            System.out.println(TRIANGLE_EXISTS);
        }


        else{
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}