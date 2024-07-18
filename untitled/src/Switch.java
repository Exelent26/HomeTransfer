import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введи возраст ");
        String age = scanner.nextLine();
        switch (age){
            case "nol'":
                System.out.println("ti rodilsya");
                break;
            case "sem":
                System.out.println("ti poshel v shkolu");
                break;
            default:
                System.out.println("usloviya ne podoshli");
        }
    }
}
