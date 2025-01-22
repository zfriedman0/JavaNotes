public class Operators {
    public static void main(String[] args) {
        // Operators are used to perform operations on variables and values.
        int x = 100 + 50;

        // The `+` operator can be used to add values together.
        // Can add together a variable and a value:
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;

        // Can add a variable and a variable:
        int sum3 = sum2 + sum2;

        /*
            Java divides operators into the following groups:
             ~ Arithmetic operators
             ~ Assignment operators
             ~ Comparison operators
             ~ Logical operators
             ~ Boolean Operators

             +      Addition        Adds two values together            x + y
             -      Subtraction     Subtracts one value from another    x - y
             *      Multiplication  Multiplies two values               x * y
             /      Division        Divides one value by another        x / y
             %      Modulus         Returns the division remainder      x % y
             ++     Increment       Increases the value by 1            ++x
             --     Decrement       Decreases the value by 1            --x
        */

        // Assignment operators assign values to variables
        int y = 10;

        // The addition assignment operator adds a value to a variable:
        y += 5;

        /*
            Assignment Operators

            Operator    Example     Same As
            =           x = 5       x = 5
            +=          x += 3      x = x + 3
            -=          x -= 3      x = x - 3
            *=          x *= 3      x = x * 3
            /=          x /= 3      x = x / 3
            %=          x %= 3      x = x % 3
            &=          x &= 3      x = x & 3
            |=          x |= 3      x = x | 3
            ^=          x ^= 3      x = x ^ 3
            >>=         x >>= 3     x = x >> 3
            <<=         x <<= 3     x = x << 3
        */

        // Comparison operators are used to compare two values or variables.
        // The return value of a comparison is either `true` or `false` (booleans).
        int a = 5;
        int b = 3;
        System.out.println(a > b);

        /*
            Comparison Operators

            Operator    Name                        Example
            ==          Equal to                    x == y
            !=          Not equal to                x != y
            >           Greater than                x > y
            <           Less than                   x < y
            >=          Greater than or equal to    x >= y
            <=          Less than or equal to       x <= y
        */

        /*
            Logical Operators

            Operator        Name            Description                                             Example
            &&              Logical and     Returns true if both statements are true                x < 5 && x < 10
            ||              Logical or      Returns true if one of the statements is true           x < 5 || x < 4
            !               Logical not     Reverse the result, returns false if result is true     !(x < 5 && x < 10)
        */
    }
}