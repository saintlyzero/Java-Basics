/**
 * StackDemo
 */
import java.util.*;
public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();  

        stack.push("Ayush");  
        stack.push("Garvit");  
        stack.push("Amit");  
        stack.push("Ashish");  
        stack.push("Garima");  

        // Iterate stack
        Iterator<String> itr=stack.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
        

        // Get element at the Top
        String top = stack.peek();
        System.out.println("\nElement at Top: "+top+"\n");


        // Remove element from Top of Stack
        stack.pop(); 
         
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}