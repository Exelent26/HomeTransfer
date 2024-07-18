import java.util.Scanner;

public class Chetvertkoordinat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        boolean pc = (x > 0 && y > 0);
        boolean vc = (x < 0 && y < 0);
        boolean tc = (x < 0 && y > 0);
        boolean cc = (x > 0 && y < 0);

        if (pc) {
            System.out.println("первая четверть");
        } else if (vc) {
            System.out.println("вторая четверть");
        } else if (tc) {
            System.out.println("третья четверть");
        } else if (cc) {
            System.out.println("четвертая четверть");
        }
    }}
