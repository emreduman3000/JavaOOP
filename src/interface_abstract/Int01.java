package interface_abstract;

    interface In1
    {
        final int a = 10;//final by default
        static void display()
        {
            System.out.println("hello");
        }
    }

    // A class that implements the interface.
    class Int01 implements In1
    {
        // Driver Code
        public static void main (String[] args)
        {
            In1.display();
        }
    }

//New features added in interfaces in JDK 9
//From Java 9 onwards, interfaces can contain following also
//
//Static methods
//Private methods
//Private Static methods
