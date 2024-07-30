public class test2 {
    public static void main(String[] args) {
        String binaryNumber = "2521";
        String binarytocompare = "123123";
        System.out.println(binaryNumber.charAt(1));
        System.out.print("JavaRush".charAt(0));
        System.out.print("JavaRush".charAt(1));
        System.out.print("JavaRush".charAt(2));
        System.out.print("JavaRush".charAt(3));
        System.out.println();

        System.out.println(binaryNumber.regionMatches(1,binarytocompare,2,2));
    }
}