package lvl17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Format2012 {
    public static void main(String[] args) {
        /*Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date))*/;

        GregorianCalendar x = new GregorianCalendar(2016, 1,31,3,33,11);
        Date date2 = x.getTime();
        x.add(Calendar.MONTH, 3);
        x.add(Calendar.DAY_OF_WEEK, 3);

        System.out.println(date2);
        System.out.println(x.getTime());
    }
}
