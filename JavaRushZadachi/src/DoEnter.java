import java.util.Scanner;

//Сложная задача для моего уровня, вернусь и с делаю когда смогу// Разобрать решение
public class DoEnter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = 0;
        boolean end = false;
        while (!end) {
            if (console.hasNextInt()) {
                i = i + Integer.parseInt(console.nextLine());
            } else if (console.nextLine().equals("ENTER")){
                end = true;
            }

            System.out.println(i);
        }
    }
}