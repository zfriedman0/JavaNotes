public class Strings {
    public static void main(String[] args) {
        //A string variable contains a collection of characters surrounded by double quotes:
        String greeting = "Hello World!";

        // A String in Java ia an object.
        // Contains methods that can perform certain operations on strings.
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("txt = " + txt);
        System.out.println("The length of string txt is: " + txt.length());

        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());

        // `indexOf()` method returns the index of the first occurrence of a specified text in a string (including whitespace).
        String str = "Please locate where 'locate' occurs!";
        System.out.println(str.indexOf("locate"));

        // The `+` operator can be used between strings to combine them (concatenation).
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        // Can also use the `concat()` method to concatenate strings.
        System.out.println(firstName.concat(" " + lastName));

        // If you add a number and a string, the result will be a string concatenation.
        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.println(z);

        // The backslash (\) escape character turns special characters into string characters.
        String newStr1 = "We are the so-called \"Vikings\" from the north.";
        String newStr2 = "It\'s alright.";
        String newStr3 = "The character \\ is called backslash.";

        System.out.println(newStr1);
        System.out.println(newStr2);
        System.out.println(newStr3);

        /*
            Other common escape sequences

            Code        Result
            \n          New line
            \r          Carriage return
            \t          Tab
            \b          Backspace
            \f          Form feed
        */
    }
}