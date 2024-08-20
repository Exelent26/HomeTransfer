package lvl11.objects;

public class Carscatalog {
    private String model;
    private int year;
    private String color;
        public void initialize(String model, int year, String color){
            this.model = model;
            this.year = year;
            this.color = color;
        }

    public static void main(String[] args) {
        Carscatalog a = new Carscatalog();
        a.initialize("Ford", 1960, "yellow");
    }
}
