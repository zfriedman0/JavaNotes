/*
 * Hash Maps store items in key/value pairs.
 * You can access them by an index of another type (e.g. a `String`).
 * One object is used as a key (index) to another object (value).
 * It can store different types: String keys and Integer values, or the same type: String keys and String values.
 */
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values using `put()`
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington D.C.");

        System.out.println(capitalCities);
        System.out.println();

        // Access a value using `get()` and refer to the key
        String capital1 = capitalCities.get("England");
        System.out.println(capital1);
        System.out.println();

        // Remove an item using `remove()` and refer to the key
        capitalCities.remove("England");
        System.out.println(capitalCities);
        System.out.println();

        // Remove all items using `clear()`
        //capitalCities.clear();

        int size = capitalCities.size();
        System.out.println(size);
        System.out.println();

        // Can loop through a HashMap using a for-each loop
        // To loop through keys, use `keySet()`
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        System.out.println();

        // Loop through values using `values()`
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        System.out.println();

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + ", value: " + capitalCities.get(i));
        }

        System.out.println();

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + ", value: " + people.get(i));
        }
    }    
}
