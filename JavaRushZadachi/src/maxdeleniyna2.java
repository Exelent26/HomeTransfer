import java.util.Scanner;

public class maxdeleniyna2 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int max = Integer.MIN_VALUE;
            boolean a = false;
            while (!a){
                if(s.hasNextInt()){
                    int x = s.nextInt();
                    if(x>max){
                        if(x%2==0){
                        max=x;}
                    }
                } else if (s.hasNextLine()) {
                    System.out.println(max);
                    a=true;

                }
            }
        }
    }
