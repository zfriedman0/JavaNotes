public class ClassMethods {
    // Static method - it can be accessed without creating an object of the class
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects.");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating an object.");
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is " + maxSpeed + " mph!");
    }

    public static void main(String[] args) {
        myStaticMethod(); // Calling a static method.

        ClassMethods myObj = new ClassMethods(); // Must declare an object to call a public method.
        myObj.myPublicMethod();

        ClassMethods car = new ClassMethods();
        car.fullThrottle();
        car.speed(200);
    }
}
