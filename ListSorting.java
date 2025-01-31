/*
 * The `Collections` class from `java.util` includes a `sort()` method for sorting lists alphabetically or numerically.
 */
import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {
    public static void main(String[] args) {
        // Sorting strings
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);

        System.out.println();

        for (String i : cars) {
            System.out.println(i);
        }

        // Sorting integers
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        System.out.println();

        Collections.sort(myNumbers);

        for (int i : myNumbers) {
            System.out.println(i);
        }

        System.out.println();

        // Reverse sorting strings
        Collections.sort(cars, Collections.reverseOrder());

        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println();

        Collections.sort(myNumbers, Collections.reverseOrder());

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
