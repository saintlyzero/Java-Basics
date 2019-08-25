/**
 * HashMapDemo
 */
import java.util.*;

import com.sun.xml.internal.fastinfoset.util.CharArray;
public class HashMapDemo {

    public static void main(String[] args) {
        
        HashMap<Character,String> hashMap = new HashMap<>();

        // Add emelents
        hashMap.put('R', "Ramesh");
        hashMap.put('S', "Suresh");
        hashMap.put('M', "Mahesh");
        hashMap.put('K', "Kamlesh");
        hashMap.put(null, "Demo");

        // Display Key-Value pair
        System.out.println(hashMap);

        // Get all Keys of HashMap
        Object[] keys = hashMap.keySet().toArray();
        System.out.print("\nkeys: ");
        for (int i = 0; i < keys.length; i++) {
            System.out.print(keys[i]+" ");
        }

        // Check it map contains a Key
        boolean present = hashMap.containsKey('S');
        System.out.println("\n\nHashMap contains key 'S' ? "+present);


        // Get Value at Key
        String value = hashMap.get('S');
        System.out.println("\nValue at key 'S' ? "+value);

        
        // Update Value of key
        hashMap.put('S',"Sameer");
        System.out.println("\n"+hashMap);


        // Remove Element
        hashMap.remove('S');
        System.out.println("\n"+hashMap);


        // Remove all Elements
        hashMap.clear();
        System.out.println("\n"+hashMap);

    }
    
}