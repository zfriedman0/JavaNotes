public class Constructors {
    /*
     * A constructor is a special method that is used to initialize objects.
     * The constructor is called when an object of a class is created.
     * Can be used to set initial values for object attributes.
     */
    int modelYear; // Create a class attribute.
    String modelName;

    // Create a class constructor for the Constructors class.
    // Constructor name must match the class name.
    // Constructors can take parameters.
    public Constructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors(1965, "Cobra");
        System.out.println(myObj.modelYear + " " + myObj.modelName);
    }
}
