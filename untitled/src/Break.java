public class Break {
    public static void main(String[]args){
        int i = 0;
        while(true){
            if(i==15){
                System.out.println(i);
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
