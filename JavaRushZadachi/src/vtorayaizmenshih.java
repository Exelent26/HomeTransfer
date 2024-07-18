import java.util.Scanner;

public class vtorayaizmenshih {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        boolean a = false;

        while(!a){
            if(s.hasNextInt()){
                int def = s.nextInt();
                if(def<min){
                    min2 = min;
                    min = def;

                }else if(def<min2 && def > min){
                    min2 = def;
                }

            }
            else if(s.hasNextLine()){
                String b = s.nextLine();
                if(b.equals("ENTER")){
                    a = true;
                }
            }

        }
    }
}
