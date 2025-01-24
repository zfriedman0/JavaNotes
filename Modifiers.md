# Modifiers
The `public` keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods, and constructors.

We divide modifiers into two groups:
    - Access Modifiers - controls the access level.
    - Non-Access Modifiers - do not control access level, but provides other functionality

## Access Modifiers:
For classes...
**Modifier**     **Description**
`public`        The class is accessible by any other class
`default`       The class cannot be used to create objects. Used when you don't specify a modifier.

For attributes, methods, and constructors, you can use the following:
**Modifier**     **Description**
`public`        The code is accessible for all classes.
`private`       The code is only accessible within the declared classes.
`default`       The code is only accessible in the same package. Used when you don't specify a modifier.
`protected`     The code is accessible in the same package and subclasses.

## Non-Access Modifiers
For classes, you can use either `final` or `abstract`:
**Modifier**     **Description**
`final`         The class cannot be inherited by other classes.
`abstract`      The class cannot be used to create objects. (To access an abstract class, it must be inherited from another class.)

For attributes and methods, you can use...
**Modifier**     **Description**
`final`         Attributes and methods cannot be overridden/modified.
`static`        Attributes and methods belongs to the class, rather than an object.
`abstract`      Can only be used in an abstract class, and can only be used on methods. The method does not have a body, it is provided by the subclass (inherited from).
`transient`     Attributes and methods are skipped when serializing the object containing them.
`synchronized`  Methods can only be accessed by one thread at a time.
`volatile`      The value of an attribute is not cached thread-locally, and is always read from the "main memory".

## Final
<code>
public class Main {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 50; // Will generate an error, cannot assign a value to a final variable.
        myObj.PI = 25; // Will also generate an error.
        System.out.println(myObj.x);
    }
}
</code>

## Static
A `static` method means that it can be accessed without creating an object of the class, unlike `public`:
<code>
public class Main {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        myPublicMethod(); // Would generate an error, need an object

        Main myObj = new Main();
        myObj.myPublicMethod(); // Would NOT generate an error.
    }
}
</code>

## Abstract
An `abstract` method belongs to an `abstract` class, and it does not have a body. The body is provided by the subclass:
<code>
// Code from filename: Main.java
// abstract class
abstract class Main {
    public String fname = "John";
    public int age = 24;
    public abstract void study();
}

// Subclass (inherit from Main)
class Student extends Main {
    public int graduationYear = 2018;
    public void study() { // The body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
    public static void main(String[] args) {
        // Create an object of the Student class (which inherits attributes and methods from Main)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation year: " + myObj.graduationYear);
        myObj.study(); // Call abstract method
    }
}
</code>