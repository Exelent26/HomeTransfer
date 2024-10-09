package lvl15;
import java.util.LinkedList;
import java.util.List;


public class Stackadd {
    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        //напишите тут ваш код
        storage.add(s);
    }

    public String pop() {
        //напишите тут ваш код


        return storage.removeFirst();
    }

    public String peek() {
        //напишите тут ваш код
        return storage.getFirst();
    }

    public boolean empty() {
        //напишите тут ваш код
        return storage.isEmpty();
    }

    public int search(String s) {
        //напишите тут ваш код
        return storage.indexOf(s);
    }
}
