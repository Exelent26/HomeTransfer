package day3;

import java.util.Scanner;

public class Gorodstrana {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Vvedite nazvanie goroda:");

        while(true) {
            String x = s.nextLine();

            if(x.equals("стоп"))
                break;


            switch (x) {

                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;

                case "Рим":
                case "Турин":
                case "Милан":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;

                default:
                    System.out.println("Неизвестная страна");

            }
        }

    }
}