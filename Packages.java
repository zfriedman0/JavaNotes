import java.util.Scanner; // Importing just the `Scanner` class
import java.util.*; // Importing the entire `util` package

public class Packages {
    /*
     * Packages are divided into two categories:
     *  ~ Built-in packages (packages from the Java API)
     *  ~ User-defined packages (create your own packages)
     * 
     * The Java API is a library of prewritten classes included in the Java Development Environment.
     * https://docs.oracle.com/javase/8/docs/api/
     * The library is divided into packages and classes. You can either import a single class, or a whole package that contains all the classes that belong to it.
     * 
     * import package.name.Class; // Syntax to import a single class.
     * import package.name.*; // Syntax to import a whole package.
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter username: ");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        myObj.close();
    }
    
}
