package com.company;

public class Animal {
    public String name = "some animal";//если сделать private то в наследуемых классах нельзя будет сослаться на эту переменную
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal sleeping");
    }
}

