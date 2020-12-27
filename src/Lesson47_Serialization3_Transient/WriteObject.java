package Lesson47_Serialization3_Transient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person =  new Person(1," Bob");
        //это называется try with resources
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Lesson47_Serialization3_Transient/people.bin"))){
            //после java7 можем использовать метот обьявления сразу после try как показано выше, и в такой случае
            //поток автоматически закроется и нам не нужно его закрывать вручную
            //это называется try with resources
            //класс FOS нужен для побайтовой записи в файл данных(звук картинка и др)
          //  FileOutputStream fos = new FileOutputStream("src/Lesson47_Serialization3_Transient/people.bin");
           // ObjectOutputStream oos = new ObjectOutputStream(fos);//этот класс более узкий и нужен для записи обьектов
            //но для работы ему нужен обьект класса FOS

            oos.writeObject(person);
          //  oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
