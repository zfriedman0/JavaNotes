public class Threads extends Thread {
    public void run() {
        System.out.println("This code is running in a thread");
    }

    public static void main(String[] args) {
        Threads thread = new Threads();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
}
