import java.util.Scanner;

public class whilemin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        boolean a = false;
        while (!a){
            if(s.hasNextInt()){
                int x = s.nextInt();
                if(x<min){
                    min=x;
                }
            } else if (s.hasNextLine()) {
                System.out.println(min);
                a=true;

            }
        }
    }
}
