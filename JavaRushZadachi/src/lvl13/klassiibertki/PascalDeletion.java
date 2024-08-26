package lvl13.klassiibertki;
import java.util.ArrayList;
import java.util.Arrays;

public class PascalDeletion {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишите тут ваш код
        int index = programmingLanguages.indexOf("Pascal");
        programmingLanguages.remove(index);
        System.out.println(programmingLanguages.toString());

    }
}
