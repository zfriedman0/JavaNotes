/*
 * The `LinkedList` class is almost identical to the `ArrayList`.
 * 
 * The `LinkedList` stores its items in "containers".
 * The list has a link to the first container and each container has a link to the next container in the list.
 * To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
 */
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        // Add element to the head of the list using `addFirst()`
        cars.addFirst("Peugeot");
        System.out.println(cars);

        // Add element to the end of the list using `addLast()`
        cars.addLast("Opel");
        System.out.println(cars);

        // Remove element at head of list using `removeFirst()`
        cars.removeFirst();
        System.out.println(cars);

        // Remove element at end of list using `removeLast()`
        cars.removeLast();
        System.out.println(cars);

        // Return the first element of the list using `getFirst()`
        System.out.println(cars.getFirst());

        // Return the last element of the list using `getLast()`
        System.out.println(cars.getLast());

        // Return an arbitrary element using `get()`
        System.out.println(cars.get(1));

        // Remove an arbitrary element using `remove()` along with the index
        cars.remove(2);
        System.out.println(cars);
    }
}
