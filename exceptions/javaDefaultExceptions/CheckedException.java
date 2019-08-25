
/**
 * CheckedException
 */
import java.io.*;

public class CheckedException {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        fis = new FileInputStream("D:\\Java_examples\\exceptions\\javaDefaultExceptions\\my_file.txt");
        int k;

        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
        fis.close();
    }
}