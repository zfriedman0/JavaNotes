/*
* The `ArrayList` class is a resizable array found in the `java.util` package.
* The difference between a built-in array and an `ArrayList` is that the size of an array cannot be modified.
* Elements can be added and removed from an `ArrayList` whenever. 
*/
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object.

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        System.out.println(cars);

        // Can also add an item at a specified position by referring to the index number.
        cars.add(0, "Audi");

        System.out.println(cars);

        // Access an item using the `get()` method.
        String firstCar = cars.get(0);
        System.out.println(firstCar);

        // Change an item using the `set()` method.
        cars.set(1, "Mercedes-Benz");
        System.out.println(cars.get(1));

        // Remove an item using the `remove()` method.
        cars.remove(3);
        System.out.println(cars);

        // Remove all elements using the `clear()` method.
        //cars.clear();
        //System.out.println(cars);

        // Find out how many elements an ArrayList has using the `size()` method.
        int sizeOfCars = cars.size();
        System.out.println(sizeOfCars);

        // Loop through elements of an ArrayList using the `size()` method.
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // Can also loop through using a for-each loop.
        for (String i : cars) {
            System.out.println(i);
        }

        // Elements in an ArrayList are objects.
        // To use other types, such as int, you must specify an quivalent wrapper class: `Integer` for int, `Boolean` for booleans, `Character` for chars, `Double` for doubles, etc.
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        for (int i : myNumbers) {
            System.out.println(i);
        }

        // The `Collections` class from `java.util` includes the `sort()` method for sorting lists alphabetically or numerically.
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }

        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
