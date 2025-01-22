public class Booleans {
    public static void main(String[] args) {
        // A boolean is declared with the `boolean` keyword and can only take values `true` and `false`.
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
        System.out.println();

        int x = 10;
        int y = 9;
        System.out.println("Is x = 10 > y = 9? " + (x > y));
        System.out.println("Is 10 > 9? " + (10 > 9));
        System.out.println();

        // Can use == to evaluate if two values are equal.
        int z = 10;
        System.out.println("Is z = 10 == 10? " + (z == 10));
        System.out.println("Is 10 == 15? " + (10 == 15));
        System.out.println();

        // Real-life Example
        int myAge = 26;
        int votingAge = 18;
        System.out.println("My age: " + myAge);
        System.out.println("Voting age: " + votingAge);
        System.out.println("Can I vote? " + (myAge >= votingAge));
        System.out.println();

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote!");
        }

    }
}