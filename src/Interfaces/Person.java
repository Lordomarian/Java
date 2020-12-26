package Interfaces;

public class Person implements Info { // если класс реализует какой то интерфейс,
    public String name;// то класс обязательн иметь в себе все методы этого интерфейса

    public Person(String name) {//можно создавать разные конструкторы и тд с помощью клавиш Ctrl +N
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    @Override // перезапись метода
    public void showInfo(){
        System.out.println("Name is " + this.name);
    }
}
