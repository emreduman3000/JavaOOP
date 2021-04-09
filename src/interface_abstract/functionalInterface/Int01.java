package interface_abstract.functionalInterface;

public class Int01 {

// Java program to demonstrate functional interface

    public static void main(String args[])
    {
        // create anonymous inner class object
        // public Thread(Runnable target) {
        //        this(null, target, "Thread-" + nextThreadNum(), 0);}
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
    }
}

//A functional interface is an interface that contains only one abstract method.
// They can have only one functionality to exhibit.
// From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
// A functional interface can have any number of default methods.
// Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
//Before Java 8, we had to create anonymous inner class objects or implement these interfaces.

//@FunctionalInterface
//public interface Runnable {
//    /**
//     * When an object implementing interface {@code Runnable} is used
//     * to create a thread, starting the thread causes the object's
//     * {@code run} method to be called in that separately executing
//     * thread.
//     * <p>
//     * The general contract of the method {@code run} is that it may
//     * take any action whatsoever.
//     *
//     * @see     java.lang.Thread#run()
//     */
//    public abstract void run();
//}

//A functional interface is an interface that contains only one abstract method.
// They can have only one functionality to exhibit.
// From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
// A functional interface can have any number of default methods.
// Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
//Before Java 8, we had to create anonymous inner class objects or implement these interfaces.