package Lesson34_Wildcards_Generics;

public class Animal {
    private int id;
    public Animal(){

    }
    public void eat(){
        System.out.println("Animal is eating");

    }
    public Animal(int id){
        this.id = id;
    }
    public String toString(){
        return String.valueOf(id);
    }
}
