public class Overloading {
    // With method overloading, multiple methods can have the same name with different paramenters.
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    //Instead of defining two methods that do the same thing, it is better to overload one.
    // Below, we overload the plusMethod to work for both int and double.
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        /* Non-overloaded functions */
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);

        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        System.out.println();

        /* Overloaded functions */
        int myNum3 = plusMethod(10, 20);
        double myNum4 = plusMethod(9.5, 3.681);

        System.out.println("int: " + myNum3);
        System.out.println("double: " + myNum4);
    }
    
}
