public class Methods {
    
    /*
    * A method is a block of code which only runs when it is called.
    * You can pass data, a.k.a. parameters, into a method.
    * Methods are used to perform certain actions, and they are known as functions.
    * Why use methods? To reuse code: define the code once, and use it many times.
    */

    // A method must be declared within a class.
    // Defined with the name of the method, followed by parentheses.
    static void myMethod1() {
        // `static` means that the method belongs to the Main class and not an object of the main class.
        // `void` means that this method does not have a return value.
        System.out.println("I just got executed!");
    }

    // Information can be passed to methods as a parameter.
    // Parameters act as variables inside the method.
    // Can add as many parameters as we want.
    static void myMethod2(String fname, int age) {
        System.out.println(fname + " Refsnes is " + age + " years old.");
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    //If you want the method to have a return value, can use a primitive data type instead of `void` and use the `return` keyword inside the method.
    static boolean checkEven(int x) {
        return (x % 2) == 0;
    }

    static int sumNums(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod1();
        myMethod2("Liam", 20);
        checkAge(20);
        System.out.println(checkEven(14));
        System.out.println(sumNums(1965783, 25823));

        // Can also store the result in a variable
        int z = sumNums(10, 95);
        System.out.println(z);
    }
}
