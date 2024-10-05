package lvl17;
import java.time.LocalDate;



public class DataApi {
    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код

        return LocalDate.now();
    }

    static LocalDate ofExample() {
        //напишите тут ваш код

        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код

        return LocalDate.ofYearDay(2020,256);
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код

        return LocalDate.ofEpochDay(18517);
    }
}
