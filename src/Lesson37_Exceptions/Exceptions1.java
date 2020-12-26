package Lesson37_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args)/* throws FileNotFoundException */{//используеться для обработки исключений
        File file = new File("src/Lesson36_Reading_From_File/Text.txt");
        try {//вариант обработки исключений попробовать, если не получиться то выполнить catch
            Scanner scanner = new Scanner(file);
            //в блоке try после исключения код не выполняется
            System.out.println("после scanner");//если исключение не появилось то код работает нормально
        } catch (FileNotFoundException e) {//+ можно прописать свою логику обработки исключений
           // e.printStackTrace();
            System.out.println("Файл не найден");
        }
        System.out.println("После блока тry catch");//после обработки исключения код работает дальше
        try {
            readFile(); //Кроме всех методов где может появиться исключение, мы дожлжны обработать его и во всех
        } catch (FileNotFoundException e) {
            System.out.println("обработка исключение в методе main");
        }
        //классах и методах где мы вызываем метод с исключением
    }

    public static void readFile() throws FileNotFoundException {// мы должны обрабоать исключение в каждом методе
        //где оно может вызваться.
        File file = new File("2sddfsa");
        Scanner scanner = new Scanner(file);
    }
}
