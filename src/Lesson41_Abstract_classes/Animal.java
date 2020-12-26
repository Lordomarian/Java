package Lesson41_Abstract_classes;
//Полиморфизм это способность метода обрабатывать данные разных типов
public abstract class Animal { // если класс должен быть концепцией а не сущностью
    // то нужно использовать абстрактный класс чтобы запретить создавать обьекты этого класса
    public void eat(){
        System.out.println("Animal is eating");
    }

    public abstract void makeSound();//только в абстрактных классах можно создавать абстрактные методы


}
