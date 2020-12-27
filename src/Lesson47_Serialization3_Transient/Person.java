package Lesson47_Serialization3_Transient;

import java.io.Serializable;

public class Person  implements Serializable {
    private static final long serialVersionUID = 6811593151482412004L;
    //serialVersionUID необходим на случай если у нас есть записанный файл , а программа уже изменилась
    //и поменялись/добавились какие то поля в классе. в таком случае мы не сможем считать обьекты из этого класса
    //тк класс уже другой. код нужен чтобы следить за этим, и его нужно генерировать каждый раз когда класс меняется.
    private transient int id;
    private transient String name;// transient Нужно чтобы выделить поле которое не нужно сериализовывать
    //в файле Ссылочные типы данных будут заменены на Null а приметивные такие как int будут равны 0
    private int age;
    public Person(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
