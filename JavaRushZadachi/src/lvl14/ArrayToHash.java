package lvl14;
import java.util.Collections;
import java.util.HashSet;


public class ArrayToHash {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишите тут ваш код
        HashSet<String> a = new HashSet<String>();
        for (int i = 0; i < strings.length; i++) {
            a.add(strings[i]);
        }
        return a;
    }
}

