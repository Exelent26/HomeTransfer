public class PrefixPostfix {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        j = i++ + (( i == 2 )? i++: (i++ * i++)) + i++ ;
        System.out.println(i);
        System.out.println(j);
}
}