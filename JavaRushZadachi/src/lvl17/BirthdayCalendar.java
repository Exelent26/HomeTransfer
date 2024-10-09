package lvl17;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class BirthdayCalendar {
    static Calendar birthDate = new GregorianCalendar(1994,3,26);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));

    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        String daynadel = null;
        switch (calendar.get(Calendar.DAY_OF_WEEK)){
            case 2: daynadel = "Понедельник";break;
            case 3: daynadel = "Вторник";break;
            case 4: daynadel = "Среда";break;
            case 5: daynadel = "Четверг";break;
            case 6: daynadel = "Пятница";break;
            case 7: daynadel = "Суббота";break;
            case 1: daynadel = "Воскресенье";break;
        };



        return daynadel;
    }

}
