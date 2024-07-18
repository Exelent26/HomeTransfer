public class equals2 {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);


    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        if( string1==string2 && string2==string3 && string1==string3){
            System.out.println(same);
            System.out.println(string1+", "+string2+", "+string3);}
        else{
            System.out.println(different);
            System.out.println(string1+", "+string2+", "+string3);}
        }
    }


