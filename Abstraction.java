public class Abstraction {
    /*
     * Abstraction is the process of hiding certain details and showing only essential information to the user.
     * Can be achieved with either abstract classes or interfaces.
     * The `abstract` keyword is a non-access modifier, used for classes and methods:
     *  ~ Abstract class: is a restricted class that cannot be used to create objects.
     *  ~ Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
     * 
     * An abstract class can have both abstract and regular methods.
     */
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass, inherit from Animal
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() method is provided here
        System.out.println("The pig says: oui oui");
    }
}
