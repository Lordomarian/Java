package Lesson36_Reading_From_File;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Reading_From_File {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;//используется в качестве разделителя в ОС (на mac другой)
        String path = "C:"+separator+"Users\\Lord\\IdeaProjects\\Java\\src\\Lesson36_Reading_From_File\\Text.txt";
        File file = new File("src/Lesson36_Reading_From_File/Text.txt");// в случае если файл лежит в проекте,
        //то можно использовать только путь от папки crc, а не весь путь
        //File file = new File(path);//в параметре указываем путь до файла

        Scanner scanner = new Scanner(file);//читаем данные с файла
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");//используеться для разделения строки
        // при нахождении определенной строчки/символа здесь делят по пробелам
        System.out.println(Arrays.toString(numbersString));
        int[] numbers = new int[3];
        int counter = 0;
        for (String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        while (scanner.hasNextLine()){//выдает true когда нет не считанных строк
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

}
