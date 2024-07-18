import java.util.Random;

public class Sluchaynayageneraciya {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 0; i<100;i++){
            System.out.println(rand.nextInt(6)+1); // Пример случайного вывода игрального кубика в скобочках 6 так как генерируется число
                                                  // так как генерируется число 0-5 и к нему прибавляется 1

            //System.out.println(Math.round(Math.random()*10));
        }
    }}
