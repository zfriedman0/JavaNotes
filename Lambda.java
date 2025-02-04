/*
 * A Lambda expression is a short block of code which takes parameters and returns a value.
 * Similar to methods, but do not need a name.
 * Can be implemented in the mody of a method.
 * 
 * Simplest lambda expression contains a single parameter and an expression:
 *  `parameter -> expression`
 * 
 * To use more than one parameter, wrap them in parentheses:
 *  `(parameter1, parameter2) -> expression`
 * 
 * Expressions must immediately return a value and cannot contain variables, assignments, or statements such as `if` or `for`.
 * To perform more complex operations, a code block can be used with curly braces.
 * If the expression needs to return a value, the code block should have a return statement.
 *  `(parameter1, parameter2) -> { code block }`
 */
public class Lambda {
    interface StringFunction {
        String run(String str);
    }

    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
