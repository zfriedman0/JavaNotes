public class Inheritance {
    /*
     * In Java, it is possible to inherit attirubtes and methods from one class to another.
     * Can group the inheritance concept into two categories:
     *  ~ subclass (child) - the class that inherits from another class
     *  ~ superclass (parent) - the class being inherited from
     * 
     * To inherit from a class, use the `extends` keyword.
     */
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

class Vehicle {
    protected String brand = "Ford"; // Vehicle attribute
    public void honk() { // Vehicle method
        System.out.println("Honk, honk!");
    }
}

class Car extends Vehicle { // Car subclass inherits attributes and methods of Vehicle superclass
    protected String modelName = "Mustang"; // Car attribute
}