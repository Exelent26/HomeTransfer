package lvl17;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class FromMapToSetDate {
    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишите тут ваш код
        Set<LocalDateTime> dateSet =new HashSet<>();
        for(Map.Entry<LocalDate, List<LocalTime>> a:sourceMap.entrySet() ){
            LocalDate e = a.getKey();
            List<LocalTime> c = a.getValue();
            for (LocalTime ec:c){
                dateSet.add(LocalDateTime.of(e,ec));

            }

        }

        return dateSet;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}