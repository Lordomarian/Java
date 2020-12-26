package Lesson34_Wildcards_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOFDog = new ArrayList<>();
        listOFDog.add(new Dog());
        listOFDog.add(new Dog());

        test(listOfAnimal);
        //test(listOFDog);
        test1(listOfAnimal);
        test1(listOFDog);
    }

    //этот метот принимает только Массив в обьектами Animal внутри, даже если от него наследуют классы,
    // то полиморфизм не работает
    private static void test(List<Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }/*иерархия наследования
        Object -
            Animal
                Dog
        когда используем extends можем подать данные классов animal и все потомки этого класса
        List<? super Animal> list
        когда используем super то мы можем подать данные только родителей класса Animal. в нашем случае это Object
    */

    //чтобы Полиморфизм сработал нужно использовать вместо верхнего примера конструкцию <?> ( это Wildcard)
    //но при этом в этот метод теперь передаются любые обьекты. так как туда теперь передаются все обьекты класса object
    //private static void test1(List<?> list){ чтобы можно было использовать методы отличные от методов класса object
    //используем следующую контрукцию
    private static void test1(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
            animal.eat();
        }
    }
}