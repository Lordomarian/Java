package com.company;

public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = " Miha";
        person1.age = 22;
     //   person1.speak();
      //  person1.sayHello();
        Person person2 = new Person();
        person2.name = " Vova";
        person2.age = 20;
       int year1 = person1.calculateYears();
       int year2 = person2.calculateYears();
        System.out.println("первому человеку до пенсии "+year1);
        System.out.println("Второму человеку до пенсии "+year2);
       // person2.speak();
      //  person2.sayHello();
    }
}
class Person{
    //У класса может быть :
    //1. данные (поля)
    // Действия, которе он может совершать (методы)
    String name;
    int age;
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