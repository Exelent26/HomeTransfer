package lvl11.objects;

public class JavaRushTowers {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
    public JavaRushTowers() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    public JavaRushTowers(int x) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT+" "+ x);
    }
    public JavaRushTowers(String e) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER+ "" + e);

    }


    public static void main(String[] args) {
        JavaRushTowers skyscraper = new JavaRushTowers();
        JavaRushTowers skyscraperTower = new JavaRushTowers(50);
        JavaRushTowers skyscraperSkyline = new JavaRushTowers("JavaRushDevelopment");
    }
}


