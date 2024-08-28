package lvl13.klassiibertki;
import java.util.ArrayList;
import java.util.Objects;

public class TipDecider {
    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        //напишите тут ваш код
        for(Object o:elements) {
            if (o instanceof String) {
            printString();
            } else if (o instanceof Integer) {
                printInteger();
            } else if (o instanceof Integer[]) {
                printIntegerArray();
            }else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }
}

