/**
 * ComparableDemo
 */
import java.util.*;
class Student {
 
    int rollno; 
    String name, address; 
  
    // Constructor 
    public Student(int rollno, String name, String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.rollno + " " + this.name + " " + this.address; 
    } 
    
}
class Sortbyname implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of roll name 
    public int compare(Student a, Student b) 
    { 
        return a.name.compareTo(b.name); 
    } 
} 
class Sortbyroll implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of roll number 
    public int compare(Student a, Student b) 
    { 
        return a.rollno - b.rollno; 
    } 
} 
  
public class ComparableDemo {

    public static void main(String[] args) {
        
        ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student(1, "Abc", "Delhi")); 
        ar.add(new Student(3, "Lmn", "Mumbai")); 
        ar.add(new Student(2, "Xyz", "Chennai")); 
        ar.add(new Student(4, "Pqr", "Goa")); 


        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 

        Collections.sort(ar, new Sortbyroll()); 


        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
    

        Collections.sort(ar, new Sortbyname()); 
    
        System.out.println("\nSorted by name"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
}
    
}