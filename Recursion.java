public class Recursion {
    /*
     * Recursion is the technique of making a function call itself.
     * This technique provides a way to break complicated problems down into simpler ones.
     */
    public static void main(String[] args) {
        // Adding two numbers together is easy to do.
        // Adding a range of numbers is more complicated.
        // Here, recursion is used to add a range of numbers by breaking it down into the simple task of adding two numbers.
        int result = sum(10);
        System.out.println(result);

        System.out.println();

        int newResult = newSum(5, 10);
        System.out.println(newResult);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else { // Base case
            return 0;
        }

        /*
         * 10 + sum(9)
         * 10 + (9 + sum(8))
         * 10 + (9 + (8 + sum(7)))
         * ...
         * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
         * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
         */
    }

    public static int newSum(int start, int end) {
        if (end > start) {
            return end + newSum(start, end - 1);
        } else { // Base case
            return end;
        }
    }
    
}
