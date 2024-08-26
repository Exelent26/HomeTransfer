package lvl13.klassiibertki;

public class CharCheck {

    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char x = string.charAt(i);
            if(Character.isDigit(x)){
                count+=1;
            }

        }
        return count;

    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char x = string.charAt(i);
            if(Character.isLetter(x)){
                count+=1;
            }

        }
        return count;
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char x = string.charAt(i);
            if(Character.isSpaceChar(x)){
                count+=1;
            }

        }
        return count;
    }
}
