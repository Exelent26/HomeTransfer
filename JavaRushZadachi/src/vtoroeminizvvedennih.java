import java.util.Scanner;

public class vtoroeminizvvedennih {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        boolean a = false;
        while (!a){
            if(s.hasNextInt()){
                int x = s.nextInt();
                if(x<min){
                    min2 = min;
                    min=x;}
                else if(x < min2 && x >min){
                    min2=x;
                }




            } else if (s.hasNextLine()) {
                System.out.println(min2);
                a=true;

            }
        }

    }
}

