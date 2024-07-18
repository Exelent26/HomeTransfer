package lvl9.lec1;

import java.util.Scanner;

public class minMassiv {
        static Scanner x = new Scanner(System.in);
        public static void main(String[] args) {
            int[] intArray = getArrayOfTenElements();
            System.out.println(min(intArray));
        }

        public static int min(int[] ints) {
            int min = Integer.MAX_VALUE;
            for (int number : ints) {
                min = Math.min(min, number);
            }
            return min;
        }

        public static int[] getArrayOfTenElements() {
            //напишите тут ваш код
            int[] array = new int[10];
            for (int i = 0; i <array.length ; i++) {
                array[i] = x.nextInt();
            }
            return array;
        }
    }

