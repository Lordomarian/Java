package Lesson39_40_Exceptions3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

//Checked Exception(compile time exception) проверяймые исключеня.Возникиют во время компиляции
//Unchecked Exception(Runtime exception) Не проверяймые, возникают во время выполнения кода
public class Exceptions3 {
    public void main(String[] args) {
        File file = new File("text.txt");
        try {
            Scanner scanner = new Scanner(file);// это Checked Exception = исключительный случай в работе программе
        } catch (FileNotFoundException e) {
            System.out.println("adsw");
        }
       // int a = 1/0; //это Unchecked Exception это не исключение а ошибка и ее надо убирать а не исправлять
        String name = null ;// еще один пример популярной ошибки
        //name.length();
        int[] arr = new int[2];
        //System.out.println(arr[2]);//под этот элемент не выделена память (выход за размер массива)
        try {
            run();// так как несколько исключенийнужно обрабатывать каждый из них
            //catch (IOException |ParseException e) можно обрабатывать несколько исключений одинково в одном блоке
        } catch (IOException e) {//так же тут испаользуется полиморфизм и можно ловить все исключения классом Exception
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    //так же можно выбрасывать сразу несколько исключений
    public void run() throws IOException, ParseException, IllegalArgumentException{

    }

}
