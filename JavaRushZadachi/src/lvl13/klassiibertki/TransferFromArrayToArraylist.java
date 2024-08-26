package lvl13.klassiibertki;

import java.util.ArrayList;

public class TransferFromArrayToArraylist {
    public static int[] numbers = new int[10];
    public static ArrayList<Integer> numbers2 = new ArrayList<>();

    public static void main(String[] args) {
        init();
        init2();
        print();

        reverse();
        reverse2();
        print();
    }
    public static void init2(){
        for (int i = 0; i<10; i++){
            numbers2.add(i);
            numbers2.set(i, (Integer) i);
        }
        System.out.println(numbers2.toString());
    }
    public static void reverse2(){
        int n2 = numbers2.size()-1;
        for(int i = 0; i< numbers2.size()/2; i++){
            Integer temp2 = numbers2.get(i);
            numbers2.set(i,n2-i);
            numbers2.set(n2-i,temp2);

        }
        System.out.println(numbers2.toString());
    }


    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }

    public static void reverse() {
        int n = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - i];
            numbers[n - i] = temp;
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

