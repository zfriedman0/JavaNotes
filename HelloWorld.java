public class HelloWorld {
    // Every line of code that runs in Java must be inside a class.
    // Class name should always start with an uppercase letter.
    // Name of .java file must match class name.
    public static void main(String[] args) {
        // main() method is required.
        // Any code inside main() will be executed.
        // Every program must contain the main() method
        System.out.println("Hello world!"); // Text must be wrapped in double quotes.

        System.out.print("I will print on the same line."); // The print() method does not insert a new line at the end of output.

        // Can also print numbers.
        // Don't put numbers inside quotes.
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);

        // Can also perform calculations.
        System.out.println(3 + 3);
        System.out.println(2 * 5);

        /*
            This is a multi-line comment.
            This text gets ignored, just like single-line comments.
        */
    }
}