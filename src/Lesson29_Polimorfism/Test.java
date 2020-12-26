package Lesson29_Polimorfism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.eat();
        dog.eat();// класс dog наследует методу у класса animal
        Animal animal1 = new Dog();// полиморфизм позволяет к обьекту класса dog обращаться через переменную типа animal
        animal1.eat();//в случае переопределения метода в классе dog переменная класса animal выводит метод класса dog
        //это называется позднее связываение
        //animal1.bark; частные методы относящиеся к конкретному классу dog не могут быть вызваны переменной типа animal
        dog.eat();
        dog.bark();
        System.out.println();

        test(animal);//благодоря полиморфизму мы можем создавать методы которые принммают в себя переменные разных типов
        test(dog);
        test(cat);
        test(animal1);
    }
//С помощью полиморфизма нам не нужно создавать методы под каждый тип данных , а мы можем создать один,
// который будет работать на всех при правильно выстроенных связях
    public static void test(Animal animal){
        animal.eat();
    }
}
