package com.company;

import com.company.Package.Person;

//Модификаторы доступа
public class Lesson_Public_Private extends Person {

    public int id;

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Bob"; // можем получить доступ тк поле public p.s все поля в классах необходимо делать private
        Person p1 = new Person();
       // System.out.println(p1.name1); так как поле name1 default к нему нельзя обратиться из другого пакета
    }
    public void Test (){ //тк так как поле name1 default к нему нельзя обратиться из другого пакета,
        name1 = "Tome";// но мы можем это сделать если наш класс наследует класс Person в котором это поле обьявлено
    }
    //public, private, default, protected все модификаторы доступа в java
//public разрешает доступ к классу методу или полю везде на протяжении одного проекта
//private Доступ только в пределах того класа где декларирован(метод,поля)
//default ставиться по умолчанию в случае если не указан никакой другой. так же называют модификатор доступа в пакете,
//(все что default доступно в пределах этого пакета)
//protected доступны в пределах одного пакета,так же доступны всем подклассам, которые наследуют этот класс,
// даже если эти подклассы все пакета

    private void technicalMethod(){

    }
}
//В одном java файле должен быть public класс совпадающий с именем файла.
//Не может быть 2х public классов в одном файле
// классы могут быть либо public либо default
class Test2{// если не указываем модификатор то ставиться default
}
