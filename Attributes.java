public class Attributes {
    int x = 5; // Attribute of class Attributes
    final int y = 20; // Cannot modify attributes declared with `final` (immutable).
    String fname = "John";
    String lname = "Doe";
    int age = 26;

    public static void main(String[] args) {
        Attributes myObj1 = new Attributes(); // Instantiating an object.
        Attributes myObj2 = new Attributes();
    
        System.out.println(myObj1.x); // Accessing the attribute
        System.out.println(myObj2.y);

        // Can also modify or override attributes.
        myObj1.x = 10;
        System.out.println(myObj1.x);

        // The following will not run.
        // myObj1.y = 25;

        // Modifying the attributes of one object does not affect the attributes of other objects.

        System.out.println("Name: " + myObj2.fname + " " + myObj2.lname);
        System.out.println("Age: " + myObj2.age);


    }
    
}
