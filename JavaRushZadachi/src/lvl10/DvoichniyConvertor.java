package lvl10;

public class DvoichniyConvertor {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE ;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        //String binaryNumber = "1111111111111111111111111111111";
        //System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber<=0)
            return null;
        String binaryNumber = "";
        while (decimalNumber!=0) {
            binaryNumber = decimalNumber%2 + binaryNumber;
            decimalNumber = decimalNumber/2;
        }
        return binaryNumber;
    }


        //public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        //    return 0;
        //}

    }