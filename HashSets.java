/*
 * A `HashSet` is a collection of items where every item is unique, and it is in the `java.util` package
 */
import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        // Add items using `add()`
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);
        System.out.println();

        // Check if an item exists using `contains()`
        System.out.println(cars.contains("Mazda"));
        System.out.println();

        // Remove an item using `remove()`
        cars.remove("Volvo");

        // Remove all items using `clear()`
        //cars.clear()\

        System.out.println(cars.size());
        System.out.println();

        // Lopp through a HashSet using a for-each loop
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println();

        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(20);
        numbers.add(13);
        numbers.add(2);

        for (int i : numbers) {
            if (i <= 10) {
                System.out.println(i);
            }
        }
    }
}
