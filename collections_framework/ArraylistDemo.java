/**
 * ArraylistDemo
 */

import java.util.*;
public class ArraylistDemo {

    public static void main(String[] args) {
        
        ArrayList employess = new ArrayList();

        // Add elements
        employess.add("Ramesh");
        employess.add("Suresh");
        employess.add("Mahesh");
        employess.add(20);
        employess.add(10.5);


        // Iterate elements
        for (int i = 0; i < employess.size(); i++) {
            System.out.println(employess.get(i));
        }
        // Iterate using Iterator
        Iterator itr=employess.iterator();  
        System.out.println("\nIterate using Iterator");
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  

        // Add element at index
        employess.add(2, "Kamlesh");

        System.out.println("\nUpdated list");
        for (int i = 0; i < employess.size(); i++) {
            System.out.println(employess.get(i));
        }

        // Check whether a element is present
        boolean res = employess.contains("Kamlesh");
        System.out.println("\nArraylist contains 'Kamlesh' ? "+res);


        // Get index of element
        int position = employess.indexOf("Ramesh");
        System.out.println("\nIndex of 'Ramesh' ? "+position);


        // Remove element
        employess.remove("Kamlesh");
        res = employess.contains("Kamlesh");
        System.out.println("\nArraylist contains 'Kamlesh' ? "+res);


        // Remove element at index
        employess.remove(2);


        // Remove all elements
        employess.clear();
        boolean empty = employess.isEmpty();
        System.out.println("\nArraylist isEmpty ? "+empty);


    }
}