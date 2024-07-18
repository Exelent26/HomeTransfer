package lvl4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        int number = s.nextInt();


        if(number > 0 && number <5){
            int i = 0;
            do {
                System.out.println(text);
                i++;
            }while (i<number);
        }else if(number <= 0 || number >= 5){
            System.out.println(text);
        }
    }
}
