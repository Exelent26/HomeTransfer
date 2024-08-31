package lvl14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class IteratorForEach {

    public static void print(HashSet<String> words) {
        //напишите тут ваш код
        Iterator<String> x = words.iterator();
        while (x.hasNext()){
            String loot = x.next();
            System.out.println(loot);
        }

    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}


