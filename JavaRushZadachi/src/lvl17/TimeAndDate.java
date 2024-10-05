package lvl17;
import java.util.Calendar;
import java.util.Date;



public class TimeAndDate {


    static Date birthDate = new Date(94, 3, 26);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));

    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        int day = date.getDay();
        String daynadel = null;
        switch (day){
            case 1: daynadel = "Понедельник";break;
            case 2: daynadel = "Вторник";break;
            case 3: daynadel = "Среда";break;
            case 4: daynadel = "Четверг";break;
            case 5: daynadel = "Пятница";break;
            case 6: daynadel = "Суббота";break;
            case 0: daynadel = "Воскресенье";break;
        }


        return daynadel;
    }
}

