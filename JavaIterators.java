/*
 * An iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
 * To use an iterator, must import from `java.util`
 */
import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterators {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it1 = cars.iterator();

        System.out.println(it1.next());
        System.out.println();

        // Looping through a collection
        while(it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println();

        // Removing items
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> it2 = numbers.iterator();

        while(it2.hasNext()) {
            Integer i = it2.next();
            if(i < 10) {
                it2.remove();
            }
        }
        System.out.println(numbers);
    }
}
