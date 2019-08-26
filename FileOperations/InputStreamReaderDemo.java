/**
 * InputStreamReaderDemo
 */
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class InputStreamReaderDemo {

    public static void main(String[] args) throws FileNotFoundException,IOException{
       
        InputStream inputstream = new FileInputStream("D:\\Java-Basics\\FileOperations\\data.txt");

        int data = inputstream.read();
        while(data != -1) {
            System.out.print((char)data);
            data = inputstream.read();
        }
        inputstream.close();
    }
}