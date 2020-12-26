package Lesson41_Abstract_classes;

public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }


}
