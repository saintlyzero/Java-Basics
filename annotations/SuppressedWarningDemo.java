/**
 * SuppressedWarningDemo
 */
import java.util.*;
public class SuppressedWarningDemo {

    @SuppressWarnings("unchecked")   // Removes warnings at compile time
    public static void main(String[] args) {
        
        ArrayList list=new ArrayList();  
        list.add("Alan");  
        list.add("Jhon");  
        list.add("Peter");  

        for(Object obj:list)  
            System.out.println(obj);  
    }
}