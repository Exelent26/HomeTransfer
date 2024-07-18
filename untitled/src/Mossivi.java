public class Mossivi{

    public static void main(String[] args) {
        int number = 10; // примитивный тип данных  [10]
        int[] numbers = new int[5]; // number -> [massiv] ссылочный тип данных
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1,2,3};
        for(int i = 0; i <numbers1.length;i++) {
            System.out.println(numbers1[i]);
        }
    }
}

