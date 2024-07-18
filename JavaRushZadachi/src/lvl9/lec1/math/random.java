package lvl9.lec1.math;

public class random {
    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        //напишите тут ваш код
        return  (int)(Math.random()*100);
    }
}

