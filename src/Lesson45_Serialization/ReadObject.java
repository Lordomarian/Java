package Lesson45_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/Lesson45_Serialization/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);//класс нужен для считывания данных с файла
            Person person1 = (Person) ois.readObject();//в случае если на компьютере нет класса Person
            // может возникнуть ошибка, также метод возвращает обьекты класса Object и нужно делать Downcasting
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);//выполняеться переопределенный метод toString
            System.out.println(person2);

            ois.close();//обязательно потоковые классы закрывать.
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
