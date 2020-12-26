package Lesson33_Generics;
//введение в параметризацию
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal ourAnimal = new Animal();
        //////так было до java 5 где нет параметризации //////
        List animals = new ArrayList();//здесь возвращаеться обьекты класса object, а не String
        animals.add("cat");//поэтому сюда мы можем положить любой обьект
        animals.add("dog"); //даже свой собственный
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);//выполняем Downcasting чтобы не было ошибки из за разных типов данных
        System.out.println(animal);
        /////с появлением параметризации(Generics)////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog"); //1
        animals2.add("frog");
       // animals2.add(ourAnimal); после параметризации уже не можем положить обьект другого типа.

        String animal2 = animals2.get(1);
        //////////Java7+//////
        List<String> animal3 = new ArrayList<>();// можено не указывать с правой стороны тип данных
    }
}
class Animal {

}