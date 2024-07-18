package Lvl7.lectciya3ResultatFunkcii;

public class Calculatorto9 {
    public static void main(String[] args) {
     long a = 3;
     long result = cube(a);
     System.out.println(result);
     long result9 = ninthDegree(a);
     System.out.println(result9);

    }

    public static long cube(long a){
        return a*a*a;
    }

    public static long ninthDegree(long a){
        return(cube(cube(a)));
    }

}

