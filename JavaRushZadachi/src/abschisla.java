import java.util.Scanner;

public class abschisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if(Math.abs(b-a)< 0.000001){
            System.out.println("Числа равны");
        } else if (Math.abs(a-b)< 0.000001) {
            System.out.println("Числа равны");
        }
        else
            System.out.println("Числа не равны");

        //System.out.println(Math.abs(b-a) < 0.000001|| Math.abs(a-b) < 0.000001 ? "Числа равны" : "Числа не равны" );

    }
}