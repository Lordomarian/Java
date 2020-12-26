package com.company;

public class Object_ToString {
    public static void main(String[] args){
        String s1 = "Hello";
        System.out.println(s1);
        Human h1 = new Human("Bob",25);
        System.out.println(h1);
        h1.toString();
    }
}
/* Все классы заимствуют методы у класса object, поэтому выводя обьект класса Human выводится его хешкод
(скрыто используется метот h1.toSting())
тк все классы заимствуются у класса object то  h1 это обьект сразу двух классов object и Human
*/
class Human {
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){ // Здесь мы переопределили метод toString, который унаследовался у класса ObjectБ
        return name+", "+age;//теперь при вызове используется наш метод
    }
}