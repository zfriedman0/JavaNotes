public class WhileLoops {
    public static void main(String[] args) {
        // Loops can execute a block of code as long as a specified condition is reached.
        // Loops are handy because they save time, reduce errors, and make code more readable.

        // The `while` loop loops through a block of code as long as a specified condition evaluates to `true`.
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println();

        // The do-while loop is a variant of the `while` loop.
        // Will execute the code block once, before checking if the condition is true, then repeat the loop as long as the condition is true.
        int k = 5;
        do {
            System.out.println("k = " + k);
            k++;
        }
        while (k < 10);

        System.out.println();

        //Real-life Example
        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice++;
        }
    }
}