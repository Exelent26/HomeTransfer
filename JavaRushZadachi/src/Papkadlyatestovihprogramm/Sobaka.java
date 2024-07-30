package Papkadlyatestovihprogramm;

public class Sobaka {

    String name;
    int age;
    String lubimayaigra;

    public Sobaka(String name, int age, String lubimayaigra) {
        this.name = name;
        this.age = age;
        this.lubimayaigra = lubimayaigra;
    }

    public Sobaka(String name) {
        this.name = name;
    }
    public Sobaka(){
        System.out.println("yaem");
    }

    public static void main(String[] args) {
        Sobaka matt = new Sobaka("Matt", 2, "Kong");
        Sobaka veter = new Sobaka("veter");
        System.out.println(matt.name);
        System.out.println(matt.age);

        Sobaka rey = new Sobaka();
    }
}
