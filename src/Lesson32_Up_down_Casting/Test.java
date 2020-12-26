package Lesson32_Up_down_Casting;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog = new Dog();
        //Upcasting- восходящее преобразование( делали на уроке про полиморфизм)
        Animal animal = dog;// неявное восх. преобразование аналогично строчке Animal animal = new Dog()
        //Downcasting - низходящее преоброзование нельзя сделать неявно.
        Dog dog1 = (Dog) animal;
        dog1.bark();// Downcasting не всегда безопасен
        //Смодулируем ошубку
        Animal a = new Animal();
        Dog d = (Dog) a;
        //d.bark(); Выдаст ошибку тк в классе Animal нет метода bark, а мы сослались на переменную класса Animal
    }
}
