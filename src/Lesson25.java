import com.company.Animal;

public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();//общие методы для класса animal
        animal.sleep();
        Dog dog = new Dog();//класс dog наследует у animal
        dog.eat();//переопределенный метод в классе dog
        dog.sleep();//наследуемый метод класса dog у animal
        dog.bark();//метод класса dog
        dog.showName();//метод сослался на переменную в классе object
    }
}
