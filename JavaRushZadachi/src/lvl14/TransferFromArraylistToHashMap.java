package lvl14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TransferFromArraylistToHashMap
{public static void main(String[] args) {
    System.out.println(getProgrammingLanguages());
    System.out.println();
}

    public static HashMap<Integer,String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        HashMap<Integer,String> convert = new HashMap<Integer, String>();
        for (int i = 0; i < programmingLanguages.size(); i++) {
            convert.put(i, programmingLanguages.get(i));
        }

        return convert;
    }

}


