package Papkadlyatestovihprogramm;

public class abstracttest {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            void makeSound() {

            }
        };
        dog.sleep();
        dog.makeSound();
    }
}
abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

