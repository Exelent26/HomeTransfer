package lvl10;

public class Vosmirichniycolculator {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) {
            return 0;
        }
        int vosmirichnoe = 0;
        int i = 0;
        while (decimalNumber != 0) {
            int ostatok = decimalNumber % 8;
            vosmirichnoe = vosmirichnoe + ostatok * (int)Math.pow(10, i);
            decimalNumber = decimalNumber / 8;
            System.out.println(decimalNumber);
            i++;

        }
        return vosmirichnoe;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        if (octalNumber <= 0) {
            return 0;
        }
        int desyatirichnoe = 0;
        int i = 0;
        while (octalNumber !=0){
            int ostatok = octalNumber%10;
            desyatirichnoe = desyatirichnoe + ostatok * (int)Math.pow(8,i);
            octalNumber=octalNumber/10;
            i++;

        }
        return desyatirichnoe;
    }
}

