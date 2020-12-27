package Lesson47_Serialization3_Transient;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/Lesson47_Serialization3_Transient/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);//класс нужен для считывания данных с файла
            Person person1 = (Person) ois.readObject();//в случае если на компьютере нет класса Person
            // может возникнуть ошибка, также метод возвращает обьекты класса Object и нужно делать Downcasting
           // Person person2 = (Person) ois.readObject();
            System.out.println(person1);
            ois.close();//обязательно потоковые классы закрывать.
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
