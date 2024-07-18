import java.util.Scanner;

public class NameAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        String name = e.nextLine();
        int age = s.nextInt();


        String militaryCommissar = ", явитесь в военкомат";



        if(age>=18&&age<=28){
            System.out.println(name+militaryCommissar);
        }



    }
}

