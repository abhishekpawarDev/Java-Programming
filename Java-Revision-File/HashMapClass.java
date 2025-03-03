import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Apple");
        map.put(3, "Apple");
        map.put(4, "Apple");
        map.put(5, "Apple");
        map.put(6, "Apple");

        // Printing the HashMap
        System.out.println(map);

        // Accessing values
        System.out.println("Value for key 2: " + map.get(2));

        // Checking if a key exists
        System.out.println("Contains key 3? " + map.containsKey(3));

         // Removing an entry
         map.remove(3);

         // Iterating over HashMap
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

            
    }
}
