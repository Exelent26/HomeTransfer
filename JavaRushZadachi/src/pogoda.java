import java.util.Scanner;

public class pogoda {

/*
Тепло или холодно
*/
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int weather = s.nextInt();

            String cold = "на улице холодно";
            String warm = "на улице тепло";
            if(weather<0){
                System.out.println(cold);
            }
            else{
                System.out.println(warm);
            }


        }
    }



