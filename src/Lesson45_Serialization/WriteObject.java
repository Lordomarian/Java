package Lesson45_Serialization;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Bob");
        Person person2 = new Person(2,"Mike");

        try {//класс FOS нужен для побайтовой записи в файл данных(звук картинка и др)
            FileOutputStream fos = new FileOutputStream("src/Lesson45_Serialization/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);//этот класс более узкий и нужен для записи обьектов
            //но для работы ему нужен обьект класса FOS
            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
