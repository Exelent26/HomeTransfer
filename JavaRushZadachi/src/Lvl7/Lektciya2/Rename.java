package Lvl7.Lektciya2;

public class Rename {
    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        printPersonInfo(firstName, lastName, favouriteDish);
        String name = firstName;
        String surname = lastName;
        String meal = favouriteDish;
    }

    public static void printPersonInfo(String name, String surename, String meal){


        System.out.println("Краткое досье:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surename);
        System.out.println("Любимое блюдо: " + meal);
    }

}
