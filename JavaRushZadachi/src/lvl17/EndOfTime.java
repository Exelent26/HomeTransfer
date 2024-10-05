package lvl17;
import java.time.Instant;


public class EndOfTime {
    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишите тут ваш код

        return Instant.ofEpochMilli(Instant.MAX.toEpochMilli());
    }

    static Instant getMaxFromSeconds() {
        //напишите тут ваш код

        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    static Instant getMaxFromSecondsAndNanos() {
        //напишите тут ваш код

        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(),Instant.MAX.getNano());
    }
}

