package lvl17;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class izobretaemTeleport {
    public static final String INVENTED = "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!";
    public static final String NOT_INVENTED = "Извините, телепорт еще не изобрели, приходите через 10 лет.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        //напишите тут ваш код
        while (!isTeleportInvented(currentDay)){
            currentDay.add(Calendar.YEAR,10);
        }
    }

    static boolean isTeleportInvented (Calendar currentDay){
        //напишите тут ваш код
        Date date2 = currentDay.getTime();
        if ((currentDay.getTime()).before(INVENTION_DAY.getTime())) {
            System.out.println(NOT_INVENTED);
            return false;

        }else {
            System.out.println(INVENTED);
            return true;
        }


    }
}


