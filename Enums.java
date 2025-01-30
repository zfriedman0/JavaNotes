/*
 * An `enum` is a special class that represents a group of constants (unchangeable variables).
 */

public class Enums {
    // Can also have an enum inside of a class
    enum Level2 {
        HIGH,
        XHIGH,
        XXHIGH
    }

    public static void main(String[] args) {
        Level1 myVar1 = Level1.MEDIUM;
        System.out.println(myVar1);

        Level2 myVar2 = Level2.XXHIGH;
        System.out.println(myVar2);

        // Enums are often used in `switch` statements to check for corresponding values:
        switch(myVar1) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        // The enum type has a `values()` method, which returns an array of all enum constants.
        // This method is useful when you want to loop through an enum
        for (Level2 myVar : Level2.values()) {
            System.out.println(myVar);
        }
    }
}

enum Level1 {
    LOW,
    MEDIUM,
    HIGH
}
