import java.util.Scanner;

public class DoEnter2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        boolean console = false;


        while (!console){
            if (s.hasNextInt()){
                int i = s.nextInt();
                sum = sum + i;




            } else if (s.hasNextLine()) {
                String a = s.nextLine();
                if(a.equals("ENTER")){
                    System.out.println(sum);
                    console = true;
                }
            }
        }
    }
}
