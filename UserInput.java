/*
* The `Scanner` class is used to get user input.
* Found in the `java.util` package.
*/
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name, age, and salary: ");

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        scanner.close();
    }
}
