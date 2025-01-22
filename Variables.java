public class Variables {
    public static void main(String[] args) {
        // Syntax: type variableName = value
        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        // Can also declare a variable without assigning t he value, and assign the value later.
        int newNum;
        newNum = 20;
        System.out.println(newNum);

        // If you assign a new value to an existing variable, it will overwrite the previous value.
        newNum = 30;
        System.out.println(newNum);

        /*
            Final Variables:
            If you don't want to overwrite existing values, use the `final` keyword.
            This declares the variable as 'final' or 'constant', which means it is unchangeable and read only.
        */
       final int finalNum = 45;
       //finalNum = 20; // This will generate an error.

       // Data Types
       float myFloat = 5.99f;
       char myChar = 'D';
       boolean myBool = true;
       String myStr = "Hello";

       System.out.println("myNum: " + myNum);
       System.out.println("myFloat: " + myFloat);
       System.out.println("myChar: " + myChar);
       System.out.println("myBool: " + myBool);
       System.out.println("myStr: " + myStr);

       System.out.println("Hello " + name);

       // Can use the `+` operator to add a variable to another variable
       String firstName = "Jane";
       String lastName = "Doe";
       String fullName = firstName + " " + lastName;
       System.out.println(fullName);

       // For numeric values, the `+` operator works as a mathematical operator.
       int x = 5;
       int y = 6;
       System.out.println(x + y);

       // Can declare multiple variables of the same type in a comma-separated list.
       int a = 5, b = 6, c = 50;
       System.out.println(a + b + c);

       // Can also assign the same value to multiple variables in one line.
       int d, e, f;
       d = e = f = 90;
       System.out.println(d + e + f);

       /*
            All Java variables must be identified with unique names.
            These unique names are called identifiers.
            Can be short names (x, y) or descriptive names (age, sum, totalVolume).
       */
      int minutesPerHour = 60;

      /*
        Names can contain letters, digits, underscores, and dollar signs.
        Names must begin with a letter.
        Names should start with a lowercase letter, and cannot contain whitespace.
        Names can begin with $ and _.
        Names are case-sensitive ("myVar" and "myvar" are different variables).
        Reserved words (Java keywords such as `int` or `boolean`) cannot be used as names.
      */

     // Calculate the area of a rectangle:
     int width = 4;
     int length = 6;
     int area;

     area = length * width;

     System.out.println("Width: " + width);
     System.out.println("Length: " + length);
     System.out.println("Area: " + area);
    }
}