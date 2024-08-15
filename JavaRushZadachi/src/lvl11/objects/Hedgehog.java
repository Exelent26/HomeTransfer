package lvl11.objects;

public class Hedgehog {
    public Hedgehog(){

    };

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Hedgehog x = new Hedgehog();
        Apple apple = new Apple();
        x.eat(apple);
    }

    public static class Apple {
    }
}


