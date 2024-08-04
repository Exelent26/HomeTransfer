package lvl11.objects;

public class Skyscraper2 {
    private int floorsCount;
    private String developer;

    //напишите тут ваш код
        public Skyscraper2(){
            floorsCount = 5;
            developer = "JavaRushDevelopment";
        }
        public Skyscraper2(int floorsCount, String developer){
            this.floorsCount = floorsCount;
            this.developer = developer;
    }


    public static void main(String[] args) {
        Skyscraper2 skyscraper = new Skyscraper2();
        Skyscraper2 skyscraperUnknown = new Skyscraper2(50, "Неизвестно");
    }
}