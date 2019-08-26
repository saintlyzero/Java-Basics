import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReaderDemo
 */
public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        
        File file = new File("D:\\Java-Basics\\FileOperations\\data.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String st;

        while ((st = bufferedReader.readLine()) != null) {
            System.out.println(st);
        }
    }
}