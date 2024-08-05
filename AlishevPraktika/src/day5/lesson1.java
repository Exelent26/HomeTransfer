package day5;


class motobike{
    private int godvipuska;
    private String cvet;
    private String model;
    public motobike(int godvipuska,String cvet, String model){
        this.godvipuska = godvipuska;
        this.cvet = cvet;
        this.model = model;
    }
    public int getGodvipuskamoto(){
        return godvipuska;
    }
    public String getCvetmoto(){
        return cvet;
    }
    public String getModelmoto(){
        return model;
    }
}
class car{
    private int godvipuska;
    private String cvet;
    private String model;

    public void setGodvipuska(int god){
        godvipuska=god;
    }

    public int getGodvipuska() {
        return godvipuska;
    }

    public void setCvet(String cvet) {
        this.cvet = cvet;
    }

    public String getCvet() {
        return cvet;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
public class lesson1 {
    public static void main(String[] args) {
        car x = new car();
        x.setCvet("zeleniy");
        x.setGodvipuska(1965);
        x.setModel("mustang");
        System.out.println(x.getCvet());
        System.out.println(x.getModel());
        System.out.println(x.getGodvipuska());
        motobike motobike1 = new motobike(1993, "red","myasorubka");
        System.out.println(motobike1.getCvetmoto());
        System.out.println(motobike1.getModelmoto());
        System.out.println(motobike1.getGodvipuskamoto());

    }
}
