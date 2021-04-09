package patterns;

public class SingletonClassTest {

    /*
    Singleton Pattern
    Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
    The singleton class must provide a global access point to get the instance of the class.
    Singleton pattern is used for logging, drivers objects, caching and thread pool.
    Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
    Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.
     */
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingletonClass object = SingletonClass.getInstance();
        //AN object created by getInstance() Method

        //show the message
        object.showMessage();
        System.out.println(object.s="assaas");
        System.out.println(object.s);
        //System.out.println(String a="ascasd");compileTime Error



        // instantiating Singleton class with variable x
        SingletonClass x = SingletonClass.getInstance();

        // instantiating Singleton class with variable y
        SingletonClass y = SingletonClass.getInstance();

        // instantiating Singleton class with variable z
        SingletonClass z = SingletonClass.getInstance();

        // changing variable of instance x
        x.s = x.s.toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // changing variable of instance z
        z.s = z.s.toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);

    }

}
