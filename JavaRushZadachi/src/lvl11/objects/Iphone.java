package lvl11.objects;

import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Iphone)) return false;
        if(o == null || getClass() != o.getClass()) return false;
        Iphone iphone = (Iphone) o;
        return model ==  iphone.model && color == iphone.color && price == price;
    }

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "green", 999);

        System.out.println(iphone1.equals(iphone2));
    }


    @Override
    public int hashCode() {
        return Objects.hash(model, color, price);
    }
}
