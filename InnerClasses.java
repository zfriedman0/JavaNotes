public class InnerClasses {
    /*
     * It is possible to nest classes in Java.
     * The purpose is to group classes that belong together, making code more readable and maintainable.
     * To access the inner class, create an object of the outer class, then create an object of the inner class.
     */
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass1 myInner1 = myOuter.new InnerClass1();
        System.out.println(myInner1.y + myOuter.x);

        //OuterClass.InnerClass2 myInner2 = myOuter.new InnerClass2();
        //System.out.println(myInner2.y + myOuter.x); // This will throw an error

        OuterClass.InnerClass3 myInner3 = new OuterClass.InnerClass3();
        System.out.println(myInner3.y);
    }
    
}

class OuterClass {
    int x = 10;

    class InnerClass1 {
        int y = 5;
    }

    // Unlike a regular class, inner classes can be `private` or `protected`.
    // If you don't want outside objects to access the inner class, declare the class as private.
    private class InnerClass2 {
        int y = 3;
    }

    // An inner class can also be `static`, meaning you can access it without creating an object of the outer class.
    static class InnerClass3 {
        int y = 6;
    }

}
