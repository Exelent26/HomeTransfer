import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("vvedy 5");
         int value;
         do {
             System.out.println("vvedy 5");
             value = scanner.nextInt();
         }while (value!=5);
        System.out.println("vi vveli 5");
    }

}
