package lvl17;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Formatparser {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");;
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.parse(timeString,dateTimeFormatter);

        System.out.println(dateTime);
        Date a = new Date();
        System.out.println(a);
    }
}

