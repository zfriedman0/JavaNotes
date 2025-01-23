public class Scope {
    public static void main(String[] args) {
        // Variables are only accessible inside the region they are created.
        // This is called scope.
        // Variables declared directly inside a method are available anywhere in the method following the line in which they are declared.

        // Code here cannot use x

        int x = 100;

        // Code here can use x
        System.out.println(x);

        System.out.println();

        // Block Scope
        // A block refers to all of the code between curly braces {}.
        // Variables declared inside blocks of code are only accessible by the code between the curly braces, which follows the line in which the variable was declared.

        {
            // Code here cannot use y

            int y = 5000;

            // Code here can use y

            System.out.println(y);
        }

        System.out.println();

        // Code here cannot use i
        for (int i = 0; i <= 50; i += 5) {
            // Code here can use i
            System.out.println(i);
        }
    }  
}
