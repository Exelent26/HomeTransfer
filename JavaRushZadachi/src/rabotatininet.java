import java.util.Scanner;

public class rabotatininet {

        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            int age = x.nextInt();
            boolean isYoung = (age<20);
            boolean isOld = (age>60);
            if(isOld||isYoung){
            System.out.println("можно не работать");
        }
    }

}
