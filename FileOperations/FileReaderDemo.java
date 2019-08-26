import java.io.IOException;
import java.io.FileReader;

/**
 * FileReaderDemo
 */
public class FileReaderDemo {

    public static void main(String[] args) throws IOException {
        
        FileReader fileReader = new FileReader("D:\\Java-Basics\\FileOperations\\data.txt");

        int i; 

        while ((i=fileReader.read()) != -1) 
        System.out.print((char) i); 
    }
}