import java.util.Scanner;

public class SummDoEnter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int summ = 0;
        boolean a = false;
        while (!a){
            if(s.hasNextInt()){
                summ = summ + Integer.parseInt(s.nextLine());

            }else if(s.nextLine().equals("ENTER")){
                a = true;
            }
        }
    }
}
//TODO public class Solution {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        boolean isExit = false;
//        while (!isExit) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                sum = sum + number;
//            } else if (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                if (line.equals("ENTER")) {
//                    isExit = true;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//} JAVARUSH RESHENIE
