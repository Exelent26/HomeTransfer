package lvl8.lec1;

public class UstanovkaZnacheniya {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(1000);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void setValues(long value){
        //напишите тут ваш код
        a = (byte)value;
        b = (short) value;
        c = (int)value;
        d = value;

    }
}


