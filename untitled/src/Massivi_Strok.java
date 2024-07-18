public class Massivi_Strok {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] stroka = new String[3];
        stroka[0] = "privet";
        stroka[1] = "java";
        stroka[2] = "poka";
        //System.out.println(stroka[0]);
        //System.out.println(stroka[1]);
        //System.out.println(stroka[2]);
        for(int i=0;i<stroka.length;i++){
            System.out.println(stroka[i]);
        }
        System.out.println();

        for(String j:stroka){
            System.out.println(j);
        }
        int [] nomera = {1,2,3};
        int summa = 0;
        for(int x:nomera){
            summa=summa+x;
        }
        System.out.println();
        System.out.println(summa);

        int value = 0;
        String s = null;


    }
}
