public class ArraysExample {
    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single variable.
        // To declare an array, define the variable type with square brackets.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNums = {10, 20, 30, 40};

        // Can access an array element by referring to its index number.
        System.out.println(cars[0]);
        System.out.println(myNums[3]);

        System.out.println();

        // Can change the value of an element by accessing its index.
        cars[0] = "Renault";
        System.out.println(cars[0]);

        System.out.println();

        // Use the `length` property to find out how many elements an array has.
        System.out.println(cars.length);

        System.out.println();

        // Can loop through the elements of an array using a for loop.
        // Use the `length` property to specify how many times the loop should run.
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println();

        // The for-each loop is used exclusively to loop through elements in arrays.
        // Syntax: for (type variable : arrayName) {}
        for (int i : myNums) {
            System.out.println(i);
        }

        System.out.println();

        /* Real-life Example */
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop Through the elements of the array
        for (int age : ages) {
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average ages is " + avg);

        int lowestAge = ages[0];

        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }

        System.out.println("The lowest age is: " + lowestAge);

        System.out.println();
        /*
            A multidimensional array is an array of arrays.
            Useful when you want to store data in tabular form, like a table with rows and columns.
            To create a two-dimensional array, add each array within its own set of curly braces.
        */
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

        // To access, specify two indexes.
        System.out.println(myNumbers[1][2]);

        // Can also change the values.
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        System.out.println();

        // Can also use a for loop inside another for loop to access elements.
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        System.out.println();

        // Or, could just use a for-each loop.
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}