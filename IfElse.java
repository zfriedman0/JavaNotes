public class IfElse {
    public static void main(String[] args) {
        /*
            Java has the following conditional statements:
                ~ Use `if` to specify a block of code to be executed if a specified condition is true.
                ~ Use `else` to specify a code block to be executed if the same condition is false.
                ~ Use `else if` to specify a new condition to test if the first condition is false.
                ~ Use `switch` to specify many alternative blocks of code to be executed.
        */

        if (20 > 18) {
         System.out.println("20 is greater than 18!");
        }

        int x = 20;
        int y = 18;

        if (x > y) {
         System.out.println("x is greater than y!");
        }

        int time1 = 20;

        if (time1 < 18) {
         System.out.println("Good day.");
        } else {
         System.out.println("Good evening.");
        }

        int time2 = 22;

        if (time2 < 10) {
            System.out.println("Good morning.");
        } else if (time2 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // There is a short-hand if-else, known as the ternary operator.
        // Can replace multiple lines of code in a single line.
        // variable = (condition) ? expressionTrue : expressionFalse;
        int time3 = 20;
        String result = (time3 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}