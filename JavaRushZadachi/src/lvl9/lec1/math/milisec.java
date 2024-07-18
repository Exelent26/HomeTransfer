package lvl9.lec1.math;

public class milisec {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 9; i++) {
            printNumbers();
        }

    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            Thread.sleep(1,300_000);
        }
    }
}

