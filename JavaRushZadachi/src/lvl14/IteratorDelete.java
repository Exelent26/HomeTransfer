package lvl14;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDelete {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            String x = list.get(i);
            if (x.equals("bug")) {
                list.remove(x);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list){
        //напишите тут ваш код
        Iterator<String> e = list.iterator();
        while (e.hasNext()) {
            String str = e.next();
            if (str.equals("bug")) {
                e.remove();
            }
    }

    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //напишите тут ваш код
    ArrayList<String> listcopy = new ArrayList<>(list);
    for (String str:listcopy){
        if((str.toLowerCase()).equals("bug")){
            list.remove(str);
        }
    }
    }
    }