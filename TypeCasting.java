public class TypeCasting {
    public static void main(String[] args) {
        /*
            Type casting is assigning a value of one primitive data type to another.

            In Java, there are two types of casting:
                ~ Widening Casting (automatically) - converting a smaller type to a larger size type.
                    byte > short > char > int > long > float > double
                ~ Narrowing Casting (manually) - converting a larger type to a smaller size type.
                    double > float > long > int > char > short > byte
        */

        //Widening casting is done automatically when passing a smaller size type to a larger size type.
        int myInt1 = 9;
        double myDouble1 = myInt1;

        System.out.println("Widening casting int to double:");
        System.out.println("As int: " + myInt1);
        System.out.println("As double: " + myDouble1);
        System.out.println();

        // Narrowing casting must be done manually by placing the type in parentheses in front of the value.
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;

        System.out.println("Narrowing casting double to int:");
        System.out.println("As double: " + myDouble2);
        System.out.println("As int: " + myInt2);
        System.out.println();

        // Real-life example
        int maxScore = 500;
        int userScore = 423;

        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("Real-life Example");
        System.out.println("maxScore (int): " + maxScore);
        System.out.println("userScore (int): " + userScore);
        System.out.println("Percentage score (float): " + percentage);
    }
}