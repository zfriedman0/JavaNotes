/*
 * Wrapper classes provide a way to use primitive data types as objects.
 * Must use wrapper  classes when working with Collection objectswhere primitive types cannot be used.
 */
public class WrapperClasses {
    public static void main(String[] args) {
        Integer myInt = 500;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        System.out.println();

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        System.out.println();

        // Can convert wrapper objects to strings using `toString()`
        String myString = myInt.toString();
        System.out.println(myString);
        System.out.println(myString.length());
    }
}
