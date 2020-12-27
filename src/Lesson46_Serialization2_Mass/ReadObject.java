package Lesson46_Serialization2_Mass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/Lesson46_Serialization2_Mass/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);//класс нужен для считывания данных с файла
          //  Person person1 = (Person) ois.readObject();//в случае если на компьютере нет класса Person
            // может возникнуть ошибка, также метод возвращает обьекты класса Object и нужно делать Downcasting
           // Person person2 = (Person) ois.readObject();
            int personCount = ois.readInt();//считываем число обозначающее размер массива
                //Способ 1 считывание массива по очередно
            Person[] people = new Person[personCount];//создаем массив размера записанного до этого в файл числа

            for (int i = 0; i <personCount; i++){
             people[i] = (Person) ois.readObject();//в пустой массив записываем обьекты класса Person
            }
            ;
            System.out.println(Arrays.toString(people));

            //способ 2 считывание сразу всего массива как обьект
            Person[] people1 =  (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people1));
            ois.close();//обязательно потоковые классы закрывать.
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
