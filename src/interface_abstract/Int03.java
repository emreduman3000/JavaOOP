package interface_abstract;



interface Test2
{
    interface Yes
    {
        void show();
    }
}

class Testing2 implements Int04.Yes
{
    public void show()
    {
        System.out.println("show method of interface");
    }
}

public class Int03
{
    public static void main(String[] args)
    {
        Int04.Yes obj;
        Testing t = new Testing();
        obj = t;
        obj.show();
    }
}