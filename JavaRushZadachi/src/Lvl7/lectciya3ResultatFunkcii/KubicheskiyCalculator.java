package Lvl7.lectciya3ResultatFunkcii;
/*
Давай напишем реализацию калькулятора, который будет считать степени чисел.
Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение типа long.
Метод должен возводить полученное значение в третью степень и возвращать его как результат работы метода.
Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long.
 */
public class KubicheskiyCalculator {
    public static void main(String[] args) {

    }
    public static long cube(long x) {
        long result = (long)Math.pow(x, 3);
        return result;
    }


}
