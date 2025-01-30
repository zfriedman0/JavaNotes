public class Interfaces {
    /*
     * Interfaces are another way to achieve abstraction in Java.
     * An `interface` is a completely abstract class that is used to group related methods with empty bodies.
     */
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}

interface Animal {
    public void animalSound();
    public void sleep();
}

/*
 * To access the interface methods, the interface must be imlemented by another class with the `implements` keyword (instead of `extends`).
 * The body of the interface method is provided by the implementing class.
 */
class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: oui oui");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

/*
 * Like abstract classes, interfaces cannot be used to create objects.
 * Interface methods do not have a body - the body is provided by the implementing class.
 * On implementation of an interface, you must override all of its methods.
 * Interface methods are by default `abstract` and `public`.
 * Interface attributes are by default `public`, `static`, and `final`.
 * An interface cannot contain a constructor (since it cannot be used to create objects).
 */

// Java does not support multiple inheritance (a class can only inherit from one superclass).
// However, it can be achieved with interfaces because the class can implement multiple interfaces.
interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Implementing first interface...");
    }

    public void myOtherMethod() {
        System.out.println("Implementing second interface...");
    }
}
