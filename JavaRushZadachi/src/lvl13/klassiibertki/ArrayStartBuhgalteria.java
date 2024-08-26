package lvl13.klassiibertki;

import java.util.ArrayList;


public class ArrayStartBuhgalteria {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println(waitingEmployees.toString());
        paySalary(null);
    }

    public static void paySalary(String name) {
        //напишите тут ваш код
        if(waitingEmployees.contains(name)) {
            if (name != null) {
                int index = waitingEmployees.indexOf(name);
                waitingEmployees.set(index, null);

                alreadyGotSalaryEmployees.add(name);
                System.out.println(waitingEmployees.toString());
                System.out.println(alreadyGotSalaryEmployees.toString());
            } else if (name == null) {

            }
        }
    }

    }


