package lvl17;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;


public class TreeofTimeZones {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> sortedZones = new TreeSet<>();
        sortedZones.addAll(ZoneId.getAvailableZoneIds());

        return sortedZones;
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишите тут ваш код
        ZoneId zone= ZoneId.of("Asia/Shanghai");
        ZonedDateTime z = ZonedDateTime.now(zone);
        return z;
    }
}


