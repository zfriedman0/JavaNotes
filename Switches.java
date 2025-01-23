public class Switches {
    public static void main(String[] args) {
        /*
            Instead of writing many if-else statements, can use a `switch` statement.
            Selects one of many code blocks to be executed.

            This is how it works:
                ~ The `switch` expression is evaluated once
                ~ The value of the expression is compared with the values of each `case`
                ~ If there is a match, the associated block of code is executed
                ~ The `break` and `default` keywords are optional
        */

        int day = (int)(Math.random() * 8);

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Oops!");
                break;
        }

        // When Java reaches a `break` statement, it breaks out of the `switch` statement.
        // The `default` keyword specifies some code to run if there is no case match.

    }
}