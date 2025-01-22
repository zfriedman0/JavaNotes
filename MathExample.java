public class MathExample {
    public static void main(String[] args) {
        System.out.println("Math.max(5, 10) = " + Math.max(5, 10)); // Find the greater value
        System.out.println("Math.min(5, 10) = " + Math.min(5, 10)); // Find the lesser value
        System.out.println("Math.sqrt(64) = " + Math.sqrt(64)); // Return the square root
        System.out.println("Math.abs(-4.7) = " + Math.abs(-4.7)); // Return the absolute value
        System.out.println("Math.random() = " + Math.random()); // Return a random number between 0.0 and 1.0

        // To get more control over the random number (e.g. a number between 0 and 100), can do the following:
        int randomNumber = (int)(Math.random() * 101);
        System.out.println("Random number between 0 and 100: " + randomNumber);

    }
}