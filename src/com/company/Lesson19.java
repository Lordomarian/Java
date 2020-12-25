package com.company;

public class Lesson19 {
    public static void main(String[] args){
        Human human1 = new Human("bob", 18 );
        human1.getInfo();
    }

}
class Human{

    private String name;
    private int age;

    public Human(){
        this.name = "имя по умолчанию";
        this.age = 0;
    }
    
    public Human (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName (String name) { this.name = name;}
    public void setAge(int age) { this.age = age;}

    public String getName() {return name;}
    public int getAge() {return age;}

    public void getInfo(){ System.out.println(name +", " + age);}
}