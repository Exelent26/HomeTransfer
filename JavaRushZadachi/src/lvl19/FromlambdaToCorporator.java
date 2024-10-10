package lvl19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FromlambdaToCorporator {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Comparator<String> comparator = new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                return s1.length()-s2.length();
            }
        };

        /*Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());*/
    }
}

