package day5;

public class Praktik {
    public static void main(String[] args) {
        Car car1 = new Car("Bugatti","jetiy",15);

        car1.identificationCar();
        car1.yearsDoSvalki(car1.vozrastmashini);

    }

}
class Car{
    int vozrastmashini;
    String cvet;
    String model;
    public Car(String model, String cvet, int vozrastmashini){
        this.model=model;
        this.cvet = cvet;
        this.vozrastmashini = vozrastmashini;
    }
    void identificationCar(){
        System.out.println("Модель машины " +model);
        System.out.println("Цвет машины " + cvet);
    }
    int yearsDoSvalki(int x){
        return 30-x;

    }
}

