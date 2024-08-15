package lvl11.objects;

import java.util.Arrays;
import java.util.Objects;

/*
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        boolean itSorted = false; // обьявляем буливую переменную
        String e = null; // создаем строку буфер
        while(!itSorted){ // создаем цикл, для проверки, сортирован или нет массив по нашим условиям
            itSorted = true;// если да, то ставим знаечение тру и выходим из цикла
            for (int i = 0; i < array.length-1; i++) { // создаем счетчик для перебора массива
            if(array[i]==null && array[i+1]!=null){// проверяем что текущего элемента массива вялется нулем, при том что следующий элемент нулем не является
               itSorted = false; // так как есть элементы не отсортированные, переварачиваем наше условие сортировки на невыполненные
                e = array[i+1]; // сохраняем значение переменной в строке буфере
                array[i]=e;// заменяем текузее значение переменой на значение из буфера
                array[i+1]= null; // приравниваем следующий элемент к нулю
            }

        }
        }
    }
}

