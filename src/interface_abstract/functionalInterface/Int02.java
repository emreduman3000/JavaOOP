package interface_abstract.functionalInterface;

// Java program to demonstrate lamda expressions to implement
// a user defined functional interface.

@FunctionalInterface
interface Square
{
    int calculate(int x);
}

public class Int02
{
    public static void main(String args[])
    {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x)->x*x;
        //Woaaw, I dont have to override a method by using lambda

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}