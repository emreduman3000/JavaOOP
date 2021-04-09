package interface_abstract;


class Test
{
    interface Yes
    {
        void show();
    }
}

class Testing implements Int04.Yes
{
    public void show()
    {
        System.out.println("show method of interface");
    }
}

public class Int02
{
    public static void main(String[] args)
    {
        //Int02.Yes obj;
        //        Testing t = new Testing();
        //        obj=t;
        //        obj.show();

        Int04.Yes testing= new Testing();
        testing.show();

    }
}