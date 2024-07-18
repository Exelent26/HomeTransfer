package Obuchalki_s_youtube.Classes_and_Objects;

public class ClassesAndObjects {
    public static void main(String[] args) {


        Person person1 = new Person();
        person1.setNameAndAge("Evgeniy", 31);
        person1.setAge(31);
        String s1 = "Vladimir";
        person1.speak();


        Person person2 = new Person();
        person2.setNameAndAge(s1, 35);
        person2.speak();



    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage){
        name = username;
        age= userage;

    }
    void setAge(int vozrast){
        age = vozrast;
    }

    int vichislenieLetDoPensii() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("My name is - " + name + " " + " mne" + " " + age);

    }
}
