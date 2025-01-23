public class BreakContinue {
    public static void main(String[] args) {
        // The `break` statement can be used to break out of a loop.
        System.out.println("Break Example (For loop):");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println();

        // The `continue` statement breaks one iteration of the loop if a specified condition occurs.
        // The loop continues with the next iteration.
        System.out.println("Continue Example (For loop):");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        // Can also use `break` and `continue` in a while loop:
        int i = 0;
        System.out.println("Break Example (While loop):");
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        System.out.println();
        
        int j = 0;
        System.out.println("Continue Example (While loop):");
        while (j < 10) {
            if (j == 4) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}
