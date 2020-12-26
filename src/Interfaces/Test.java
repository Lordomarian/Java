package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("bob");
        animal1.sleep();
        person1.sayHello();
        System.out.println();
        person1.showInfo();
        animal1.showInfo();
        System.out.println();
        Info info1 = new Animal(2); //здесь не совпадаюет тип переменной с обьектом класса
        Info info2 = new Person("Nic");// мы можем так сделать тк класс реализует этот интерфейс
        info1.showInfo();//мы можем вызвать только те методы которые указаны в интерфейсе(а так же методы класса object)
        info2.showInfo();
        System.out.println();
        // используем метод outPutInfo(пример использования интерфейса Info)
        outPutInfo(info1);
        outPutInfo(info2);
        outPutInfo(animal1);
        outPutInfo(person1);
    }
    public static void outPutInfo(Info info){ // в этот метод можно подать любой обьект который реализует интерфейс Info
        info.showInfo();//вызывает метод интерфейса для каждого класса (в нашем случае для классов animal и person)
    }
}
