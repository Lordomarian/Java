package com.company;

public class Lesson19 {
    public static void main(String[] args){
        Human human1 = new Human("bob", 18 );
        Human h2 = new Human("Nik",20);
        //human1.getInfo();
        //Human.description ="nice";
       // human1.getAllFields();
        //Human.description = "bad";
       // h2.getAllFields();
       // Human.getDescription();
        Human.printNumberOfPeople();
        Human h3 = new Human( "Ron", 35 );
        Human.printNumberOfPeople();
    }

}
class Human{

    private String name;
    private int age;
    public static String description;
    private static int countPeople;

    public Human(){//пустой конструктор, создается в случае если не указал другой ( в теле класса пусто)
        this.name = "имя по умолчанию";
        this.age = 0;
    }
    
    public Human (String name, int age){ // конструктор класса, при создании обьекта всегда создается
        //даже если он не прописан, то создается пустой конструктор, нужен чтобы обьекту присваивали
        //обязательные переменные, и не оставляли их пустыми.
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName (String name) {this.name = name;}//стандартная конструкция сетер
    //служит для того чтобы пользователь не мог напрямую обращаться к переменным класса
    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}// гетер, нужен для того чтобы возвращать значение переменных.
    public int getAge() {return age;}

    public void getInfo(){ System.out.println(name +", " + age);}

    public static void getDescription(){
        System.out.println(description);
    }
    public void getAllFields(){
        System.out.println(name +", " + age + ", " + description);
        //обычные методы могут работать как сстатическими переменными так и с не статическими
    }
    public static void printAllFields(){
       // System.out.println(name +", " + age + ", " + description);
        //статический метод не может работать с не статическими переменными
    }
    public static void printNumberOfPeople(){
        System.out.println("Number of people = " + countPeople);
    }
}