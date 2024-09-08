import java.util.Scanner;
class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while(scanner.hasNext()==true){
            String n = scanner.next();
            count++;
        }
        System.out.println(count);


    }
}