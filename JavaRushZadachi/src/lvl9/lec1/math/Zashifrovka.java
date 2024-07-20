package lvl9.lec1.math;

public class Zashifrovka {
    public static int setFlag(int number, int flagPos) {
        //напишите тут ваш код
        int result = (number| (1 << flagPos));
        System.out.println(result);
        return result;
    }

    public static int resetFlag(int number, int flagPos) {
        //напишите тут ваш код
        int result = (number & ~(1 << flagPos));
        System.out.println(result);
        return result;
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишите тут ваш код
        if((number & (1<<flagPos))==(1<<flagPos)) {
            return true;
        }else{
            return false;}
        }
    public static void main(String[] args)  {
        int number = 2;
        int flagPos = 2;
        setFlag(number, flagPos);
        resetFlag(number, flagPos);
        checkFlag(number, flagPos);


    }
    }




