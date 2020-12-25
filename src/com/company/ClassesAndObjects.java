package com.company;

public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        //person1.setNameAndAge("Miha",22);
       // String s1 = "Vova";
         //person1.speak();
      //  person1.sayHello();
            person1.setName("Какое то имя");
            person1.setAge(12);
           // person1.speak();
        System.out.println("Выводим значение в майн методе " + person1.getName());
        System.out.println("выводим значение в майн методе "+ person1.getAge());
        Person person2 = new Person();
       // person2.setNameAndAge(s1,30);
       int year1 = person1.calculateYears();
       int year2 = person2.calculateYears();
       // System.out.println("первому человеку до пенсии "+year1);
       // System.out.println("Второму человеку до пенсии "+year2);
       // person2.speak();
      //  person2.sayHello();
    }
}
class Person{
    //У класса может быть :
    //1. данные (поля)
    // Действия, которе он может совершать (методы)
    private String name;
    private int age;

    public void setName(String username){

        if (username.isEmpty()) {
            System.out.println("Пустое имя");
        }else {
            name = username;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if (userAge < 0){
            System.out.println("Отрицательный возраст");
        }else {
            age=userAge;
        }
    }
    public int getAge(){
        return age;
    }

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }
    int calculateYears(){
        int years = 65-age;
        //System.out.println("Количество лет до пенсии "+years);
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ",мне " + age + "лет");
        }
    }
    void sayHello(){
        System.out.println("Hi");
    }
}