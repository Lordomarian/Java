package Lesson46_Serialization2_Mass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1,"Bob"),new Person(2,"Mike"),new Person(3,"Tom")};

        try {//класс FOS нужен для побайтовой записи в файл данных(звук картинка и др)
            FileOutputStream fos = new FileOutputStream("src/Lesson46_Serialization2_Mass/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);//этот класс более узкий и нужен для записи обьектов
            //но для работы ему нужен обьект класса FOS
         //чтобы записать массив в файл существует 2 способа
            //способ 1 :
            oos.writeInt(people.length);//узнаем размер массива, и записываем его в файл
            for (Person person : people){
                oos.writeObject(person);//записываем каждый обьект массива в файл
            }
            //способ 2 запись массива как обьект
            oos.writeObject(people);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
