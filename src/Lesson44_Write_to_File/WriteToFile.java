package Lesson44_Write_to_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("src/Lesson44_Write_to_File/TestFile");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Test Row one");
        pw.println("Test pow two");
        pw.close();
    }
}
