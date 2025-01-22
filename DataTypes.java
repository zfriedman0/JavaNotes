public class DataTypes {
    public static void main(String[] args) {
        int myNum = 5;
        float myFloat = 5.99f;
        char myChar = 'D';
        boolean myBool = true;
        String myStr = "Hello";

        /*
            Data types are divided into two groups:
                ~ Primitive data types: byte, short, int, long, float, double, boolean, and char
                ~ Non-primitive data types: String, Arrays, and Classes
        
            byte    Stores whole numbers from -128 to 127
            short   Stores whole numbers from -32,768 to 32,767
            int     Stores whole numbers from -2,147,483,648 to 2,147,483,647
            long    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float   Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits.
            double  Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits.
            boolean Stores true or false values.
            char    Stores a single character/letter or ASCII values.
        */

        // `byte` can be used to save memory when you are certain that the value will be within -128 and 127.
        byte myByte = 100;
        System.out.println(myByte);

        short myShort = 5000;
        System.out.println(myShort);

        // In general, `int` is the preferred data type when we create variables with a numeric value.
        int newNum = 100000;
        System.out.println(newNum);

        // `long` is used when `int` is not large enough to store the value.
        // Should end the value with an 'L'.
        long newLong = 15000000000L;
        System.out.println(newLong);

        // Should end `float` and `double` values in 'f' and 'd' respectively.
        // The precision of `float` is only 6 or 7 digits, while `double` has precision of ~16 digits.
        // Therefore, it is safer to use `double` for most calculations.
        float newFloat = 5.75f;
        System.out.println(newFloat);

        double newDouble = 19.99d;
        System.out.println(newDouble);

        // Scientific Numbers
        // A floating point number can also be a scientific number with an 'e' to indicate the power of 10.
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        /* 
            Boolean Data Types
            Very often, we need a data type that can only have one of two values.
                ~ YES / NO
                ~ ON / OFF
                ~ TRUE / FALSE
        */
        boolean isJavaFun = true;
        boolean lightSwitch = false; // a.k.a light is off
        System.out.println(isJavaFun);
        System.out.println(lightSwitch);

        /*
            The `char` data type is used to store a single character.
            The character must be surrounded by single quotes ('A' or 'c').
        */
        char myGrade = 'B';
        System.out.println(myGrade);

        // Alternatively, you can use ASCII values:
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // `String` data type stores a sequence of characters.
        // Must be surrounded by double quotes.
        String greeting = "Hi there!";
        System.out.println(greeting);
    }
}