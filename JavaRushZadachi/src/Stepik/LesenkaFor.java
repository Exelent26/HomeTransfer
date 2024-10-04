package Stepik;
import java.util.Scanner;
public class LesenkaFor {

        public static void main(String[] args) {
            //put your code here
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n > 0){

               for (var j=1;j<=n;j++){
                   for ( var i = 1; i <= j; i++){
                       if (i<j) System.out.print(i+" ");
                       else System.out.print(i);
                   }
                   System.out.println();
               }

                }
            }
        }

