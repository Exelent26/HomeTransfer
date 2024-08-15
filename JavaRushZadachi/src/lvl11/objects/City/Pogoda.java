package lvl11.objects.City;

public class Pogoda {
    public static void showWeather(City city) {
        //напишите тут ваш код

        System.out.println("В городе "+ city.getName() + " сегодня температура воздуха "+ city.getTemperature());
    }

    public static void main(String[] args) {
        City dubay = new City("Dubai", 35);
        showWeather(dubay);

        //напишите тут ваш код
    }
}