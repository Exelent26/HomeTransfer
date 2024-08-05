package Obuchalki_s_youtube.Classes_and_Objects;

public class ClassesAndObjects {
    public static void main(String[] args) {


        Person person1 = new Person();
        person1.setName("");
        person1.setAge(12);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

    }
}

class Person {
    private String name;
    private int age;

    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("ты ввел пустое имя");
        }else{
            name = username;
        }
    }
    public String getName(){

        return name;
    }
    public void setAge(int userAge){
        if (userAge<=0){
            System.out.println("ты ввел некоректный возраст, он должен быть положительный");
        }else {
            age = userAge;
        }
    }
    public int getAge(){
        return age;
    }

    int vichislenieLetDoPensii() {
        int years = 65 - age;
        return years;
    }
    void speak() {
        System.out.println("My name is - " + name + " " + " mne" + " " + age);

    }
}
