public class ForLoops {
    public static void main(String[] args) {
        /*
            When you know exactly how many times you want to loop through a block of code, use the `for` loop.

            Syntax
            for (statement 1; statement 2; statement 3) {
                // code to be executed
            }

            Statement 1 is executed once before the execution of the code block.
            Statement 2 defines the condition for executing the code block.
            Statement 3 is executed every iteration of the loop.
        */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        // It is also possible to place `for` loops within each other.
        // Called a nested loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j);
            }
        }

        System.out.println();

        /*
            The "for-each" loop is used exclusively to loop through elements of an array or other data structures.

            Syntax
            for (type variableName : arrayName) {
                // code to be executed
            }
        */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}